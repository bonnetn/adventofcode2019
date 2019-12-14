(ns advent.day3)

(require 'clojure.set)

(defn add-vec [[x1 y1] [x2 y2]]
  [(+ x1 x2) (+ y1 y2)])

(defn directionToVector [direction]
  (case direction
    \U [0 1]
    \D [0 -1]
    \R [1 0]
    \L [-1 0]))

(defn manhattan-norm [[x y]]
  (+ (Math/abs x) (Math/abs y)))


(defn get-movement-offsets [move]
  (let [direction (directionToVector (first move))
        distance (read-string (subs move 1))]
    (replicate distance direction)))

(defn get-path-offsets [path]
  (apply concat (map get-movement-offsets path)))

(defn get-path-positions [path]
  (set (reductions add-vec (get-path-offsets path))))

(defn day3 [path1 path2]
  (let [path1-positions (get-path-positions path1)
        path2-positions (get-path-positions path2)
        intersections (clojure.set/intersection path1-positions path2-positions)
        intersections-with-distance (map #(vector (manhattan-norm %) %) intersections)]
    (first (apply min-key #(first %) intersections-with-distance))))



