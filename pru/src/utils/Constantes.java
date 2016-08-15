package utils;

import java.util.HashMap;
import java.util.Map;

public class Constantes {
	
//	public static String MAIL_SERVIDOR = "mailofp.petroperu.com.pe" ; 
//	public static String EMAIL_FROM = "administrador@petroperu.com.pe";
//	//public static String EMAIL_FROM = "Gerencia General";
//	public static String MAIL_PUERTO = "25"; 
//	public static String MAIL_USUARIO =  "user"; 
//	public static String MAIL_PASSWORD = "password";
//	public static String MAIL_DOMAIN = "petroperu.com.pe"; 
	
	 public static String MAIL_SERVIDOR = "smtp.gmail.com" ; 
	 public static String EMAIL_FROM = "petroperu.app@gmail.com";
	 public static String MAIL_PUERTO = "587"; 
	 public static String MAIL_USUARIO =  "petroperu.app@gmail.com";
	 public static String MAIL_PASSWORD = "prjirbyecuoxblgk";
	 public static String MAIL_DOMAIN = "gmail.com"; 

	//Const. de tipo de usuarios
	public static String RESPONSABLE = "0";
	public static String CONTACTO_UNO = "1";
	public static String CONTACTO_DOS = "2";
	
	public static Long REVISION_INICIAL = 1L;
	public static Long ESTADO_REGISTRADO = 1L;//REGISTRADO
	public static Long ESTADO_EN_TRABAJO = 2L;//EN PROGRESO
	public static Long ESTADO_CERRADO = 3L;//TERMINADO
	public static Long ESTADO_CANCELADO = 4L;
	public static Long ESTADO_VISADO = 5L;
	public static Long ESTADO_ASIGNADO = 6L;//ASIGNADO
	public static Long ESTADO_CONCLUIDO = 7L;//CONCLUIDO
	
	/** Estados Contacto **/
	public static String ESTADO_CONTACTO_HABILITADO = "1";
	public static String ESTADO_CONTACTO_INHABILITADO = "0";
	
	/**Roles del Sistema****************************/
	public static Long ROL_ADMINISTRADOR = 1L;
	public static Long ROL_GESTOR_ACUERDO = 2L;
	public static Long ROL_GESTOR_EVIDENCIA = 3L;
	public static Long ROL_CONSULTAS = 4L;
	public static Long ROL_REGISTRADOR = 5L;
	public static Long ROL_ASIGNADOR = 6L;
	/***********************************************/
	
	/**Tipos de Sistema*****************************/
	public static String acuerdosClase = "A";
	public static String pedidosClase = "P";
	/***********************************************/
	
	/**Link de pagina seg�n el tipo uede clase Acuerdo o Pedido***/
	public static String linkAcuerdoTema = "EditRegTema.jsp";
	public static String linkPedidoTema = "EditRegTemaPedido.jsp";
	
	public static String linkRegAcuerdo = "RegAcuerdo.jsp";
	public static String linkRegPedido = "RegPedido.jsp";

	public static String linkRegEviAcuerdo = "RegActividad.jsp";
	public static String linkRegEviPedido = "RegActividadPedido.jsp";
	/************************************************/
	
	/**Datos del Sistema****/
	public static String VERSION_SISTEMA = "© 2016 Petróleos del Perú - PETROPERÚ S.A.";
	public static String NOMBRE_SISTEMA = "Sistema de Seguimiento de Acuerdos y Pedidos de Directorio";
	public static String TEXTO_SISTEMA = "Este sistema permite a Secretaría General, llevar el seguimiento y monitoreo de los acuerdos y pedidos de directorio de manera sistematizada, rápida y eficaz, permitiéndole generar informes de avance y reportes estadísticos en base a los cumplimientos de los acuerdos y pedidos de directorio de las distintas áreas responsables.";
	/*************************************************/
//	  
	
	
//	public static String SERVER_PATH_ACUERDOS = "C:\\opt\\tomcat\\Adjuntos\\archivos_acuerdos\\"; 
//	public static String SERVER_PATH_PEDIDOS = "C:\\opt\\tomcat\\Adjuntos\\archivos_pedidos\\";
//	public static String SERVER_PATH_EVID_ACUERDOS = "C:\\opt\\tomcat\\Adjuntos\\evidencias_acuerdos\\";
//	public static String SERVER_PATH_EVID_PEDIDOS = "C:\\opt\\tomcat\\Adjuntos\\evidencias_pedidos\\";
//	
	public static String SERVER_PATH_ACUERDOS = "/opt/tomcat/Adjuntos/archivos_acuerdos/";
	public static String SERVER_PATH_PEDIDOS = "/opt/tomcat/Adjuntos/archivos_pedidos/";
	public static String SERVER_PATH_EVID_ACUERDOS = "/opt/tomcat/Adjuntos/evidencias_acuerdos/";	
	public static String SERVER_PATH_EVID_PEDIDOS = "/opt/tomcat/Adjuntos/evidencias_pedidos/";
	
	
	
	//public static String URL_APP = "http://syslog.petroperu.com.pe:8080/AcuerdosTest";
	public static String URL_APP = "http://syslog.petroperu.com.pe:8080/Acuerdos_B";
	//public static String URL_APP = "http://intranet.petroperu.com.pe:8080/Acuerdos";
	
	public static Long CONSTANTE_PEDIDO = 1L;
	
	private Map<Long,String> roles = new HashMap<Long,String>();

	
	public Constantes() {
		// TODO Ap�ndice de constructor generado autom�ticamente
		
		roles.put(ROL_ADMINISTRADOR,"ADMINISTRADOR APLICACI�N");
		roles.put(ROL_GESTOR_ACUERDO,"GESTOR DE ACUERDOS O PEDIDOS");
		//roles.put(ROL_GESTOR_EVIDENCIA,"GESTOR DE EVIDENCIAS");
		roles.put(ROL_CONSULTAS,"CONSULTAS");
		roles.put(ROL_REGISTRADOR,"REGISTRADOR");
		roles.put(ROL_ASIGNADOR,"ASIGNADOR");		
		
	
	}
	
	public Map<Long,String> obtenerRoles() {
		return roles;
	}
	

	public String obtenerRol(Long idrol) {
		return roles.get(idrol);
	}
	


}
