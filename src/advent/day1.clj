(ns advent.day1)

(require '[clojure.string :as str])

(defn getFuel [mass]
  (- (quot mass 3) 2)
  )

(defn getFuelForModules [modules]
  (reduce + (map getFuel modules))
  )

(defn getFuelForFuel [fuelMass]
  (if (<= fuelMass 0) 
    0
    (getFuelForFuel fuelMass)
    )
  )

(defn day1 [modules]
  (let [fuelForModules (getFuelForModules modules)
        fuelForFuel (reduce + (map getFuelForFuel (map getFuel modules))) ]
    (+ fuelForModules fuelForFuel)
    )
  )
