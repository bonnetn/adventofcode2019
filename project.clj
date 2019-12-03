(defproject advent "0.1.0-SNAPSHOT"
  :description "Advent of code solutions"
  :url "https://adventofcode.com/"
  :dependencies [[org.clojure/clojure "1.10.0"]]
  :main ^:skip-aot advent.core
  :target-path "target/%s"
  :profiles {:uberjar {:aot :all}})
