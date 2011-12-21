(defproject vmfest "0.2.4-SNAPSHOT"
  :description "Manage local VMs from the REPL"
  :dependencies [[org.clojure/clojure "1.3.0"]
                 [slingshot "0.10.0"]
                 [org.clojure/tools.logging "0.2.3"]
                 [org.clojars.tbatchelli/vboxjws "4.1.8"]
                 [fs "1.0.0"]]
  :dev-dependencies [[robert/hooke "1.1.2"]
                     [log4j/log4j "1.2.14"]
                     [lein-clojars "0.6.0"]]
  :test-selectors {:default (fn [v] (not (:integration v)))
                   :integration :integration
                   :all (fn [_] true)}
  :jar-exclusions [#"log4j.xml"])
