{:namespaces
 ({:source-url
   "https://github.com/clojure/math.combinatorics/blob/602a1128340989ae1829336394ecef65d5cc7662/src/main/clojure/clojure/math/combinatorics.clj",
   :wiki-url
   "http://clojure.github.com/math.combinatorics/clojure.math.combinatorics-api.html",
   :name "clojure.math.combinatorics",
   :author "Mark Engelberg",
   :doc
   "Efficient, functional algorithms for generating lazy\nsequences for common combinatorial functions. (See the source code \nfor a longer description.)"}),
 :vars
 ({:arglists ([x message]),
   :name "assert-with-message",
   :namespace "clojure.math.combinatorics",
   :source-url
   "https://github.com/clojure/math.combinatorics/blob/602a1128340989ae1829336394ecef65d5cc7662/src/main/clojure/clojure/math/combinatorics.clj#L91",
   :raw-source-url
   "https://github.com/clojure/math.combinatorics/raw/602a1128340989ae1829336394ecef65d5cc7662/src/main/clojure/clojure/math/combinatorics.clj",
   :wiki-url
   "http://clojure.github.com/math.combinatorics//clojure.math.combinatorics-api.html#clojure.math.combinatorics/assert-with-message",
   :doc
   "Clojure 1.2 didn't allow asserts with a message, so we roll our own here for backwards compatibility",
   :var-type "macro",
   :line 91,
   :file "src/main/clojure/clojure/math/combinatorics.clj"}
  {:arglists ([& seqs]),
   :name "cartesian-product",
   :namespace "clojure.math.combinatorics",
   :source-url
   "https://github.com/clojure/math.combinatorics/blob/602a1128340989ae1829336394ecef65d5cc7662/src/main/clojure/clojure/math/combinatorics.clj#L218",
   :raw-source-url
   "https://github.com/clojure/math.combinatorics/raw/602a1128340989ae1829336394ecef65d5cc7662/src/main/clojure/clojure/math/combinatorics.clj",
   :wiki-url
   "http://clojure.github.com/math.combinatorics//clojure.math.combinatorics-api.html#clojure.math.combinatorics/cartesian-product",
   :doc "All the ways to take one item from each sequence",
   :var-type "function",
   :line 218,
   :file "src/main/clojure/clojure/math/combinatorics.clj"}
  {:arglists ([items t]),
   :name "combinations",
   :namespace "clojure.math.combinatorics",
   :source-url
   "https://github.com/clojure/math.combinatorics/blob/602a1128340989ae1829336394ecef65d5cc7662/src/main/clojure/clojure/math/combinatorics.clj#L187",
   :raw-source-url
   "https://github.com/clojure/math.combinatorics/raw/602a1128340989ae1829336394ecef65d5cc7662/src/main/clojure/clojure/math/combinatorics.clj",
   :wiki-url
   "http://clojure.github.com/math.combinatorics//clojure.math.combinatorics-api.html#clojure.math.combinatorics/combinations",
   :doc
   "All the unique ways of taking t different elements from items",
   :var-type "function",
   :line 187,
   :file "src/main/clojure/clojure/math/combinatorics.clj"}
  {:arglists ([items t]),
   :name "count-combinations",
   :namespace "clojure.math.combinatorics",
   :source-url
   "https://github.com/clojure/math.combinatorics/blob/602a1128340989ae1829336394ecef65d5cc7662/src/main/clojure/clojure/math/combinatorics.clj#L508",
   :raw-source-url
   "https://github.com/clojure/math.combinatorics/raw/602a1128340989ae1829336394ecef65d5cc7662/src/main/clojure/clojure/math/combinatorics.clj",
   :wiki-url
   "http://clojure.github.com/math.combinatorics//clojure.math.combinatorics-api.html#clojure.math.combinatorics/count-combinations",
   :doc "(count (combinations items t)) but computed more directly",
   :var-type "function",
   :line 508,
   :file "src/main/clojure/clojure/math/combinatorics.clj"}
  {:arglists ([l]),
   :name "count-permutations",
   :namespace "clojure.math.combinatorics",
   :source-url
   "https://github.com/clojure/math.combinatorics/blob/602a1128340989ae1829336394ecef65d5cc7662/src/main/clojure/clojure/math/combinatorics.clj#L356",
   :raw-source-url
   "https://github.com/clojure/math.combinatorics/raw/602a1128340989ae1829336394ecef65d5cc7662/src/main/clojure/clojure/math/combinatorics.clj",
   :wiki-url
   "http://clojure.github.com/math.combinatorics//clojure.math.combinatorics-api.html#clojure.math.combinatorics/count-permutations",
   :doc "Counts the number of distinct permutations of l",
   :var-type "function",
   :line 356,
   :file "src/main/clojure/clojure/math/combinatorics.clj"}
  {:arglists ([items]),
   :name "count-subsets",
   :namespace "clojure.math.combinatorics",
   :source-url
   "https://github.com/clojure/math.combinatorics/blob/602a1128340989ae1829336394ecef65d5cc7662/src/main/clojure/clojure/math/combinatorics.clj#L530",
   :raw-source-url
   "https://github.com/clojure/math.combinatorics/raw/602a1128340989ae1829336394ecef65d5cc7662/src/main/clojure/clojure/math/combinatorics.clj",
   :wiki-url
   "http://clojure.github.com/math.combinatorics//clojure.math.combinatorics-api.html#clojure.math.combinatorics/count-subsets",
   :doc "(count (subsets items)) but computed more directly",
   :var-type "function",
   :line 530,
   :file "src/main/clojure/clojure/math/combinatorics.clj"}
  {:arglists ([items n]),
   :name "drop-permutations",
   :namespace "clojure.math.combinatorics",
   :source-url
   "https://github.com/clojure/math.combinatorics/blob/602a1128340989ae1829336394ecef65d5cc7662/src/main/clojure/clojure/math/combinatorics.clj#L449",
   :raw-source-url
   "https://github.com/clojure/math.combinatorics/raw/602a1128340989ae1829336394ecef65d5cc7662/src/main/clojure/clojure/math/combinatorics.clj",
   :wiki-url
   "http://clojure.github.com/math.combinatorics//clojure.math.combinatorics-api.html#clojure.math.combinatorics/drop-permutations",
   :doc "(drop n (permutations items)) but calculated more directly.",
   :var-type "function",
   :line 449,
   :file "src/main/clojure/clojure/math/combinatorics.clj"}
  {:arglists ([items t n]),
   :name "nth-combination",
   :namespace "clojure.math.combinatorics",
   :source-url
   "https://github.com/clojure/math.combinatorics/blob/602a1128340989ae1829336394ecef65d5cc7662/src/main/clojure/clojure/math/combinatorics.clj#L568",
   :raw-source-url
   "https://github.com/clojure/math.combinatorics/raw/602a1128340989ae1829336394ecef65d5cc7662/src/main/clojure/clojure/math/combinatorics.clj",
   :wiki-url
   "http://clojure.github.com/math.combinatorics//clojure.math.combinatorics-api.html#clojure.math.combinatorics/nth-combination",
   :doc "The nth element of the sequence of t-combinations of items",
   :var-type "function",
   :line 568,
   :file "src/main/clojure/clojure/math/combinatorics.clj"}
  {:arglists ([items n]),
   :name "nth-permutation",
   :namespace "clojure.math.combinatorics",
   :source-url
   "https://github.com/clojure/math.combinatorics/blob/602a1128340989ae1829336394ecef65d5cc7662/src/main/clojure/clojure/math/combinatorics.clj#L431",
   :raw-source-url
   "https://github.com/clojure/math.combinatorics/raw/602a1128340989ae1829336394ecef65d5cc7662/src/main/clojure/clojure/math/combinatorics.clj",
   :wiki-url
   "http://clojure.github.com/math.combinatorics//clojure.math.combinatorics-api.html#clojure.math.combinatorics/nth-permutation",
   :doc "(nth (permutations items)) but calculated more directly.",
   :var-type "function",
   :line 431,
   :file "src/main/clojure/clojure/math/combinatorics.clj"}
  {:arglists ([items & args]),
   :name "partitions",
   :namespace "clojure.math.combinatorics",
   :source-url
   "https://github.com/clojure/math.combinatorics/blob/602a1128340989ae1829336394ecef65d5cc7662/src/main/clojure/clojure/math/combinatorics.clj#L915",
   :raw-source-url
   "https://github.com/clojure/math.combinatorics/raw/602a1128340989ae1829336394ecef65d5cc7662/src/main/clojure/clojure/math/combinatorics.clj",
   :wiki-url
   "http://clojure.github.com/math.combinatorics//clojure.math.combinatorics-api.html#clojure.math.combinatorics/partitions",
   :doc
   "All the lexicographic distinct partitions of items.\nOptionally pass in :min and/or :max to specify inclusive bounds on the number of parts the items can be split into.",
   :var-type "function",
   :line 915,
   :file "src/main/clojure/clojure/math/combinatorics.clj"}
  {:arglists ([items]),
   :name "permutation-index",
   :namespace "clojure.math.combinatorics",
   :source-url
   "https://github.com/clojure/math.combinatorics/blob/602a1128340989ae1829336394ecef65d5cc7662/src/main/clojure/clojure/math/combinatorics.clj#L627",
   :raw-source-url
   "https://github.com/clojure/math.combinatorics/raw/602a1128340989ae1829336394ecef65d5cc7662/src/main/clojure/clojure/math/combinatorics.clj",
   :wiki-url
   "http://clojure.github.com/math.combinatorics//clojure.math.combinatorics-api.html#clojure.math.combinatorics/permutation-index",
   :doc
   "Input must be a sortable collection of items.  Returns the n such that\n(nth-permutation (sort items) n) is items.",
   :var-type "function",
   :line 627,
   :file "src/main/clojure/clojure/math/combinatorics.clj"}
  {:arglists ([items]),
   :name "permutations",
   :namespace "clojure.math.combinatorics",
   :source-url
   "https://github.com/clojure/math.combinatorics/blob/602a1128340989ae1829336394ecef65d5cc7662/src/main/clojure/clojure/math/combinatorics.clj#L290",
   :raw-source-url
   "https://github.com/clojure/math.combinatorics/raw/602a1128340989ae1829336394ecef65d5cc7662/src/main/clojure/clojure/math/combinatorics.clj",
   :wiki-url
   "http://clojure.github.com/math.combinatorics//clojure.math.combinatorics-api.html#clojure.math.combinatorics/permutations",
   :doc
   "All the distinct permutations of items, lexicographic by index \n(special handling for duplicate items).",
   :var-type "function",
   :line 290,
   :file "src/main/clojure/clojure/math/combinatorics.clj"}
  {:arglists ([items n]),
   :name "selections",
   :namespace "clojure.math.combinatorics",
   :source-url
   "https://github.com/clojure/math.combinatorics/blob/602a1128340989ae1829336394ecef65d5cc7662/src/main/clojure/clojure/math/combinatorics.clj#L238",
   :raw-source-url
   "https://github.com/clojure/math.combinatorics/raw/602a1128340989ae1829336394ecef65d5cc7662/src/main/clojure/clojure/math/combinatorics.clj",
   :wiki-url
   "http://clojure.github.com/math.combinatorics//clojure.math.combinatorics-api.html#clojure.math.combinatorics/selections",
   :doc
   "All the ways of taking n (possibly the same) elements from the sequence of items",
   :var-type "function",
   :line 238,
   :file "src/main/clojure/clojure/math/combinatorics.clj"}
  {:arglists ([items]),
   :name "subsets",
   :namespace "clojure.math.combinatorics",
   :source-url
   "https://github.com/clojure/math.combinatorics/blob/602a1128340989ae1829336394ecef65d5cc7662/src/main/clojure/clojure/math/combinatorics.clj#L212",
   :raw-source-url
   "https://github.com/clojure/math.combinatorics/raw/602a1128340989ae1829336394ecef65d5cc7662/src/main/clojure/clojure/math/combinatorics.clj",
   :wiki-url
   "http://clojure.github.com/math.combinatorics//clojure.math.combinatorics-api.html#clojure.math.combinatorics/subsets",
   :doc "All the subsets of items",
   :var-type "function",
   :line 212,
   :file "src/main/clojure/clojure/math/combinatorics.clj"})}
