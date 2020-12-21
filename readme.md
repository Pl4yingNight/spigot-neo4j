# Spigot -> Neo4j & Redis
+ compiled using Java 8
+ jdk1.8.0_162
+ maven goals: clean compile assembly:single

## Environment
+ Neo4j Database
+ Redis Database

The credentials of the above databases must be added to the config.yml file in the `paper-spigot-1.16.4/plugins/Snowflake/` folder prior the server start!

## Starting
+ start the server => start.sh (might get opened in git shell under windows)
+ watch the console -> logs in logs folder

## Prior usuage of this Repo:
With this Repo the Error stated at [neo4j-ogm](https://github.com/neo4j/neo4j-ogm/issues/728) can be reproduced -> see commit [new error + old error fixed by neo4j-ogm team](https://github.com/Pl4yingNight/spigot-neo4j/tree/6b64d957cd9c3712dccee87880380093cc432eac)
