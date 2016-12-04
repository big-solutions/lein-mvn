(ns leiningen.mvn
  (:import (org.apache.maven.cli MavenCli)))

(defn mvn
  "I don't do a lot."
  [project & args]
  (let [mvn (new MavenCli)]
    (.doMain mvn (into-array String args) "." System/out System/err)))
