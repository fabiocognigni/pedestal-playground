(ns pedestal-playground.interceptor
  (:require [io.pedestal.interceptor.helpers :refer [defaround]]
            [clj-time.core :as t]
            [io.pedestal.log :as log]))

(defaround log-time
  ([context]
    (assoc context :req-received-time (t/now)))
  ([context]
    (log/info :execution-time (t/in-millis (t/interval (:req-received-time context) (t/now))))
    context))
