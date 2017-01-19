(ns sadness2.env
  (:require [clojure.tools.logging :as log]))

(def defaults
  {:init
   (fn []
     (log/info "\n-=[sadness2 started successfully]=-"))
   :stop
   (fn []
     (log/info "\n-=[sadness2 has shut down successfully]=-"))
   :middleware identity})
