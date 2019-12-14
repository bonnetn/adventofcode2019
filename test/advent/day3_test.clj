(ns advent.day3-test
  (:require [clojure.test :refer :all]
            [advent.day3 :refer :all]
            ))

(deftest day3-tests
  (testing "example 1 given on site"
    (is (= (day3 ["R75" "D30" "R83" "U83" "L12" "D49" "R71" "U7" "L72"] ["U62" "R66" "U55" "R34" "D71" "R55" "D58" "R83"])
           159)))
  (testing "example 2 given on site"
    (is (= (day3 ["R98" "U47" "R26" "D63" "R33" "U87" "L62" "D20" "R33" "U53" "R51"] ["U98" "R91" "D20" "R16" "D67" "R40" "U7" "R15" "U6" "R7"])
           135))))
