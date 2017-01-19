(ns user
  (:require [mount.core :as mount]
            sadness2.core))

(defn start []
  (mount/start-without #'sadness2.core/http-server
                       #'sadness2.core/repl-server))

(defn stop []
  (mount/stop-except #'sadness2.core/http-server
                     #'sadness2.core/repl-server))

(defn restart []
  (stop)
  (start))


