package db;

import java.sql.Connection;
import java.util.Properties;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;
import javax.sql.DataSource;

public class Conexion {
	
	private Connection cnn = null;

	public Conexion() throws Exception {

	}
	
    public Connection conectar() throws Exception {
        DataSource ds;
        InitialContext ic;
        Context cox;
        try {
            //ic = (InitialContext) getInitialContext(); //jboss
            //cox = getInitialContext();
            ic= new InitialContext();
            //ds = (DataSource) ic.lookup("java:/session");
            cox = (Context) ic.lookup("java:comp/env");
            ds = (DataSource) cox.lookup("jdbc/session");
            //ds = (DataSource) cox.lookup("java:/comp/env/jdbc/session");
            cnn = ds.getConnection();
        } catch (Exception e) {
            System.out.println("Exception thrown " + e);
            throw new Exception(e);
        } 
        return cnn;
    }
        
	@SuppressWarnings("unused")
	private Context getInitialContext() throws NamingException {
        Properties env = new Properties();
        env.put(Context.INITIAL_CONTEXT_FACTORY, "org.jnp.interfaces.NamingContextFactory");
        env.put(Context.PROVIDER_URL, "localhost");
        env.put(Context.URL_PKG_PREFIXES, "org.jboss.naming:org.jnp.interfaces");
        Context ctx = new InitialContext(env);
        return ctx;
    }
}
