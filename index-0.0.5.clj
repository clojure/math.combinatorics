{:namespaces
 ({:source-url
   "https://github.com/clojure/math.combinatorics/blob/6c3a9b5844e05abbbbfc8da93fe3644624adb8ff/src/main/clojure/clojure/math/combinatorics.clj",
   :wiki-url
   "http://clojure.github.com/math.combinatorics/clojure.math.combinatorics-api.html",
   :name "clojure.math.combinatorics",
   :author "Mark Engelberg",
   :doc
   "Efficient, functional algorithms for generating lazy\nsequences for common combinatorial functions. (See the source code \nfor a longer description.)"}),
 :vars
 ({:arglists ([& seqs]),
   :name "cartesian-product",
   :namespace "clojure.math.combinatorics",
   :source-url
   "https://github.com/clojure/math.combinatorics/blob/6c3a9b5844e05abbbbfc8da93fe3644624adb8ff/src/main/clojure/clojure/math/combinatorics.clj#L105",
   :raw-source-url
   "https://github.com/clojure/math.combinatorics/raw/6c3a9b5844e05abbbbfc8da93fe3644624adb8ff/src/main/clojure/clojure/math/combinatorics.clj",
   :wiki-url
   "http://clojure.github.com/math.combinatorics//clojure.math.combinatorics-api.html#clojure.math.combinatorics/cartesian-product",
   :doc "All the ways to take one item from each sequence",
   :var-type "function",
   :line 105,
   :file "src/main/clojure/clojure/math/combinatorics.clj"}
  {:arglists ([items n]),
   :name "combinations",
   :namespace "clojure.math.combinatorics",
   :source-url
   "https://github.com/clojure/math.combinatorics/blob/6c3a9b5844e05abbbbfc8da93fe3644624adb8ff/src/main/clojure/clojure/math/combinatorics.clj#L88",
   :raw-source-url
   "https://github.com/clojure/math.combinatorics/raw/6c3a9b5844e05abbbbfc8da93fe3644624adb8ff/src/main/clojure/clojure/math/combinatorics.clj",
   :wiki-url
   "http://clojure.github.com/math.combinatorics//clojure.math.combinatorics-api.html#clojure.math.combinatorics/combinations",
   :doc
   "All the unique ways of taking n different elements from items",
   :var-type "function",
   :line 88,
   :file "src/main/clojure/clojure/math/combinatorics.clj"}
  {:arglists ([c]),
   :name "lex-permutations",
   :namespace "clojure.math.combinatorics",
   :source-url
   "https://github.com/clojure/math.combinatorics/blob/6c3a9b5844e05abbbbfc8da93fe3644624adb8ff/src/main/clojure/clojure/math/combinatorics.clj#L149",
   :deprecated "1.3",
   :raw-source-url
   "https://github.com/clojure/math.combinatorics/raw/6c3a9b5844e05abbbbfc8da93fe3644624adb8ff/src/main/clojure/clojure/math/combinatorics.clj",
   :wiki-url
   "http://clojure.github.com/math.combinatorics//clojure.math.combinatorics-api.html#clojure.math.combinatorics/lex-permutations",
   :doc
   "DEPRECATED as a public function.\n\nIn prior versions of the combinatorics library, there were two similar functions: permutations and lex-permutations.  It was a source of confusion to know which to call.  Now, you can always call permutations.  When appropriate (i.e., when you pass in a sorted sequence of numbers), permutations will automatically call lex-permutations as a speed optimization.",
   :var-type "function",
   :line 149,
   :file "src/main/clojure/clojure/math/combinatorics.clj"}
  {:arglists ([items & args]),
   :name "partitions",
   :namespace "clojure.math.combinatorics",
   :source-url
   "https://github.com/clojure/math.combinatorics/blob/6c3a9b5844e05abbbbfc8da93fe3644624adb8ff/src/main/clojure/clojure/math/combinatorics.clj#L469",
   :raw-source-url
   "https://github.com/clojure/math.combinatorics/raw/6c3a9b5844e05abbbbfc8da93fe3644624adb8ff/src/main/clojure/clojure/math/combinatorics.clj",
   :wiki-url
   "http://clojure.github.com/math.combinatorics//clojure.math.combinatorics-api.html#clojure.math.combinatorics/partitions",
   :doc
   "All the lexicographic distinct partitions of items.\nOptionally pass in :min and/or :max to specify inclusive bounds on the number of parts the items can be split into.",
   :var-type "function",
   :line 469,
   :file "src/main/clojure/clojure/math/combinatorics.clj"}
  {:arglists ([items]),
   :name "permutations",
   :namespace "clojure.math.combinatorics",
   :source-url
   "https://github.com/clojure/math.combinatorics/blob/6c3a9b5844e05abbbbfc8da93fe3644624adb8ff/src/main/clojure/clojure/math/combinatorics.clj#L177",
   :raw-source-url
   "https://github.com/clojure/math.combinatorics/raw/6c3a9b5844e05abbbbfc8da93fe3644624adb8ff/src/main/clojure/clojure/math/combinatorics.clj",
   :wiki-url
   "http://clojure.github.com/math.combinatorics//clojure.math.combinatorics-api.html#clojure.math.combinatorics/permutations",
   :doc
   "All the distinct permutations of items, lexicographic by index.",
   :var-type "function",
   :line 177,
   :file "src/main/clojure/clojure/math/combinatorics.clj"}
  {:arglists ([items n]),
   :name "selections",
   :namespace "clojure.math.combinatorics",
   :source-url
   "https://github.com/clojure/math.combinatorics/blob/6c3a9b5844e05abbbbfc8da93fe3644624adb8ff/src/main/clojure/clojure/math/combinatorics.clj#L125",
   :raw-source-url
   "https://github.com/clojure/math.combinatorics/raw/6c3a9b5844e05abbbbfc8da93fe3644624adb8ff/src/main/clojure/clojure/math/combinatorics.clj",
   :wiki-url
   "http://clojure.github.com/math.combinatorics//clojure.math.combinatorics-api.html#clojure.math.combinatorics/selections",
   :doc
   "All the ways of taking n (possibly the same) elements from the sequence of items",
   :var-type "function",
   :line 125,
   :file "src/main/clojure/clojure/math/combinatorics.clj"}
  {:arglists ([items]),
   :name "subsets",
   :namespace "clojure.math.combinatorics",
   :source-url
   "https://github.com/clojure/math.combinatorics/blob/6c3a9b5844e05abbbbfc8da93fe3644624adb8ff/src/main/clojure/clojure/math/combinatorics.clj#L99",
   :raw-source-url
   "https://github.com/clojure/math.combinatorics/raw/6c3a9b5844e05abbbbfc8da93fe3644624adb8ff/src/main/clojure/clojure/math/combinatorics.clj",
   :wiki-url
   "http://clojure.github.com/math.combinatorics//clojure.math.combinatorics-api.html#clojure.math.combinatorics/subsets",
   :doc "All the subsets of items",
   :var-type "function",
   :line 99,
   :file "src/main/clojure/clojure/math/combinatorics.clj"})}
