package servlets;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import bean.RespuestaSimple;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

public class ValidarUsuario extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public ValidarUsuario() {
        super();
    }

	public void destroy() {
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		hacerErrorGet(request,response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		hacer(request,response);
	}

	private void hacer(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		HttpSession session = request.getSession();
		session.setMaxInactiveInterval(10000); 
		
		Long ultimoAcceso = session.getLastAccessedTime();
		System.out.println("ultimoAcceso: "+new Date(ultimoAcceso));
		
		PrintWriter out = response.getWriter();
		
		String username = request.getParameter("username")==null?"":request.getParameter("username");
		String password = request.getParameter("password")==null?"":request.getParameter("password");
		String op = request.getParameter("op")==null?"0":request.getParameter("op");
		Integer opcion = Integer.valueOf(op);	
		System.out.println("opcion:"+opcion);
		String dataLista = "";
		Gson gson = new GsonBuilder().create();
		RespuestaSimple rpta = new RespuestaSimple();
		try {
			switch (opcion) {
				case 0: //Verifica Sesión
					username = (String) session.getAttribute("user")==null?"X":(String)session.getAttribute("user");
					if(!username.equals("X")){
						rpta.setRespuesta("True");
						rpta.setMensaje("principal.jsp");
					} else {
						rpta.setRespuesta("Copyright");
						rpta.setMensaje("Por favor no jugar");
					}
					break;
				case 1: //Login
					if(username.equals("admin") && password.equals("Petroperu")){
						session.setAttribute("user", username);
						rpta.setRespuesta("True");
						rpta.setMensaje("principal.jsp");
					}else{
						rpta.setRespuesta("False");
						rpta.setMensaje("Error en nombre de usuario o password");
					}
					break;
				case 2: //Cerrar Sesion
					username = (String) session.getAttribute("user")==null?"X":(String)session.getAttribute("user");
					if(!username.equals("X")){
						session.removeAttribute("user");//abarrios
						rpta.setRespuesta("True");
						rpta.setMensaje("index.jsp");
					} else {
						rpta.setRespuesta("Copyright");
						rpta.setMensaje("Por favor no jugar");
					}
					break;
				default:
					rpta.setRespuesta("False");
					rpta.setMensaje("Error al conectar");
					break;
			}
			
		} catch (Exception e) {
			System.out.println("Entra a Exception");
			rpta.setRespuesta("False");
			rpta.setMensaje("Error: "+ e.getMessage());
		} finally {
			dataLista = gson.toJson(rpta);
			//System.out.println("data: "+dataLista);
			response.setContentType("text/html");
			out.print(dataLista);
		}
	}
	
	private void hacerErrorGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		HttpSession session = request.getSession();
		session.setMaxInactiveInterval(10000); 
		
		PrintWriter out = response.getWriter();
		response.setContentType("text/html");
		StringBuilder sb = new StringBuilder();
		
		String username = (String) session.getAttribute("user")==null?"X":(String)session.getAttribute("user");
		if(username.equals("X")) {
			sb.append("Ud. esta tratando de ingresar al sistema por medios no seguros.<br />")
			.append("Por favor cierre esta pagina!, o lo ubicaremos y lo demandaremos por intentar violar la seguridad de esta pagina");	
		}else {
			sb.append("Estimado Usuario: ")
			.append(username).append(".<br />")
			.append("Por favor no intente ingresar por otros medios que no sea permitido, lo estamos vigilando!")
			.append("Haga Clic <a href='principal.jsp'>aqui</a>, para ser redireccionado, al menu principal.");
		}

		out.write(sb.toString());
	}
}
