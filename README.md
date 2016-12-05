# lein-mvn

A Leiningen plugin to run Maven commands.

## Usage

To use this plugin, copy the following:


[![Clojars Project](https://img.shields.io/clojars/v/big-solutions/lein-mvn.svg)](https://clojars.org/big-solutions/lein-mvn)


into the `:plugins` vector of your project.clj or your `:user` profile.


Run the `lein-mvn` plugin:

    $ lein mvn ... a list of maven commands and options
    
e.g.

    $ lein mvn clean compile install
    $ lein mvn -V
    $ lein mvn -f ./other/pom.xml jetty:run

## License

Copyright © 2016 Big Solutions

Distributed under the Eclipse Public License either version 1.0 or (at
your option) any later version.
