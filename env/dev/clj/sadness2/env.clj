(ns sadness2.env
  (:require [selmer.parser :as parser]
            [clojure.tools.logging :as log]
            [sadness2.dev-middleware :refer [wrap-dev]]))

(def defaults
  {:init
   (fn []
     (parser/cache-off!)
     (log/info "\n-=[sadness2 started successfully using the development profile]=-"))
   :stop
   (fn []
     (log/info "\n-=[sadness2 has shut down successfully]=-"))
   :middleware wrap-dev})
