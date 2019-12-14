(ns advent.core
  (:require [advent.day1 :as day1])
  (:require [advent.day2 :as day2])
  (:require [advent.day3 :as day3]))

(require '[clojure.string :as str])

(defn parse-path [d]
  (str/split d #","))

(defn -main []
  ; DAY3
  (let [[path1, path2] (as-> "input/chall3.txt" d
                             (slurp d)
                             (str/split d #"\n"))

        path1Vec (parse-path path1)
        path2Vec (parse-path path2)]
    (println (day3/day3 path1Vec path2Vec))))


