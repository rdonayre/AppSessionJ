package utils;

public class AppInfo {

	public static void Info(String appName, String version, String database, String usuario, String server) {
		if(usuario!=null){
			System.out.println("***************************************************************************************");
			System.out.println("-- Nombre de Aplicación: " + appName);
			System.out.println("-- Versión de Aplicación: " + version);
			System.out.println("-- Nombre de la Base de Datos: " + database);
			System.out.println("-- Usuario de Base de Datos: " + usuario); 
			System.out.println("-- Hostname de la Base de Datos: "+ server);
			System.out.println("***************************************************************************************");
		} else {
			System.out.println("***************************************************************************************");
			System.out.println("-- Error en conexión --");
			System.out.println("***************************************************************************************");
		}
			
	}
}
