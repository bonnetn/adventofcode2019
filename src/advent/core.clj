(ns advent.core
   (:require [advent.day1 :as day1]))


(defn -main [& args]
  (def inputData (slurp "input/chall1.txt"))
  (println (day1/day1 inputData))
)

