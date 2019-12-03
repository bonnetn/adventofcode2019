(ns advent.day1)

(require '[clojure.string :as str])

(defn getFuel [mass]
  (- (quot mass 3) 2)
)

(defn getFuelForModules [modules]
  (reduce + (map getFuel modules))
)

(defn getFuelForFuel [fuelMass]
  (let fuel (getFuel fuelMass))
  (if (<= fuel 0) 
    0
    (+ fuel (getFuelForFuel fuel))
  )
)

(defn day1 [modules]
  (let fuelForModules (getFuelForModules modules))
  (let fuelForFuel (reduce + (map getFuelForFuel (map getFuel modules))))
  (+ fuelForModules fuelForFuel)
)
