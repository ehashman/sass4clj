(defproject ehashman/sass4clj "0.1.0-SNAPSHOT"
  :description "Clojure wrapper for jsass"
  :lein-release {:deploy-via :clojars}
  :url "https://github.com/ehashman/sass4clj"
  :license {:name "Eclipse Public License"
            :url "http://www.eclipse.org/legal/epl-v10.html"}
  :dependencies [[org.clojure/clojure "1.8.0"]
                 [io.bit3/jsass "3.3.1"]

                 [org.webjars/webjars-locator "0.29"]
                 ;; Webjars-locator uses logging
                 [org.slf4j/slf4j-nop "1.7.12"]

                 ;; For testing the webjars asset locator implementation
                 [org.webjars.bower/bootstrap "4.0.0-alpha"
                  :exclusions [org.webjars.bower/jquery]]]
  :plugins [[lein-auto "0.1.2"]
            [lein-cljfmt "0.3.0"]
            [jonase/eastwood "0.2.3"]
            [lein-pprint "1.1.1"]
            [lein-environ "1.0.2"]
            [lein-cloverage "1.0.7-SNAPSHOT"]]
  :min-lein-version "2.0.0"
  :profiles {:dependencies [[pjstadig/humane-test-output "0.7.1"]]
             :injections [(require 'pjstadig.humane-test-output)
                          (pjstadig.humane-test-output/activate!)]})
