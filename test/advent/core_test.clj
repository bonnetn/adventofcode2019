(ns advent.core-test
  (:require [clojure.test :refer :all]
            [advent.day1 :refer :all]))

(deftest day1-tests
  (testing "(12)"
    (is (= (day1 "12") 2)))
  (testing "(14)"
    (is (= (day1 "14") 2)))
  (testing "(1969)"
    (is (= (day1 "1969") 654)))
  (testing "(100756)"
    (is (= (day1 "100756") 33583)))
  (testing "(12, 14)"
    (is (= (day1 "138828\n82053\n75644\n86659\n85337") 156162)))
)
