{:namespaces
 ({:doc
   "Efficient, functional algorithms for generating lazy\nsequences for common combinatorial functions. (See the source code \nfor a longer description.)",
   :author "Mark Engelberg",
   :name "clojure.math.combinatorics",
   :wiki-url "http://clojure.github.io/math.combinatorics/index.html",
   :source-url nil}),
 :vars
 ({:raw-source-url
   "https://github.com/clojure/math.combinatorics/raw/4c3d26eec2206e09b8b8c305bfed921966bce6f6/src/main/clojure/clojure/math/combinatorics.cljc",
   :name "cartesian-product",
   :file "src/main/clojure/clojure/math/combinatorics.cljc",
   :source-url
   "https://github.com/clojure/math.combinatorics/blob/4c3d26eec2206e09b8b8c305bfed921966bce6f6/src/main/clojure/clojure/math/combinatorics.cljc#L208",
   :line 208,
   :var-type "function",
   :arglists ([& seqs]),
   :doc "All the ways to take one item from each sequence",
   :namespace "clojure.math.combinatorics",
   :wiki-url
   "http://clojure.github.io/math.combinatorics//index.html#clojure.math.combinatorics/cartesian-product"}
  {:raw-source-url
   "https://github.com/clojure/math.combinatorics/raw/4c3d26eec2206e09b8b8c305bfed921966bce6f6/src/main/clojure/clojure/math/combinatorics.cljc",
   :name "combinations",
   :file "src/main/clojure/clojure/math/combinatorics.cljc",
   :source-url
   "https://github.com/clojure/math.combinatorics/blob/4c3d26eec2206e09b8b8c305bfed921966bce6f6/src/main/clojure/clojure/math/combinatorics.cljc#L177",
   :line 177,
   :var-type "function",
   :arglists ([items t]),
   :doc
   "All the unique ways of taking t different elements from items",
   :namespace "clojure.math.combinatorics",
   :wiki-url
   "http://clojure.github.io/math.combinatorics//index.html#clojure.math.combinatorics/combinations"}
  {:raw-source-url
   "https://github.com/clojure/math.combinatorics/raw/4c3d26eec2206e09b8b8c305bfed921966bce6f6/src/main/clojure/clojure/math/combinatorics.cljc",
   :name "count-combinations",
   :file "src/main/clojure/clojure/math/combinatorics.cljc",
   :source-url
   "https://github.com/clojure/math.combinatorics/blob/4c3d26eec2206e09b8b8c305bfed921966bce6f6/src/main/clojure/clojure/math/combinatorics.cljc#L496",
   :line 496,
   :var-type "function",
   :arglists ([items t]),
   :doc "(count (combinations items t)) but computed more directly",
   :namespace "clojure.math.combinatorics",
   :wiki-url
   "http://clojure.github.io/math.combinatorics//index.html#clojure.math.combinatorics/count-combinations"}
  {:raw-source-url
   "https://github.com/clojure/math.combinatorics/raw/4c3d26eec2206e09b8b8c305bfed921966bce6f6/src/main/clojure/clojure/math/combinatorics.cljc",
   :name "count-permutations",
   :file "src/main/clojure/clojure/math/combinatorics.cljc",
   :source-url
   "https://github.com/clojure/math.combinatorics/blob/4c3d26eec2206e09b8b8c305bfed921966bce6f6/src/main/clojure/clojure/math/combinatorics.cljc#L345",
   :line 345,
   :var-type "function",
   :arglists ([l]),
   :doc "Counts the number of distinct permutations of l",
   :namespace "clojure.math.combinatorics",
   :wiki-url
   "http://clojure.github.io/math.combinatorics//index.html#clojure.math.combinatorics/count-permutations"}
  {:raw-source-url
   "https://github.com/clojure/math.combinatorics/raw/4c3d26eec2206e09b8b8c305bfed921966bce6f6/src/main/clojure/clojure/math/combinatorics.cljc",
   :name "count-subsets",
   :file "src/main/clojure/clojure/math/combinatorics.cljc",
   :source-url
   "https://github.com/clojure/math.combinatorics/blob/4c3d26eec2206e09b8b8c305bfed921966bce6f6/src/main/clojure/clojure/math/combinatorics.cljc#L518",
   :line 518,
   :var-type "function",
   :arglists ([items]),
   :doc "(count (subsets items)) but computed more directly",
   :namespace "clojure.math.combinatorics",
   :wiki-url
   "http://clojure.github.io/math.combinatorics//index.html#clojure.math.combinatorics/count-subsets"}
  {:raw-source-url
   "https://github.com/clojure/math.combinatorics/raw/4c3d26eec2206e09b8b8c305bfed921966bce6f6/src/main/clojure/clojure/math/combinatorics.cljc",
   :name "drop-permutations",
   :file "src/main/clojure/clojure/math/combinatorics.cljc",
   :source-url
   "https://github.com/clojure/math.combinatorics/blob/4c3d26eec2206e09b8b8c305bfed921966bce6f6/src/main/clojure/clojure/math/combinatorics.cljc#L437",
   :line 437,
   :var-type "function",
   :arglists ([items n]),
   :doc "(drop n (permutations items)) but calculated more directly.",
   :namespace "clojure.math.combinatorics",
   :wiki-url
   "http://clojure.github.io/math.combinatorics//index.html#clojure.math.combinatorics/drop-permutations"}
  {:raw-source-url
   "https://github.com/clojure/math.combinatorics/raw/4c3d26eec2206e09b8b8c305bfed921966bce6f6/src/main/clojure/clojure/math/combinatorics.cljc",
   :name "nth-combination",
   :file "src/main/clojure/clojure/math/combinatorics.cljc",
   :source-url
   "https://github.com/clojure/math.combinatorics/blob/4c3d26eec2206e09b8b8c305bfed921966bce6f6/src/main/clojure/clojure/math/combinatorics.cljc#L556",
   :line 556,
   :var-type "function",
   :arglists ([items t n]),
   :doc "The nth element of the sequence of t-combinations of items",
   :namespace "clojure.math.combinatorics",
   :wiki-url
   "http://clojure.github.io/math.combinatorics//index.html#clojure.math.combinatorics/nth-combination"}
  {:raw-source-url
   "https://github.com/clojure/math.combinatorics/raw/4c3d26eec2206e09b8b8c305bfed921966bce6f6/src/main/clojure/clojure/math/combinatorics.cljc",
   :name "nth-permutation",
   :file "src/main/clojure/clojure/math/combinatorics.cljc",
   :source-url
   "https://github.com/clojure/math.combinatorics/blob/4c3d26eec2206e09b8b8c305bfed921966bce6f6/src/main/clojure/clojure/math/combinatorics.cljc#L419",
   :line 419,
   :var-type "function",
   :arglists ([items n]),
   :doc "(nth (permutations items)) but calculated more directly.",
   :namespace "clojure.math.combinatorics",
   :wiki-url
   "http://clojure.github.io/math.combinatorics//index.html#clojure.math.combinatorics/nth-permutation"}
  {:raw-source-url
   "https://github.com/clojure/math.combinatorics/raw/4c3d26eec2206e09b8b8c305bfed921966bce6f6/src/main/clojure/clojure/math/combinatorics.cljc",
   :name "partitions",
   :file "src/main/clojure/clojure/math/combinatorics.cljc",
   :source-url
   "https://github.com/clojure/math.combinatorics/blob/4c3d26eec2206e09b8b8c305bfed921966bce6f6/src/main/clojure/clojure/math/combinatorics.cljc#L906",
   :line 906,
   :var-type "function",
   :arglists ([items & args]),
   :doc
   "All the lexicographic distinct partitions of items.\nOptionally pass in :min and/or :max to specify inclusive bounds on the number of parts the items can be split into.",
   :namespace "clojure.math.combinatorics",
   :wiki-url
   "http://clojure.github.io/math.combinatorics//index.html#clojure.math.combinatorics/partitions"}
  {:raw-source-url
   "https://github.com/clojure/math.combinatorics/raw/4c3d26eec2206e09b8b8c305bfed921966bce6f6/src/main/clojure/clojure/math/combinatorics.cljc",
   :name "permutation-index",
   :file "src/main/clojure/clojure/math/combinatorics.cljc",
   :source-url
   "https://github.com/clojure/math.combinatorics/blob/4c3d26eec2206e09b8b8c305bfed921966bce6f6/src/main/clojure/clojure/math/combinatorics.cljc#L614",
   :line 614,
   :var-type "function",
   :arglists ([items]),
   :doc
   "Input must be a sortable collection of items.  Returns the n such that\n(nth-permutation (sort items) n) is items.",
   :namespace "clojure.math.combinatorics",
   :wiki-url
   "http://clojure.github.io/math.combinatorics//index.html#clojure.math.combinatorics/permutation-index"}
  {:raw-source-url
   "https://github.com/clojure/math.combinatorics/raw/4c3d26eec2206e09b8b8c305bfed921966bce6f6/src/main/clojure/clojure/math/combinatorics.cljc",
   :name "permutations",
   :file "src/main/clojure/clojure/math/combinatorics.cljc",
   :source-url
   "https://github.com/clojure/math.combinatorics/blob/4c3d26eec2206e09b8b8c305bfed921966bce6f6/src/main/clojure/clojure/math/combinatorics.cljc#L280",
   :line 280,
   :var-type "function",
   :arglists ([items]),
   :doc
   "All the distinct permutations of items, lexicographic by index \n(special handling for duplicate items).",
   :namespace "clojure.math.combinatorics",
   :wiki-url
   "http://clojure.github.io/math.combinatorics//index.html#clojure.math.combinatorics/permutations"}
  {:raw-source-url
   "https://github.com/clojure/math.combinatorics/raw/4c3d26eec2206e09b8b8c305bfed921966bce6f6/src/main/clojure/clojure/math/combinatorics.cljc",
   :name "selections",
   :file "src/main/clojure/clojure/math/combinatorics.cljc",
   :source-url
   "https://github.com/clojure/math.combinatorics/blob/4c3d26eec2206e09b8b8c305bfed921966bce6f6/src/main/clojure/clojure/math/combinatorics.cljc#L228",
   :line 228,
   :var-type "function",
   :arglists ([items n]),
   :doc
   "All the ways of taking n (possibly the same) elements from the sequence of items",
   :namespace "clojure.math.combinatorics",
   :wiki-url
   "http://clojure.github.io/math.combinatorics//index.html#clojure.math.combinatorics/selections"}
  {:raw-source-url
   "https://github.com/clojure/math.combinatorics/raw/4c3d26eec2206e09b8b8c305bfed921966bce6f6/src/main/clojure/clojure/math/combinatorics.cljc",
   :name "subsets",
   :file "src/main/clojure/clojure/math/combinatorics.cljc",
   :source-url
   "https://github.com/clojure/math.combinatorics/blob/4c3d26eec2206e09b8b8c305bfed921966bce6f6/src/main/clojure/clojure/math/combinatorics.cljc#L202",
   :line 202,
   :var-type "function",
   :arglists ([items]),
   :doc "All the subsets of items",
   :namespace "clojure.math.combinatorics",
   :wiki-url
   "http://clojure.github.io/math.combinatorics//index.html#clojure.math.combinatorics/subsets"})}
