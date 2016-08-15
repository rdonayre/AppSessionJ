package mail;

public class Constantes {
	
	//public static String MAIL_SERVIDOR = "mailofp.petroperu.com.pe" ; //"smtp.gmail.com" ; //
	public static String MAIL_SERVIDOR = "smtp.gmail.com" ; //"smtp.gmail.com" ; //
	//public static String EMAIL_FROM = "administrador@petroperu.com.pe";//"giocchavez@gmail.com";//
	public static String EMAIL_FROM = "petroperu.app@gmail.com";//"giocchavez@gmail.com";//
	//public static String EMAIL_FROM = "Gerencia General";
	//public static String MAIL_PUERTO = "25"; //"587";//
	public static String MAIL_PUERTO = "587"; //"587";//
	//public static String MAIL_USUARIO =  "user"; //"giocchavez@gmail.com";//
	//public static String MAIL_PASSWORD = "password";
	public static String MAIL_USUARIO =  "petroperu.app@gmail.com"; //"giocchavez@gmail.com";//
	public static String MAIL_PASSWORD = "prjirbyecuoxblgk";
	//public static String MAIL_DOMAIN = "petroperu.com.pe"; // "gmail.com";//
	public static String MAIL_DOMAIN = "gmail.com"; // "gmail.com";//

	//Const. de tipo de usuarios
	public static String RESPONSABLE = "0";
	public static String CONTACTO_UNO = "1";
	public static String CONTACTO_DOS = "2";
	
	public static Long REVISION_INICIAL = 1L;
	public static Long ESTADO_REGISTRADO = 1L;
	public static Long ESTADO_EN_TRABAJO = 2L;
	public static Long ESTADO_CERRADO = 3L;
	public static Long ESTADO_CANCELADO = 4L;
	public static Long ESTADO_VISADO = 5L;
	public static Long ESTADO_ASIGNADO = 6L;
	
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
	
	/**Link de pagina según el tipo uede clase Acuerdo o Pedido***/
	public static String linkAcuerdoTema = "EditRegTema.jsp";
	public static String linkPedidoTema = "EditRegTemaPedido.jsp";
	
	public static String linkRegAcuerdo = "RegAcuerdo.jsp";
	public static String linkRegPedido = "RegPedido.jsp";

	public static String linkRegEviAcuerdo = "RegActividad.jsp";
	public static String linkRegEviPedido = "RegActividadPedido.jsp";
	/************************************************/
	
	/**Datos del Sistema****/
	public static String version_sistema = "© 2015 Petróleos del Perú - PETROPERÚ S.A.";
	public static String nombre_sistema = "Sistema de Seguimiento de Acuerdos y Pedidos de Directorio";
	public static String texto_sistema = "Este sistema permite a Secretaría General, llevar el seguimiento y monitoreo de los acuerdos y pedidos de directorio de manera sistematizada, rápida y eficaz, permitiéndole generar informes de avance y reportes estadísticos en base a los cumplimientos de los  acuerdos y pedidos de directorio de las distintas áreas responsables.";
	/*************************************************/
	//public static String SERVER_PATH_ACUERDOS = "C:\\archivos_acuerdos\\";//"archivos_acuerdos//";  
	public static String SERVER_PATH_ACUERDOS = "/opt/tomcat/Adjuntos/archivos_acuerdos//"; //"//opt//tomcat//Adjuntos//archivos_acuerdos//";
	//public static String SERVER_PATH_PEDIDOS = "C:\\archivos_pedidos\\";
	public static String SERVER_PATH_PEDIDOS = "//opt//tomcat//Adjuntos//archivos_pedidos//";
	//public static String SERVER_PATH_EVID_ACUERDOS = "C:\\evidencias_acuerdos\\";
	public static String SERVER_PATH_EVID_ACUERDOS = "//opt//tomcat//Adjuntos//evidencias_acuerdos//";
	//public static String SERVER_PATH_EVID_PEDIDOS = "C:\\evidencias_pedidos\\";
	public static String SERVER_PATH_EVID_PEDIDOS = "//opt//tomcat//Adjuntos//evidencias_pedidos//";
}
