clojure.math.combinatorics
========================================

Formerly clojure.contrib.combinatorics.

Efficient, functional algorithms for generating lazy
sequences for common combinatorial functions.

Releases and Dependency Information
========================================

Latest stable release: 0.3.0

* [All Released Versions](https://search.maven.org/#search%7Cgav%7C1%7Cg%3A%22org.clojure%22%20AND%20a%3A%22math.combinatorics%22)
* [Development Snapshot Versions](https://oss.sonatype.org/index.html#nexus-search;gav~org.clojure~math.combinatorics~~~)

[CLI/`deps.edn`](https://clojure.org/reference/deps_and_cli) dependency information:
```clojure
org.clojure/math.combinatorics {:mvn/version "0.3.0"}
```

[Leiningen](https://github.com/technomancy/leiningen) dependency information:

```clojure
[org.clojure/math.combinatorics "0.3.0"]
```

[Maven](https://maven.apache.org/) dependency information:

```xml
<dependency>
  <groupId>org.clojure</groupId>
  <artifactId>math.combinatorics</artifactId>
  <version>0.3.0</version>
</dependency>
```

*Note: If you are using Clojure 1.2 - 1.6, you will need math.combinatorics version 0.1.3.*

Example Usage
========================================

The following functions take sequential collections
(such as lists and vectors) as inputs. If you want
to call a function on a set, you must explicitly
call `seq` on the set first.

All functions return lazy sequences.

```clojure
(ns example.core
  (:require [clojure.math.combinatorics :as combo]))

; PERMUTATIONS
; all the unique arrangements of items
=> (combo/permutations [1 2 3])
([1 2 3] [1 3 2] [2 1 3] [2 3 1] [3 1 2] [3 2 1])

; Note that permutations intelligently handles duplicate items
=> (combo/permutations [1 1 2])
([1 1 2] [1 2 1] [2 1 1])

; These functions are more efficient than calling count, nth, drop
; on the underlying sequence
=> (combo/count-permutations [1 2 3])
6
=> (combo/count-permutations [1 1 2])
3
=> (combo/nth-permutation [1 2 3] 3)
[2 3 1]
=> (combo/nth-permutation [1 1 2 2] 5)
[2 2 1 1]
=> (combo/drop-permutations [1 2 3] 3)
([2 3 1] [3 1 2] [3 2 1])

; For a sortable collection of items, you can find out where it is
; in the lexicographic sequence of permutations
=> (combo/permutation-index [\a \b \a \c \a \b])
16
=> (combo/nth-permutation [\a \a \a \b \b \c] 16)
[\a \b \a \c \a \b]


; COMBINATIONS
; all the unique ways of taking t different elements from items
(combo/combinations [1 2 3] 2)
;;=> ((1 2) (1 3) (2 3))

; Note that combinations intelligently handles duplicate items
; treating the input list as a representation of a 'multiset'
 => (combo/combinations [1 1 1 2 2] 3)
((1 1 1) (1 1 2) (1 2 2))

; These functions are more efficient than calling count and nth
; on the underlying sequence
=> (combo/count-combinations [1 1 1 2 2] 3)
3
=> (combo/nth-combination [1 2 3 4 5] 2 5)
[2 4]

; Permuting all the combinations
=> (combo/permuted-combinations [1 2 3] 2)
([1 2] [2 1] [1 3] [3 1] [2 3] [3 2])
=> (combo/permuted-combinations [1 2 2] 2)
([1 2] [2 1] [2 2])))


; SUBSETS
; all the subsets of items
=> (combo/subsets [1 2 3])
(() (1) (2) (3) (1 2) (1 3) (2 3) (1 2 3))

; Note that subsets intelligently handles duplicate items
; treating the input list as a representation of a 'multiset'
=> (combo/subsets [1 1 2])
(() (1) (2) (1 1) (1 2) (1 1 2))

; These functions are more efficient than calling count and nth
; on the underlying sequence
=> (combo/count-subsets [1 1 2])
6
=> (combo/nth-subset [1 1 2] 3)
[1 1]

; CARTESIAN PRODUCT
; all the ways to take one item from each passed-in sequence
=> (combo/cartesian-product [1 2] [3 4])
((1 3) (1 4) (2 3) (2 4))

; SELECTIONS
; all the ways to take n (possibly the same) items from the sequence of items
=> (combo/selections [1 2] 3)
((1 1 1) (1 1 2) (1 2 1) (1 2 2) (2 1 1) (2 1 2) (2 2 1) (2 2 2))

; PARTITIONS
; all the partitions of items.
=> (combo/partitions [1 2 3])
(([1 2 3])
 ([1 2] [3])
 ([1 3] [2])
 ([1] [2 3])
 ([1] [2] [3]))

 ; Note that partitions intelligently handles duplicate items
=> (combo/partitions [1 1 2])
(([1 1 2])
 ([1 1] [2])
 ([1 2] [1])
 ([1] [1] [2]))

 ; You can also specify a min and max number of partitions
(combo/partitions [1 1 2 2] :min 2 :max 3)
(([1 1 2] [2])
 ([1 1] [2 2])
 ([1 1] [2] [2])
 ([1 2 2] [1])
 ([1 2] [1 2])
 ([1 2] [1] [2])
 ([1] [1] [2 2]))
```

Refer to docstrings in the `clojure.math.combinatorics` namespace for
additional documentation.

[API Documentation](https://clojure.github.io/math.combinatorics/)

Developer Information
========================================

* [GitHub project](https://github.com/clojure/math.combinatorics)
* [Bug Tracker](https://clojure.atlassian.net/browse/MCOMB)
* [Continuous Integration](https://github.com/clojure/math.combinatorics/actions/workflows/test.yml)

Changelog
========================================
* Release 0.3.0 on 2024-02-19
  * Update parent pom

* Release 0.2.0 on 2023-03-18
  * MCOMB-11 - Fix incorrect results, overflow in partitions-M

* Release 0.1.6 on 2019-07-24
  * Improved laziness characteristics of many functions
  * Added `permuted-combinations`

* Release 0.1.5 on 2019-04-07
  * Removed deprecated annotation on lex-permutations, which was causing problems for clojurescript users.

* Release 0.1.4 on 2017-01-06
  * Support for clojurescript (tested with 1.9.293)
  * Dropped support for Clojure 1.2 - 1.6

* Release 0.1.3 on 2016-06-02
  * Changed boxing to use Long/valueOf.

* Release 0.1.2 on 2016-05-18
  * Added explicit boxing to eliminate auto-boxing warnings.
    No change in functionality or performance from previous release.

* Release 0.1.1 on 2015-03-20
  * Backwards compatibility with 1.2.0 and 1.2.1

* Release 0.1.0 on 2015-03-17
  * combinations and subsets now have special handling for duplicate items
  * Added count-permutations, count-combinations, count-subsets,
     nth-permutation, nth-combination, nth-subset
     drop-permutations, permutation-index

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
