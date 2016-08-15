package listeners;

import java.sql.Connection;
import java.sql.DatabaseMetaData;

import javax.servlet.ServletContext;
import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;

import utils.AppInfo;
import utils.Constantes;
import db.Conexion;

/**
 * Application Lifecycle Listener implementation class WebAppListener
 *
 */
public class WebAppListener implements ServletContextListener {

    public WebAppListener() {

    }

    public void contextInitialized(ServletContextEvent evt) {
    	String contexto = evt.getServletContext().getServletContextName();
    	ServletContext sc = evt.getServletContext();    	
    	System.out.println("Inicializa Contexto " + contexto);
    	try {
			Conexion cnn = new Conexion();
			Connection cn = cnn.conectar();
			DatabaseMetaData dmd = cn.getMetaData();
			String usuario = dmd.getUserName().split("@")[0];
			String server = dmd.getUserName().split("@")[1];
			String database = cn.getCatalog();
			String version = Constantes.VERSION_SISTEMA;
			sc.setAttribute("APP_NAME", contexto);
			sc.setAttribute("SERVER_DB", server);
			sc.setAttribute("USER_DB", usuario);
			sc.setAttribute("NAME_DB", database);
			sc.setAttribute("VERSION_APP", version);
			if (!cn.isClosed())	{		 
				cn.close();
			}
			AppInfo.Info(contexto, version, database, usuario, server);
			
		} catch (Exception e) {
			e.printStackTrace();
		}
    }

    public void contextDestroyed(ServletContextEvent evt) {
    	System.out.println("Destruyendo Contexto " + evt.getServletContext().getServletContextName());
    }

}
