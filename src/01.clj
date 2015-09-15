(ns proj-euler)

(defn- multiple-of-three-or-five?
  [n]
  (or (= 0 (mod n 3))
      (= 0 (mod n 5))))

(defn sum-of-multiples-below
  [limit]
  (let [nums (filter multiple-of-three-or-five? (range limit))]
    (reduce + nums)))

(defn problem-one
  "sum of multiples of 3 or 5 below 1000"
  []
  (= 233168 (sum-of-multiples-below 1000)))
