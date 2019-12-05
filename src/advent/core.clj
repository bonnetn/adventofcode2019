(ns advent.core
  (:require [advent.day1 :as day1])
  (:require [advent.day2 :as day2]))

(require '[clojure.string :as str])

(defn -main [& args]
  (println (let [day2Data (as-> "input/chall2.txt" d
                                (slurp d)
                                (str/split d #",")
                                (map read-string d)
                                (vec d)
                                (assoc d
                                       1 12
                                       2 2))]
             (day2/day2 day2Data))))
