(ns advent.day1)

(require '[clojure.string :as str])

(defn day1 [inputData]
  (def input (map read-string (str/split inputData #"\n")))
  (reduce + (map #(- (quot % 3) 2) input))
)
