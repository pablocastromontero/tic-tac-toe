(defproject web-tic-tac-toe "0.0.1"
  :description "A website deployable to AppEngine"
  :dependencies [[org.clojure/clojure "1.4.0"]
                 [joodo "0.10.0"]
                 [tic-tac-toe/tic-tac-toe "0.1.0-SNAPSHOT"]]

  :joodo-core-namespace web-tic-tac-toe.core

  ; leiningen 2
  :profiles {:dev {:dependencies [[speclj "2.2.0"]]}}
  :test-paths ["spec/"]
  :java-source-paths ["src/"]
  :plugins [[speclj "2.2.0"]]

  )
