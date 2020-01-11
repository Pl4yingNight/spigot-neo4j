package at.pl4yingnight.testplugin.database;

import java.util.ArrayList;
import java.util.List;

import org.neo4j.ogm.config.Configuration;
import org.neo4j.ogm.config.Configuration.Builder;
import org.neo4j.ogm.session.Session;
import org.neo4j.ogm.session.SessionFactory;

public class Neo4j {

	private Configuration configuration;
	private Session session;
	private List<String> packages = new ArrayList<String>();
	
	public Neo4j(String address, String user, String password) {
		Builder builder = new Configuration.Builder();
		builder.uri(address).credentials(user, password).verifyConnection(true);
		builder.useNativeTypes();
		configuration = builder.build();
		
	}
	
	public boolean conntect() {
		try {
			SessionFactory sessionFactory = new SessionFactory(this.configuration, (String[]) this.packages.toArray(new String[this.packages.size()]));
			this.session = sessionFactory.openSession();
		} catch (Exception e) {
			e.printStackTrace();
			return false;
		}
		return true;
	}

	public boolean disconntect() {
		return true;
	}

	public void addPackage(String nodePackage) {
		this.packages.add(nodePackage);
	}

	public Session getSession() {
		return this.session;
	}

}
