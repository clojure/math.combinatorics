{:namespaces
 ({:doc
   "Efficient, functional algorithms for generating lazy\nsequences for common combinatorial functions. (See the source code \nfor a longer description.)",
   :author "Mark Engelberg",
   :name "clojure.math.combinatorics",
   :wiki-url "http://clojure.github.io/math.combinatorics/index.html",
   :source-url
   "https://github.com/clojure/math.combinatorics/blob/5ade6ceb370e8290b1c6978da800aca892cd68a3/src/main/clojure/clojure/math/combinatorics.clj"}),
 :vars
 ({:raw-source-url
   "https://github.com/clojure/math.combinatorics/raw/5ade6ceb370e8290b1c6978da800aca892cd68a3/src/main/clojure/clojure/math/combinatorics.clj",
   :name "assert-with-message",
   :file "src/main/clojure/clojure/math/combinatorics.clj",
   :source-url
   "https://github.com/clojure/math.combinatorics/blob/5ade6ceb370e8290b1c6978da800aca892cd68a3/src/main/clojure/clojure/math/combinatorics.clj#L91",
   :line 91,
   :var-type "macro",
   :arglists ([x message]),
   :doc
   "Clojure 1.2 didn't allow asserts with a message, so we roll our own here for backwards compatibility",
   :namespace "clojure.math.combinatorics",
   :wiki-url
   "http://clojure.github.io/math.combinatorics//index.html#clojure.math.combinatorics/assert-with-message"}
  {:raw-source-url
   "https://github.com/clojure/math.combinatorics/raw/5ade6ceb370e8290b1c6978da800aca892cd68a3/src/main/clojure/clojure/math/combinatorics.clj",
   :name "cartesian-product",
   :file "src/main/clojure/clojure/math/combinatorics.clj",
   :source-url
   "https://github.com/clojure/math.combinatorics/blob/5ade6ceb370e8290b1c6978da800aca892cd68a3/src/main/clojure/clojure/math/combinatorics.clj#L218",
   :line 218,
   :var-type "function",
   :arglists ([& seqs]),
   :doc "All the ways to take one item from each sequence",
   :namespace "clojure.math.combinatorics",
   :wiki-url
   "http://clojure.github.io/math.combinatorics//index.html#clojure.math.combinatorics/cartesian-product"}
  {:raw-source-url
   "https://github.com/clojure/math.combinatorics/raw/5ade6ceb370e8290b1c6978da800aca892cd68a3/src/main/clojure/clojure/math/combinatorics.clj",
   :name "combinations",
   :file "src/main/clojure/clojure/math/combinatorics.clj",
   :source-url
   "https://github.com/clojure/math.combinatorics/blob/5ade6ceb370e8290b1c6978da800aca892cd68a3/src/main/clojure/clojure/math/combinatorics.clj#L187",
   :line 187,
   :var-type "function",
   :arglists ([items t]),
   :doc
   "All the unique ways of taking t different elements from items",
   :namespace "clojure.math.combinatorics",
   :wiki-url
   "http://clojure.github.io/math.combinatorics//index.html#clojure.math.combinatorics/combinations"}
  {:raw-source-url
   "https://github.com/clojure/math.combinatorics/raw/5ade6ceb370e8290b1c6978da800aca892cd68a3/src/main/clojure/clojure/math/combinatorics.clj",
   :name "count-combinations",
   :file "src/main/clojure/clojure/math/combinatorics.clj",
   :source-url
   "https://github.com/clojure/math.combinatorics/blob/5ade6ceb370e8290b1c6978da800aca892cd68a3/src/main/clojure/clojure/math/combinatorics.clj#L509",
   :line 509,
   :var-type "function",
   :arglists ([items t]),
   :doc "(count (combinations items t)) but computed more directly",
   :namespace "clojure.math.combinatorics",
   :wiki-url
   "http://clojure.github.io/math.combinatorics//index.html#clojure.math.combinatorics/count-combinations"}
  {:raw-source-url
   "https://github.com/clojure/math.combinatorics/raw/5ade6ceb370e8290b1c6978da800aca892cd68a3/src/main/clojure/clojure/math/combinatorics.clj",
   :name "count-permutations",
   :file "src/main/clojure/clojure/math/combinatorics.clj",
   :source-url
   "https://github.com/clojure/math.combinatorics/blob/5ade6ceb370e8290b1c6978da800aca892cd68a3/src/main/clojure/clojure/math/combinatorics.clj#L357",
   :line 357,
   :var-type "function",
   :arglists ([l]),
   :doc "Counts the number of distinct permutations of l",
   :namespace "clojure.math.combinatorics",
   :wiki-url
   "http://clojure.github.io/math.combinatorics//index.html#clojure.math.combinatorics/count-permutations"}
  {:raw-source-url
   "https://github.com/clojure/math.combinatorics/raw/5ade6ceb370e8290b1c6978da800aca892cd68a3/src/main/clojure/clojure/math/combinatorics.clj",
   :name "count-subsets",
   :file "src/main/clojure/clojure/math/combinatorics.clj",
   :source-url
   "https://github.com/clojure/math.combinatorics/blob/5ade6ceb370e8290b1c6978da800aca892cd68a3/src/main/clojure/clojure/math/combinatorics.clj#L531",
   :line 531,
   :var-type "function",
   :arglists ([items]),
   :doc "(count (subsets items)) but computed more directly",
   :namespace "clojure.math.combinatorics",
   :wiki-url
   "http://clojure.github.io/math.combinatorics//index.html#clojure.math.combinatorics/count-subsets"}
  {:raw-source-url
   "https://github.com/clojure/math.combinatorics/raw/5ade6ceb370e8290b1c6978da800aca892cd68a3/src/main/clojure/clojure/math/combinatorics.clj",
   :name "drop-permutations",
   :file "src/main/clojure/clojure/math/combinatorics.clj",
   :source-url
   "https://github.com/clojure/math.combinatorics/blob/5ade6ceb370e8290b1c6978da800aca892cd68a3/src/main/clojure/clojure/math/combinatorics.clj#L450",
   :line 450,
   :var-type "function",
   :arglists ([items n]),
   :doc "(drop n (permutations items)) but calculated more directly.",
   :namespace "clojure.math.combinatorics",
   :wiki-url
   "http://clojure.github.io/math.combinatorics//index.html#clojure.math.combinatorics/drop-permutations"}
  {:raw-source-url
   "https://github.com/clojure/math.combinatorics/raw/5ade6ceb370e8290b1c6978da800aca892cd68a3/src/main/clojure/clojure/math/combinatorics.clj",
   :name "nth-combination",
   :file "src/main/clojure/clojure/math/combinatorics.clj",
   :source-url
   "https://github.com/clojure/math.combinatorics/blob/5ade6ceb370e8290b1c6978da800aca892cd68a3/src/main/clojure/clojure/math/combinatorics.clj#L569",
   :line 569,
   :var-type "function",
   :arglists ([items t n]),
   :doc "The nth element of the sequence of t-combinations of items",
   :namespace "clojure.math.combinatorics",
   :wiki-url
   "http://clojure.github.io/math.combinatorics//index.html#clojure.math.combinatorics/nth-combination"}
  {:raw-source-url
   "https://github.com/clojure/math.combinatorics/raw/5ade6ceb370e8290b1c6978da800aca892cd68a3/src/main/clojure/clojure/math/combinatorics.clj",
   :name "nth-permutation",
   :file "src/main/clojure/clojure/math/combinatorics.clj",
   :source-url
   "https://github.com/clojure/math.combinatorics/blob/5ade6ceb370e8290b1c6978da800aca892cd68a3/src/main/clojure/clojure/math/combinatorics.clj#L432",
   :line 432,
   :var-type "function",
   :arglists ([items n]),
   :doc "(nth (permutations items)) but calculated more directly.",
   :namespace "clojure.math.combinatorics",
   :wiki-url
   "http://clojure.github.io/math.combinatorics//index.html#clojure.math.combinatorics/nth-permutation"}
  {:raw-source-url
   "https://github.com/clojure/math.combinatorics/raw/5ade6ceb370e8290b1c6978da800aca892cd68a3/src/main/clojure/clojure/math/combinatorics.clj",
   :name "partitions",
   :file "src/main/clojure/clojure/math/combinatorics.clj",
   :source-url
   "https://github.com/clojure/math.combinatorics/blob/5ade6ceb370e8290b1c6978da800aca892cd68a3/src/main/clojure/clojure/math/combinatorics.clj#L916",
   :line 916,
   :var-type "function",
   :arglists ([items & args]),
   :doc
   "All the lexicographic distinct partitions of items.\nOptionally pass in :min and/or :max to specify inclusive bounds on the number of parts the items can be split into.",
   :namespace "clojure.math.combinatorics",
   :wiki-url
   "http://clojure.github.io/math.combinatorics//index.html#clojure.math.combinatorics/partitions"}
  {:raw-source-url
   "https://github.com/clojure/math.combinatorics/raw/5ade6ceb370e8290b1c6978da800aca892cd68a3/src/main/clojure/clojure/math/combinatorics.clj",
   :name "permutation-index",
   :file "src/main/clojure/clojure/math/combinatorics.clj",
   :source-url
   "https://github.com/clojure/math.combinatorics/blob/5ade6ceb370e8290b1c6978da800aca892cd68a3/src/main/clojure/clojure/math/combinatorics.clj#L628",
   :line 628,
   :var-type "function",
   :arglists ([items]),
   :doc
   "Input must be a sortable collection of items.  Returns the n such that\n(nth-permutation (sort items) n) is items.",
   :namespace "clojure.math.combinatorics",
   :wiki-url
   "http://clojure.github.io/math.combinatorics//index.html#clojure.math.combinatorics/permutation-index"}
  {:raw-source-url
   "https://github.com/clojure/math.combinatorics/raw/5ade6ceb370e8290b1c6978da800aca892cd68a3/src/main/clojure/clojure/math/combinatorics.clj",
   :name "permutations",
   :file "src/main/clojure/clojure/math/combinatorics.clj",
   :source-url
   "https://github.com/clojure/math.combinatorics/blob/5ade6ceb370e8290b1c6978da800aca892cd68a3/src/main/clojure/clojure/math/combinatorics.clj#L290",
   :line 290,
   :var-type "function",
   :arglists ([items]),
   :doc
   "All the distinct permutations of items, lexicographic by index \n(special handling for duplicate items).",
   :namespace "clojure.math.combinatorics",
   :wiki-url
   "http://clojure.github.io/math.combinatorics//index.html#clojure.math.combinatorics/permutations"}
  {:raw-source-url
   "https://github.com/clojure/math.combinatorics/raw/5ade6ceb370e8290b1c6978da800aca892cd68a3/src/main/clojure/clojure/math/combinatorics.clj",
   :name "selections",
   :file "src/main/clojure/clojure/math/combinatorics.clj",
   :source-url
   "https://github.com/clojure/math.combinatorics/blob/5ade6ceb370e8290b1c6978da800aca892cd68a3/src/main/clojure/clojure/math/combinatorics.clj#L238",
   :line 238,
   :var-type "function",
   :arglists ([items n]),
   :doc
   "All the ways of taking n (possibly the same) elements from the sequence of items",
   :namespace "clojure.math.combinatorics",
   :wiki-url
   "http://clojure.github.io/math.combinatorics//index.html#clojure.math.combinatorics/selections"}
  {:raw-source-url
   "https://github.com/clojure/math.combinatorics/raw/5ade6ceb370e8290b1c6978da800aca892cd68a3/src/main/clojure/clojure/math/combinatorics.clj",
   :name "subsets",
   :file "src/main/clojure/clojure/math/combinatorics.clj",
   :source-url
   "https://github.com/clojure/math.combinatorics/blob/5ade6ceb370e8290b1c6978da800aca892cd68a3/src/main/clojure/clojure/math/combinatorics.clj#L212",
   :line 212,
   :var-type "function",
   :arglists ([items]),
   :doc "All the subsets of items",
   :namespace "clojure.math.combinatorics",
   :wiki-url
   "http://clojure.github.io/math.combinatorics//index.html#clojure.math.combinatorics/subsets"})}
