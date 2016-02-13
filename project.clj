(defproject demonstrate_def "1"
  :description "A demonstration of def changing values in only the thread that it is called."
  :url "http://wwww.smashcompany.com/"
  :license {:name "Eclipse Public License"
            :url "http://www.eclipse.org/legal/epl-v10.html"}
  :dependencies [[org.clojure/clojure "1.6.0"]]
  :disable-implicit-clean true
  :warn-on-reflection true
  :main demonstrate-def.core
  :jvm-opts ["-Xms50m" "-Xmx50m" "-XX:-UseCompressedOops"])

