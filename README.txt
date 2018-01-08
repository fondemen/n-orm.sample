This is an example project using n-orm using the embedded non-persistent non-distributed memory store. See https://github.com/fondemen/n-orm.core/ for more details.

Check other branches of this project to see how to use another store, such as mongo, hbase-1.0 or redis.

To run the project, just run maven (maven 2 required):
mvn clean test

To create a jar for sample into "target" directory:
mvn clean package

To create a self-contained jar:
mvn clean package assembly:single

To run the self-contained jar:
 - mvn clean package assembly:single
 - java -ea -jar target/sample-<n-orm version>-jar-with-dependencies.jar