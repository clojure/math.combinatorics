;;; combinatorics.clj: efficient, functional algorithms for generating lazy
;;; sequences for common combinatorial functions.

;; by Mark Engelberg (mark.engelberg@gmail.com)
;; Last updated - October 24, 2011

(comment
"  
(combinations items n) - A lazy sequence of all the unique
ways of taking n different elements from items.
Example: (combinations [1 2 3] 2) -> ((1 2) (1 3) (2 3))

(subsets items) - A lazy sequence of all the subsets of
items (but generalized to all sequences, not just sets).
Example: (subsets [1 2 3]) -> (() (1) (2) (3) (1 2) (1 3) (2 3) (1 2 3))

(cartesian-product & seqs) - Takes any number of sequences
as arguments, and returns a lazy sequence of all the ways
to take one item from each seq.
Example: (cartesian-product [1 2] [3 4]) -> ((1 3) (1 4) (2 3) (2 4))
(cartesian-product seq1 seq2 seq3 ...) behaves like but is
faster than a nested for loop, such as:
(for [i1 seq1 i2 seq2 i3 seq3 ...] (list i1 i2 i3 ...))

(selections items n) - A lazy sequence of all the ways to
take n (possibly the same) items from the sequence of items.
Example: (selections [1 2] 3) -> ((1 1 1) (1 1 2) (1 2 1) (1 2 2) (2 1 1) (2 1 2) (2 2 1) (2 2 2))

(permutations items) - A lazy sequence of all the permutations
of items.
Example: (permutations [1 2 3]) -> ((1 2 3) (1 3 2) (2 1 3) (2 3 1) (3 1 2) (3 2 1))
Example: (permutations [1 1 2]) -> ((1 1 2) (1 2 1) (2 1 1))

About this code:
These combinatorial functions can be written in an elegant way using recursion.  However, when dealing with combinations and permutations, you're usually generating large numbers of things, and speed counts.  My objective was to write the fastest possible code I could, restricting myself to Clojure's functional, persistent data structures (rather than using Java's arrays) so that this code could be safely leveraged within Clojure's transactional concurrency system.

I also restricted myself to algorithms that return results in a standard order.  For example, there are faster ways to generate cartesian-product, but I don't know of a faster way to generate the results in the standard nested-for-loop order.

Most of these algorithms are derived from algorithms found in Knuth's wonderful Art of Computer Programming books (specifically, the volume 4 fascicles), which present fast, iterative solutions to these common combinatorial problems.  Unfortunately, these iterative versions are somewhat inscrutable.  If you want to better understand these algorithms, the Knuth books are the place to start.
"
)


(ns
  #^{:author "Mark Engelberg",
     :doc "Efficient, functional algorithms for generating lazy
sequences for common combinatorial functions. (See the source code 
for a longer description.)"}
  clojure.math.combinatorics)

(defn- index-combinations
  [n cnt]
  (lazy-seq
   (let [c (vec (cons nil (for [j (range 1 (inc n))] (+ j cnt (- (inc n)))))),
	 iter-comb
	 (fn iter-comb [c j]
	   (if (> j n) nil
	       (let [c (assoc c j (dec (c j)))]
		 (if (< (c j) j) [c (inc j)]
		     (loop [c c, j j]
		       (if (= j 1) [c j]
			   (recur (assoc c (dec j) (dec (c j))) (dec j)))))))),
	 step
	 (fn step [c j]
	   (cons (rseq (subvec c 1 (inc n)))
		 (lazy-seq (let [next-step (iter-comb c j)]
			     (when next-step (step (next-step 0) (next-step 1)))))))]
     (step c 1))))

(defn combinations
  "All the unique ways of taking n different elements from items"
  [items n]      
  (let [v-items (vec (reverse items))]
    (if (zero? n) (list ())
	(let [cnt (count items)]
	  (cond (> n cnt) nil
		(= n cnt) (list (seq items))
		:else
		(map #(map v-items %) (index-combinations n cnt)))))))

(defn subsets
  "All the subsets of items"
  [items]
  (mapcat (fn [n] (combinations items n))
	  (range (inc (count items)))))

(defn cartesian-product
  "All the ways to take one item from each sequence"
  [& seqs]
  (let [v-original-seqs (vec seqs)
	step
	(fn step [v-seqs]
	  (let [increment
		(fn [v-seqs]
		  (loop [i (dec (count v-seqs)), v-seqs v-seqs]
		    (if (= i -1) nil
			(if-let [rst (next (v-seqs i))]
			  (assoc v-seqs i rst)
			  (recur (dec i) (assoc v-seqs i (v-original-seqs i)))))))]
	    (when v-seqs
	       (cons (map first v-seqs)
		     (lazy-seq (step (increment v-seqs)))))))]
    (when (every? seq seqs)
      (lazy-seq (step v-original-seqs)))))


(defn selections
  "All the ways of taking n (possibly the same) elements from the sequence of items"
  [items n]
  (apply cartesian-product (take n (repeat items))))


(defn- iter-perm [v]
  (let [len (count v),
	j (loop [i (- len 2)]
	     (cond (= i -1) nil
		   (< (v i) (v (inc i))) i
		   :else (recur (dec i))))]
    (when j
      (let [vj (v j),
	    l (loop [i (dec len)]
		(if (< vj (v i)) i (recur (dec i))))]
	(loop [v (assoc v j (v l) l vj), k (inc j), l (dec len)]
	  (if (< k l)
	    (recur (assoc v k (v l) l (v k)) (inc k) (dec l))
	    v))))))

(defn- vec-lex-permutations [v]
  (when v (cons v (lazy-seq (vec-lex-permutations (iter-perm v))))))

(defn lex-permutations
  "DEPRECATED as a public function.

In prior versions of the combinatorics library, there were two similar functions: permutations and lex-permutations.  It was a source of confusion to know which to call.  Now, you can always call permutations.  When appropriate (i.e., when you pass in a sorted sequence of numbers), permutations will automatically call lex-permutations as a speed optimization."
  {:deprecated "1.3"}
  [c]
  (lazy-seq
   (let [vec-sorted (vec (sort c))]
     (if (zero? (count vec-sorted))
       (list [])
       (vec-lex-permutations vec-sorted)))))

(defn- sorted-numbers?
  "Returns true iff s is a sequence of numbers in non-decreasing order"
  [s]
  (and (every? number? s)
       (every? (partial apply <=) (partition 2 1 s))))

(defn- multi-perm
  "Handles the case when you want the permutations of a list with duplicate items."
  [l]
  (let [f (frequencies l),
        v (vec (keys f)),
        indices (apply concat
                       (for [i (range (count v))]
                         (repeat (f (v i)) i)))]
    (map (partial map v) (lex-permutations indices))))
  
(defn permutations
  "All the distinct permutations of items, lexicographic by index."
  [items]
  (cond
   (sorted-numbers? items) (lex-permutations items),

   (apply distinct? items)
   (let [v (vec items)]
     (map #(map v %) (lex-permutations (range (count v)))))

   :else
   (multi-perm items)))
