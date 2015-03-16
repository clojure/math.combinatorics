clojure.math.combinatorics
========================================

Formerly clojure.contrib.combinatorics.

Efficient, functional algorithms for generating lazy
sequences for common combinatorial functions.

Releases and Dependency Information
========================================

Latest stable release: 0.0.9

* [All Released Versions](http://search.maven.org/#search%7Cgav%7C1%7Cg%3A%22org.clojure%22%20AND%20a%3A%22math.combinatorics%22)

* [Development Snapshot Versions](https://oss.sonatype.org/index.html#nexus-search;gav~org.clojure~math.combinatorics~~~)

[Leiningen](https://github.com/technomancy/leiningen) dependency information:

```clojure
[org.clojure/math.combinatorics "0.0.9"]
```

[Maven](http://maven.apache.org/) dependency information:

```xml
<dependency>
  <groupId>org.clojure</groupId>
  <artifactId>math.combinatorics</artifactId>
  <version>0.0.9</version>
</dependency>
```

Example Usage
========================================

All functions return lazy sequences.

```clojure
(ns example.core
  (:require [clojure.math.combinatorics :as combo]))

; all the unique ways of taking n different elements from items
(combo/combinations [1 2 3] 2)
;;=> ((1 2) (1 3) (2 3))

; all the subsets of items
(combo/subsets [1 2 3])
;;=> (() (1) (2) (3) (1 2) (1 3) (2 3) (1 2 3))

; all the ways to take one item from each passed-in sequence
(combo/cartesian-product [1 2] [3 4])
;;=> ((1 3) (1 4) (2 3) (2 4))

; all the ways to take n (possibly the same) items from the sequence of items
(combo/selections [1 2] 3)
;;=> ((1 1 1) (1 1 2) (1 2 1) (1 2 2) (2 1 1) (2 1 2) (2 2 1) (2 2 2))

; all the permutations of items
(combo/permutations [1 2 3])
;;=> ([1 2 3] [1 3 2] [2 1 3] [2 3 1] [3 1 2] [3 2 1])
(combo/permutations [1 1 2])
;;=> ([1 1 2] [1 2 1] [2 1 1])

; all the partitions of items.
(combo/partitions [1 2 3])
;;=> (([1 2 3])
      ([1 2] [3])
      ([1 3] [2])
      ([1] [2 3])
      ([1] [2] [3]))
(combo/partitions [1 1 2])
;;=> (([1 1 2])
      ([1 1] [2])
      ([1 2] [1])
      ([1] [1] [2]))
(combo/partitions [1 1 2 2] :min 2 :max 3)
;;=> (([1 1 2] [2])
   	  ([1 1] [2 2])
      ([1 1] [2] [2])
      ([1 2 2] [1])
      ([1 2] [1 2])
      ([1 2] [1] [2])
      ([1] [1] [2 2]))
```

Note that `permutations` and `partitions` intelligently handle inputs with duplicate items,
using a more sophisticated algorithm that will produce only distinct permutations/partitions.
The other functions do not do this, and will produce duplicates in the output if the input has 
duplicate items.

Refer to docstrings in the `clojure.math.combinatorics` namespace for
additional documentation.

[API Documentation](http://clojure.github.com/math.combinatorics/)

Developer Information
========================================

* [GitHub project](https://github.com/clojure/math.combinatorics)

* [Bug Tracker](http://dev.clojure.org/jira/browse/MCOMB)

* [Continuous Integration](http://build.clojure.org/job/math.combinatorics/)

* [Compatibility Test Matrix](http://build.clojure.org/job/math.combinatorics-test-matrix/)

Changelog
========================================
* Release 0.0.9 on 2015-03-16
  * Exclude "update" function from core for compatibility with 1.7.
  
* Release 0.0.8 on 2014-07-20
  * Minor improvement of helper function used by permutations.

* Release 0.0.7 on 2013-11-13
  * Unchunk range in `subsets` to minimize memory usage.

* Release 0.0.6 on 2013-10-31
  * Removed use of mapv for backwards compat with older versions of Clojure.

* Release 0.0.5 on 2013-10-31
  * Added partitions function

* Release 0.0.4 on 2013-03-26
  * Moved comment after ns declaration

* Release 0.0.3 on 2012-07-06
  * Fixed bug with (selections [false] 3) returning nil
  * Fixed test syntax for Clojure 1.4.0/1.5.0

* Release 0.0.2 on 2011-10-24
  * Deprecated lex-permutations (permutations is now intelligent)

* Release 0.0.1 on 2011-09-29
  * Initial release.
  * Source-compatible with clojure.contrib.math, except for the name change.

License
========================================

Distributed under the Eclipse Public License, the same as Clojure.
