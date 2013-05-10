(ns metrics.ring.test.instrument
  (:require [metrics.ring.instrument :as instrument]
            [clojure.test :refer :all]))

(deftest mark-in!
  (is (= 1 2)))

; #'instrument/mark-in!
; #'instrument/get-timer
; instrument/instrument
; (let [_ (metrics.core/remove-metric ["metrics-meter" "met" "meter"])


