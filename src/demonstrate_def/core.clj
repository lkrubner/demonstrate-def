(ns demonstrate-def.core
    (:gen-class))

(def users ["lisa" "meghan" "kwan" "svati"])
(def ^:dynamic banned ["higgins" "shon" "suela" "metz"])

(defn change-in-another-thread []
  (future
    (def users ["bill" "kirti" "carlitta" "mercer"])
    (Thread/sleep 10000)
    (println users))
  (println users))

(defn change-in-another-thread-2 []
  (future
    (def banned ["henson" "carlos" "vendia" "lola"])
    (Thread/sleep 10000)
    (println banned))
  (println banned))

(defn -main [& args]
  (change-in-another-thread)
  (change-in-another-thread-2))


