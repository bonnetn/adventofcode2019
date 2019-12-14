(ns advent.day2)

(defn instruction [operator memory instruction-pointer]
  (let [[opcode parameterAddr1 parameterAddr2 resultAddr] (drop instruction-pointer memory)
        param1 (nth memory parameterAddr1)
        param2 (nth memory parameterAddr2)]
    [(assoc memory resultAddr (operator param1 param2)) (+ instruction-pointer 4)]))

(defn run-opcode-instruction [opcode memory instruction-pointer]
  (if (= opcode 99) [memory (count memory)]
                    (instruction (case opcode
                                   1 +
                                   2 *) memory instruction-pointer)))

(defn compute [memory]
  (loop [memory memory
         instruction-pointer 0]
    (let [opcode (nth memory instruction-pointer)
          [memory instruction-pointer] (run-opcode-instruction opcode memory instruction-pointer)]
      (if (< instruction-pointer (count memory))
        (recur memory instruction-pointer)
        memory))))

(defn day2 [memory]
  (loop [v 0]
    (let [verb (mod v 100)
          noun (quot v 100)
          memory (assoc memory 1 noun 2 verb)
          result (compute memory)]
      (if (= (first result) 19690720)
        v
        (if (>= v 9999)
          nil
          (recur (inc v)))))))

