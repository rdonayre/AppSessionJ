package mail;

import java.util.ArrayList;


public class principal {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		ObjectMail mail = new ObjectMail();
		String to = "jsalazar.winner@gmail.com";
		ArrayList<String> cc = new ArrayList<String>();
		
		//cc.add("gcondori@pe.ibm.com"); //
		cc.add("jsalazar.winner@gmail.com"); //
		String asunto = "prueba adjunto";
		String cuerpoMensaje = "algún cuerpo de mensaje que tenga texto";
		
		ArrayList<String> files = new ArrayList<String>();
		files.add("d:/coope_prest.pdf");
		System.out.println("envio");
		if(mail.enviarMail(to, cc, Constantes.EMAIL_FROM, asunto, cuerpoMensaje, files)) 
			System.out.println("ok");
		else
			System.out.println("error");
	}

}
