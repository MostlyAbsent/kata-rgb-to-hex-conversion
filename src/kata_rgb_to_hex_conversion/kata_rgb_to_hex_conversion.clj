(ns kata-rgb-to-hex-conversion.kata-rgb-to-hex-conversion)

(defn hexify [a]
  (format "%02X" a))

(defn normalize-val [a]
  (cond
    (> a 255) 255
    (< a 0) 0
    :else a))

(defn rgb [r g b]
  (->> [r g b]
       (map normalize-val)
       (map hexify)
       clojure.string/join))
