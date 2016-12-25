(defproject org.clojure/math.combinatorics "0.1.2-SNAPSHOT"
  :description ""
  :url "https://github.com/clojure/math.combinatorics"
  :license {:name "Eclipse Public License"
            :url "http://www.eclipse.org/legal/epl-v10.html"}
  :source-paths ["src/main/clojure"]
  :test-paths ["src/test/clojure"]
  :global-vars {*warn-on-reflection* true}
  :dependencies [[org.clojure/clojure "1.9.0-alpha13"]
                 [org.clojure/core.typed "0.3.29-SNAPSHOT"]]
  :injections [(require 'clojure.core.typed)
               (clojure.core.typed/install
                 #{:load})]
  :repl-options {:timeout 3000000})
