(defn last [coll]
  (let [x (next coll)]
     (if (nil? x)
     (first coll)
      (recur x))))
 
'another solution'

(defn last1 [coll]
  (first(reverse coll)))
      
