This is an example project using n-orm for HBase.
See http://n-orm.googlecode.com for more details and updates (look at sources).

To run the project on a running HBase, adapt file (if not on localhost)
/src/test/tesources/com/googlecode/n_orm/sample/business/store.poperties
so that it points to the correct HBase configuration. You can then run "mvn test".

For production, you should prefer the variant presented in src/main/resources/com/googlecode/n_orm/sample/business/store.properties.

Files store.properties may appear anywhere in the classpath, anywhere in the package hierarchy (deepest found first).

To create a jar for sample into "target" directory:
mvn package

To create a self-contained jar (without HBase dependencies):
mvn package assembly:single

To run the self-contained jar:
 - start your HBase cluster
 - point to your HBase installation (with HBase configuration and jars) into src/main/resources/com/googlecode/n_orm/sample/business/store.poperties
 - mvn clean package assembly:single -DskipTests (-DskipTests in order to avoid firing tests and thus create test objects in the HBase cluster)
 - java -ea -jar target/sample-hbase-<HBase driver version>-n_orm-<n-orm version>-jar-with-dependencies.jar ; you should see a message showing that it works.
