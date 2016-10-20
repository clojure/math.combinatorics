(ns clojure.math.infer-types-combinatorics
  (:use clojure.test)
  (:require [clojure.core.typed :as t]
            [clojure.core.typed.runtime-infer :as infer]))

(t/install #{:load})

(defn delete-anns [nss]
  (doseq [ns nss]
    (infer/delete-generated-annotations
      ns
      {:ns ns})))

(defn infer-anns [nss]
  (doseq [ns nss]
    (t/runtime-infer :ns ns)))

(def infer-files
  '[clojure.math.combinatorics
    ])

;; FIXME shouldn't need this, but some types
;; don't compile
(delete-anns infer-files)

(def tests 
  '[clojure.math.test-combinatorics
    ])

;; FIXME need to forcibly reload the :lang'd file. Why?
(apply require (conj tests :reload-all))
(apply run-tests tests)

(infer-anns infer-files)
