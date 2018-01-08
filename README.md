[![Build Status](https://travis-ci.org/fondemen/n-orm.sample.svg?branch=redis)](https://travis-ci.org/fondemen/n-orm.sample)

This is an example project using n-orm for Redis.
See https://github.com/fondemen/n-orm.core/ and https://github.com/fondemen/n-orm.redis/ for more details and updates.

To run the project on a running local Redis server, adapt files (if not on localhost)
/src/test/tesources/com/googlecode/n_orm/sample/business/store.poperties
and
/src/main/tesources/com/googlecode/n_orm/sample/business/store.poperties
so that they point to the correct Redis server configuration.
You can then run "mvn clean test".

Files store.properties may appear anywhere in the classpath, anywhere in the package hierarchy (deepest found first).

To create a jar for sample into "target" directory:
mvn clean package

To create a self-contained jar:
mvn clean package assembly:single

To run the self-contained jar:
 - start your Redis server
 - point to your Redis installation into src/main/resources/com/googlecode/n_orm/sample/business/store.poperties
 - java -ea -jar target/sample-redis-<n-orm version>-jar-with-dependencies.jar: you should see a message that program works
