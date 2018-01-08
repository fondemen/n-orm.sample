This is an example project using n-orm for Mongo.
See https://github.com/fondemen/n-orm.core/ and https://github.com/fondemen/n-orm.mongo/ for more details and updates.

To run the project on a running local Mongo server, adapt files (if not on localhost)
/src/test/tesources/com/googlecode/n_orm/sample/business/store.poperties
and
/src/main/tesources/com/googlecode/n_orm/sample/business/store.poperties
so that they point to the correct Mongo server configuration.
You can then run "mvn clean test".

Files store.properties may appear anywhere in the classpath, anywhere in the package hierarchy (deepest found first).

To create a jar for sample into "target" directory:
mvn clean package

To create a self-contained jar:
mvn clean package assembly:single

To run the self-contained jar:
 - start your MongoDB cluster
 - point to your MongoDB installation into src/main/resources/com/googlecode/n_orm/sample/business/store.poperties
 - java -ea -jar target/sample-mongo-<n-orm version>-jar-with-dependencies.jar: you should see a message that program works