(ns clojure.math.test-combinatorics
  (:require
    #?(:clj [clojure.test :refer :all]
       :cljs [cljs.test :refer-macros [deftest is are testing run-tests]])
    [clojure.math.combinatorics :as sut]))

(deftest test-combinations
  (are [x y] (= x y)
             (sut/combinations [1 2 3] 2) '((1 2) (1 3) (2 3))))

(defn old-subsets [l]
  (map (partial map deref) (sut/subsets (map atom l))))

(deftest test-subsets
  (are [x y] (= x y)
             (sut/subsets []) '(())
             (sut/subsets [1 2 3]) '(() (1) (2) (3) (1 2) (1 3) (2 3) (1 2 3))
             (sut/subsets [3 2 1]) '(() (3) (2) (1) (3 2) (3 1) (2 1) (3 2 1))
             (sut/subsets [1 2 3 4]) '(() (1) (2) (3) (4) (1 2) (1 3) (1 4) (2 3) (2 4) (3 4) (1 2 3) (1 2 4) (1 3 4) (2 3 4) (1 2 3 4))
             (sut/subsets [1 1 2]) (sut/subsets [1 2 1])
             (sut/subsets [1 3 2 3]) (sut/subsets [1 3 3 2]))
  (are [x] (and (= (sut/subsets x) (distinct (old-subsets x)))
                (= (count (sut/subsets x)) (sut/count-subsets x)))
           []
           [1 2 3 4]
           [1 1 2 2 2 3]
           [1 1 1 2 2 3]
           [1 1 1 1 1]
           [1 2 2 3 3 3]
           [1 1 2 2 3 3]
           [1 1 1 2 2 2]
           [1 2 2 2 3 3]
           [1 1 1 1 2 2]
           [1 2 3 3 4 4]
           [1 1 2 3 3 4]))

(deftest test-nth-combination
  (are [x]
    (every?
      (fn [t]
        (and (= (sut/count-combinations x t) (count (sut/combinations x t)))
             (let [c (sut/count-combinations x t)]
               (= (for [i (range c)] (sut/nth-combination x t i))
                  (sut/combinations x t)))))
      (range (inc (count x))))
    [1 2 3 4]
    []
    [1 2 2 3 3 3]
    [1 1 1 2 2 3]
    [1 2 2 2 3 3]
    [1 1 1 2 3 3]
    [1 1 2 3 3 3]
    [1 2 3 1 2 1]
    [\a \b \c]
    [\a \b \c \a \b \c]
    ))

(deftest test-nth-subset
  (are [x]
    (let [c (sut/count-subsets x)]
      (= (for [i (range c)] (sut/nth-subset x i))
         (sut/subsets x)))
    [1 2 3 4]
    []
    [1 2 2 3 3 3]
    [1 1 1 2 2 3]
    [1 2 2 2 3 3]
    [1 1 1 2 3 3]
    [1 1 2 3 3 3]
    [1 2 3 1 2 1]
    [\a \b \c]
    [\a \b \c \a \b \c]))

(deftest test-cartesian-product
  (are [x y] (= x y)
             (sut/cartesian-product [1 2] [3 4]) '((1 3) (1 4) (2 3) (2 4))))

(deftest test-selections
  (are [x y] (= x y)
             (sut/selections [1 2] 3) '((1 1 1) (1 1 2) (1 2 1) (1 2 2) (2 1 1) (2 1 2) (2 2 1) (2 2 2))))

(def lex-permutations @#'clojure.math.combinatorics/lex-permutations)

(deftest test-permutations
  (are [x y] (= x y)
             (sut/permutations [1 2 3]) '((1 2 3) (1 3 2) (2 1 3) (2 3 1) (3 1 2) (3 2 1))
             (sut/permutations [2 3 1]) '((2 3 1) (2 1 3) (3 2 1) (3 1 2) (1 2 3) (1 3 2))
             (sut/permutations [1 1 2]) (lex-permutations [1 1 2])
             (sut/permutations [:a :b]) [[:a :b] [:b :a]]
             (sut/permutations [2 1 1]) [[2 1 1] [1 2 1] [1 1 2]]))

(deftest test-lex-permutations
  (are [x y] (= x y)
             (lex-permutations [1 1 2]) '([1 1 2] [1 2 1] [2 1 1])))

(def sorted-numbers? @#'clojure.math.combinatorics/sorted-numbers?)

(deftest test-sorted-numbers?
  (are [x y] (= x y)
             (sorted-numbers? [1 2 3]) true
             (sorted-numbers? [1 1 2]) true
             (sorted-numbers? []) true
             (sorted-numbers? [1 4 2]) false
             (sorted-numbers? [1 :a 2]) false))

(def factorial-numbers @#'clojure.math.combinatorics/factorial-numbers)

(deftest test-factorial-numbers
  (are [x y] (= (factorial-numbers x) y)
             463 [3 4 1 0 1 0]
             0 []
             1 [1 0]
             2 [1 0 0]))

(def nth-permutation-distinct @#'clojure.math.combinatorics/nth-permutation-distinct)

(deftest test-nth-permutation-distinct
  (let [perms (sut/permutations (range 4))]
    (doseq [i (range 24)]
      (is (= (nth perms i) (sut/nth-permutation-distinct (range 4) i))))))

(def nth-permutation-duplicates  @#'clojure.math.combinatorics/nth-permutation-duplicates)

(deftest test-nth-permutation-duplicates
  (let [perms (sut/permutations [1 1 2 2 2 3])]
    (doseq [i (range 60)]
      (is (= (nth perms i) (sut/nth-permutation-duplicates [1 1 2 2 2 3] i))))))

(deftest test-count-permutations
  (are [x] (= (sut/count-permutations x) (count (sut/permutations x)))
           (range 4)
           [1 1 2]
           [1 1 2 2]
           [1 1 1 2 2 3]))

(deftest test-nth-permutation
  (let [sortedDistinctNumbers (range 4)
        sortedDuplicateNumbers [1 1 1 2 3 3]
        distinctChars [\a \b \c \d]
        duplicates [\a \a \b \c \c]
        duplicates2 [1 3 1 2 1 2]]
    (doseq [collection [sortedDistinctNumbers
                        sortedDuplicateNumbers
                        distinctChars
                        duplicates
                        duplicates2],
            :let [perms (sut/permutations collection)
                  c (count perms)]
            n (range c)]
      (is (= (nth perms n) (sut/nth-permutation collection n)))
      (is (= c (sut/count-permutations collection))))))

(deftest test-drop-permutations
  (doseq [x [[1 2 3]
             [1 1 2]
             [\a \b \c]
             [\a \a \b \c \c]
             [1 3 1 2 1 2]]
          :let [c (sut/count-permutations x)]
          i (range c)]
    (is (= (sut/drop-permutations x i) (drop i (sut/permutations x))))))

(deftest test-permutation-index
  (let [sortedDistinctNumbers (range 4)
        sortedDuplicateNumbers [1 1 1 2 3 3]
        distinctChars [\a \b \c \d]
        duplicates [\a \a \b \c \c]
        duplicates2 [1 3 1 2 1 2]]
    (doseq [collection [sortedDistinctNumbers
                        sortedDuplicateNumbers
                        distinctChars
                        duplicates
                        duplicates2],
            perm (sut/permutations collection)]
      (is (= (sut/nth-permutation (sort collection) (sut/permutation-index perm))
             perm)))))

(deftest test-partitions
  (do (are [x y] (= x y)
                 (sut/partitions [1 2 3]) '(([1 2 3]) ([1 2] [3]) ([1 3] [2]) ([1] [2 3]) ([1] [2] [3]))
                 (sut/partitions [1 2]) '(([1 2]) ([1] [2]))
                 (sut/partitions [1]) '(([1]))
                 (sut/partitions []) '(())
                 (sut/partitions nil) '(())
                 (sut/partitions [1 1 1]) '(([1 1 1]) ([1 1] [1]) ([1] [1] [1]))
                 (sut/partitions [1 1 2]) '(([1 1 2]) ([1 1] [2]) ([1 2] [1]) ([1] [1] [2])))
      (doseq [num-items (range 0 4)
              lo (range -1 (+ 2 num-items))
              hi (range -1 (+ 2 num-items))]
        (is (= (sut/partitions (range num-items) :min lo :max hi)
               (filter #(<= lo (count %) hi) (sut/partitions (range num-items)))))) ; tests partitions-H
      (doseq [num-items (range 2 4)
              lo (range -1 (+ 2 num-items))
              hi (range -1 (+ 2 num-items))]
        (is (= (sut/partitions (cons 0 (range (dec num-items))) :min lo :max hi)
               (filter #(<= lo (count %) hi) (sut/partitions (cons 0 (range (dec num-items)))))))))) ; tests partitions-M
