package listeners;

import java.util.Date;

import javax.servlet.http.HttpSessionActivationListener;
import javax.servlet.http.HttpSessionEvent;
import javax.servlet.http.HttpSessionListener;

/**
 * Application Lifecycle Listener implementation class WebAppSessionListener
 *
 */
public class WebAppSessionListener implements HttpSessionListener, HttpSessionActivationListener {

    public WebAppSessionListener() {
        // TODO Auto-generated constructor stub
    }

    public void sessionDidActivate(HttpSessionEvent evt) {
    	System.out.println("Entra Sesion Did Activa");
    }

    public void sessionWillPassivate(HttpSessionEvent evt) {
    	System.out.println("Entra Sesion will Activa");
    }

    public void sessionCreated(HttpSessionEvent evt) {
    	System.out.println("Entra Sesion Created");
    	System.out.println("1: " + new Date(evt.getSession().getCreationTime()));
    	System.out.println("2: " + evt.getSession().getId());
    	System.out.println("3: " + evt.getSession().getMaxInactiveInterval());
    }

    public void sessionDestroyed(HttpSessionEvent evt) {
    	System.out.println("Entra Sesion Destroyed");
    	System.out.println("1: " + new Date());
    	System.out.println("1: " + new Date(evt.getSession().getLastAccessedTime()));
    	System.out.println("2: " + evt.getSession().getId());
    	System.out.println("3: " + evt.getSession().getMaxInactiveInterval());
    }
	
}
