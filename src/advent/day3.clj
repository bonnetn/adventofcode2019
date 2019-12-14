(ns advent.day3)

(require 'clojure.set)

(defn direction-to-vector [direction]
  (case direction
    \U [0 1]
    \D [0 -1]
    \R [1 0]
    \L [-1 0]))

(defn add-vec [[x1 y1] [x2 y2]]
  [(+ x1 x2) (+ y1 y2)])

(defn get-position-position-on-path [path position]
  (let [intersection (first (filter #(= (last %) position) (map-indexed vector path)))]
    (if (nil? intersection)
      nil
      (inc (first intersection)))))

(defn get-day3-part2-distance [path1 path2 position]
  (+ (get-position-position-on-path path1 position) (get-position-position-on-path path2 position)))

(defn get-movement-offsets [move]
  (let [direction (direction-to-vector (first move))
        distance (read-string (subs move 1))]
    (replicate distance direction)))

(defn get-path-offsets [path]
  (apply concat (map get-movement-offsets path)))

(defn get-path-positions [path]
  (reductions add-vec (get-path-offsets path)))

(defn day3 [path1 path2]
  (let [path1-positions (get-path-positions path1)
        path2-positions (get-path-positions path2)
        get-distance (partial get-day3-part2-distance path1-positions path2-positions)
        intersections (clojure.set/intersection (set path1-positions) (set path2-positions))
        intersections-with-distance (map #(vector (get-distance %) %) intersections)]
    (first (apply min-key #(first %) intersections-with-distance))))



