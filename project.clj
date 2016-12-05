(defproject big-solutions/lein-mvn "0.1.0"
  :description "Run Maven commands from Leiningen"
  :url "https://github.com/big-solutions/lein-mvn"
  :license {:name "Eclipse Public License"
            :url "http://www.eclipse.org/legal/epl-v10.html"}
  :dependencies [[org.apache.maven/maven-embedder "3.0.4"]]
  :deploy-repositories [["releases" {:url          "https://clojars.org/repo"
                                     :sign-releases false}]]
  :eval-in-leiningen true)
