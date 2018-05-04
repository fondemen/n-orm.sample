package com.googlecode.n_orm.sample.businessmodel;

import java.io.IOException;
import java.net.InetAddress;
import java.util.Map;

import com.googlecode.n_orm.StoreSelector;
import com.googlecode.n_orm.hbase.HBaseLauncher;
import com.googlecode.n_orm.hbase.Store;

public class HBaseTestLauncher {
	//The following is unecessary for production code: all information is available in the nearest store.properties
	// (here in src/test/resources/com/googlecode/n_orm/sample/store.properties found from the classpath)
	static { //Launching a test HBase data store if unavailable
			try {
				if (		System.getProperty("PATH") == null
						&& !System.getenv().containsKey("JAVA_HOME"))
					throw new RuntimeException("JAVA_HOME must be set for mappers to run properly");
				
				HBaseLauncher.withMapReduce = true;
		        HBaseLauncher.prepareHBase(BookStore.class);
		        if (HBaseLauncher.hBaseServer != null) {
		        	// Minicluster launched as no real HBase found ; forcing created store for test classes
			        StoreSelector.getInstance().setPropertiesFor(BookStore.class, HBaseLauncher.hbaseStore);
			        StoreSelector.getInstance().setPropertiesFor(Book.class, HBaseLauncher.hbaseStore);
			        StoreSelector.getInstance().setPropertiesFor(Novel.class, HBaseLauncher.hbaseStore);
		        }
			} catch (IOException e) {
				throw new RuntimeException(e);
			}
//		}
	}
}
