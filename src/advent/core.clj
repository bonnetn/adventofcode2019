(ns advent.core
   (:require [advent.day1 :as day1]))

(require '[clojure.string :as str])


(defn -main [& args]
  (def inputData (map read-string (str/split (slurp "input/chall1.txt") #"\n")))
  (println (day1/day1 inputData))
)

