(ns advent.day2_test
  (:require [clojure.test :refer :all]
            [advent.day2 :refer :all]))

(deftest day2-tests
  (testing "some example data"
    (is (= (compute [1 1 1 4 99 5 6 0 99]) [30 1 1 4 2 5 6 0 99])))
  )
