# clojure.math.combinatorics
Efficient, functional algorithms for generating lazy
sequences for common combinatorial functions. 

## Usage

* (combinations items n) - A lazy sequence of all the unique
ways of taking n different elements from items.

     Example: (combinations [1 2 3] 2) -> ((1 2) (1 3) (2 3))

* (subsets items) - A lazy sequence of all the subsets of
items (but generalized to all sequences, not just sets).

      Example: (subsets [1 2 3]) -> (() (1) (2) (3) (1 2) (1 3) (2 3) (1 2 3))

* (cartesian-product & seqs) - Takes any number of sequences
as arguments, and returns a lazy sequence of all the ways
to take one item from each seq.

      Example: (cartesian-product [1 2] [3 4]) -> ((1 3) (1 4) (2 3) (2 4))

      (cartesian-product seq1 seq2 seq3 ...) behaves like but is
faster than a nested for loop, such as:

      (for [i1 seq1 i2 seq2 i3 seq3 ...] (list i1 i2 i3 ...))

* (selections items n) - A lazy sequence of all the ways to
take n (possibly the same) items from the sequence of items.

     Example: (selections [1 2] 3) -> ((1 1 1) (1 1 2) (1 2 1) (1 2 2) (2 1 1) (2 1 2) (2 2 1) (2 2 2))

* (permutations items) - A lazy sequence of all the permutations
of items.

      Example: (permutations [1 2 3]) -> ((1 2 3) (1 3 2) (2 1 3) (2 3 1) (3 1 2) (3 2 1))


## License

Distributed under the Eclipse Public License, the same as Clojure.
