## This is the package with which the Error stated at [neo4j-ogm](https://github.com/neo4j/neo4j-ogm/issues/728) can be reproduced
+ Eclipse
+ compiled using Java 8
+ jdk1.8.0_162
+ maven goals: clean compile assembly:single

## Environment
+ Neo4j Database matching the login from the config.yml file in the servers plugins/TestPlugin folder

## Debugging
+ copy into the plugins folder of the test server (eventually replace the jar | config can stay)
+ start the server => start.sh (might get opened in git shell under windows)
+ watch the console -> logs in logs folder
