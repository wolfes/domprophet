(defproject dom-prophet "0.1.0-SNAPSHOT"
  :description "DOM Prophet Server"
  :url "http://example.com/FIXME"
  :dependencies [[org.clojure/clojure "1.4.0"]
                 [compojure "1.1.5"]
                 [clojure-neo4j "0.3.0-SNAPSHOT"]]
  :plugins [[lein-ring "0.8.2"]]
  :ring {:handler dom-prophet.handler/app}
  :profiles
  {:dev {:dependencies [[ring-mock "0.1.3"]]}})
