(ns advent.day1)

(require '[clojure.string :as str])

(defn getFuel [mass]
  (- (quot mass 3) 2)
)

(defn getFuelForModules [modules]
  (reduce + (map getFuel modules))
)

(defn getFuelForFuel [fuelMass]
  (def fuel (getFuel fuelMass))
  (if (<= fuel 0) 
    0
    (+ fuel (getFuelForFuel fuel))
  )
)

(defn day1 [modules]
  (def fuelForModules (getFuelForModules modules))
  (def fuelForFuel (reduce + (map getFuelForFuel (map getFuel modules))))
  (+ fuelForModules fuelForFuel)
)
