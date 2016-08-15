package servlets;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import utils.AppInfo;

public class AppVersion extends HttpServlet {
	private static final long serialVersionUID = 1L;
       

    public AppVersion() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		validationApp(request, response);
	}

	private void validationApp(HttpServletRequest req, HttpServletResponse resp){
		if(req.getRemoteAddr().equalsIgnoreCase("0:0:0:0:0:0:0:1") || req.getRemoteAddr().equalsIgnoreCase("127.0.0.1")) {
			String appName = (String) getServletContext().getAttribute("APP_NAME");
			String version = (String) getServletContext().getAttribute("VERSION_APP");
			String server = (String) getServletContext().getAttribute("SERVER_DB");
			String database= (String) getServletContext().getAttribute("NAME_DB");
			String usuario = (String) getServletContext().getAttribute("USER_DB");
				
			AppInfo.Info(appName, version, database, usuario, server);
		}
	}
}
