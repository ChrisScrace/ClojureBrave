(defproject clojure-noob "0.1.0-SNAPSHOT"
  :description "FIXME: write description"
  :javac-options ["-target" "1.8" "-source" "1.8" "-Xlint:-options"]
  :url "http://example.com/FIXME"
  :license {:name "Eclipse Public License"
            :url "http://www.eclipse.org/legal/epl-v10.html"}
  :dependencies [[org.clojure/clojure "1.8.0"]]
  :main ^:skip-aot clojure-noob.core
  :target-path "target/%s"
  :profiles {:uberjar {:aot :all}})
