(ns clojure.math.infer-combinatorics
  (:use clojure.test)
  (:require [clojure.core.typed :as t]
            [clojure.core.typed.runtime-infer :as infer]))

(def ^:dynamic *infer-fn* t/runtime-infer)

(t/install #{:load})

(defn delete-anns [nss]
  (doseq [ns nss]
    (infer/delete-generated-annotations
      ns
      {:ns ns})))

(defn infer-anns [nss]
  (doseq [ns nss]
    (*infer-fn* :ns ns)))

(def infer-files
  '[clojure.math.combinatorics
    ])

(defn infer [spec-or-type]
  (binding [*infer-fn* (case spec-or-type
                         :type t/runtime-infer
                         :spec t/spec-infer)]
    ;; FIXME shouldn't need this, but some types
    ;; don't compile
    (delete-anns infer-files)

    (def tests 
      '[clojure.math.test-combinatorics
        ])

    ;; FIXME need to forcibly reload the :lang'd file. Why?
    (apply require (conj tests :reload-all))
    (apply run-tests tests)

    (infer-anns infer-files)))
