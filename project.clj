(defproject pedestal-playground "0.0.1-SNAPSHOT"
  :description "Pedestal playground"
  :url "http://example.com/FIXME"
  :license {:name "Eclipse Public License"
            :url "http://www.eclipse.org/legal/epl-v10.html"}
  :dependencies [[org.clojure/clojure "1.6.0"]
                 [io.pedestal/pedestal.service "0.4.0"]
                 [io.pedestal/pedestal.jetty "0.4.0"]
                 [ch.qos.logback/logback-classic "1.1.2" :exclusions [org.slf4j/slf4j-api]]
                 [org.slf4j/jul-to-slf4j "1.7.7"]
                 [org.slf4j/jcl-over-slf4j "1.7.7"]
                 [org.slf4j/log4j-over-slf4j "1.7.7"]
                 [clj-time "0.11.0"]]
  :min-lein-version "2.0.0"
  :resource-paths ["config", "resources"]
  :profiles {:dev {:aliases {"run-dev" ["trampoline" "run" "-m" "pedestal-playground.server/run-dev"]}
                   :dependencies [[io.pedestal/pedestal.service-tools "0.4.0"]]}
             :uberjar {:aot [pedestal-playground.server]}}
  :main ^{:skip-aot true} pedestal-playground.server)

