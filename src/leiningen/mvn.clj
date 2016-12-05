(ns leiningen.mvn
  (:import (org.apache.maven.cli MavenCli)))

(defn mvn
  "Run Maven commands from Leiningen."
  [_project & args]
  (let [mvn (new MavenCli)]
    (.doMain mvn (into-array String args) "." System/out System/err)))
