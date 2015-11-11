(ns pedestal-playground.interceptor
  (:require [io.pedestal.interceptor.helpers :refer [defaround]]
            [io.pedestal.interceptor :refer [interceptor]]
            [clj-time.core :as t]
            [io.pedestal.log :as log]))

(defaround log-time
  ([context]
    (assoc context :req-received-time (t/now)))
  ([context]
    (log/info :execution-time (t/in-millis (t/interval (:req-received-time context) (t/now))))
    context))


(def forbidden
  (interceptor
    {:name ::forbidden
     :enter
           (fn [context]
             (assoc context :response
                            {:status 403 :body "Forbidden!"
                             :headers {"Content-Type" "text/plain"}}))}))