package utils;

import java.util.HashMap;
import java.util.Map;

public class Constantes {
	
/
	
	 public static String MAIL_SERVIDOR = "smtp.gmail.com" ; 
	
	 public static String MAIL_PUERTO = "587"; 
	
	 public static String MAIL_PASSWORD = "prjirbyecuoxblg
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
	


}
