(ns genegraph.docs
  (:require [clojure.data.json :as json]
            [clojure.java.io :as io]))

(defonce zeb2
  (with-open [r (io/reader (io/resource "zeb2.json"))]
    (json/read r)))


