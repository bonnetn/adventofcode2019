(ns advent.core-test
  (:require [clojure.test :refer :all]
            [advent.day1 :refer :all]))

(deftest getfuel-tests
  (testing "(12)"
    (is (= (getFuel 12) 2)))
  (testing "(14)"
    (is (= (getFuel 14) 2)))
  (testing "(1969)"
    (is (= (getFuel 1969) 654)))
  (testing "(100756)"
    (is (= (getFuel 100756) 33583)))
)

(deftest getfuelformodule-tests
  (testing "some random data"
    (is (= (getFuelForModules [138828 82053 75644 86659 85337]) 156162)))
)

(deftest getfuelforfuel-tests
  (testing "14"
    (is (= (getFuelForFuel 14) 2)))
  (testing "1969"
    (is (= (getFuelForFuel 1969) 966)))
  (testing "100756"
    (is (= (getFuelForFuel 100756) 50346)))
)
(deftest day1-tests
  (testing "some random data"
    (is (= (day1 [138828 82053 75644 86659 85337]) 234101)))
)
