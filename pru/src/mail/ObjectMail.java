package mail;

import java.io.File;

import java.util.ArrayList;
import java.util.Properties;

import javax.activation.DataHandler;

import javax.activation.FileDataSource;
import javax.mail.BodyPart;
import javax.mail.Message;
import javax.mail.MessagingException;

import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeBodyPart;
import javax.mail.internet.MimeMessage;
import javax.mail.internet.MimeMultipart;

public class ObjectMail {

	
	private boolean estado = false;

	// private String nameHost = "mail.smtp.host";
	/*
	 * private String to; private String from; private String message;
	 */

	public ObjectMail() {
	}

	public void enviarMail() {

	}

	public boolean enviarMail(String to, ArrayList<String> cc, String from,
			String subject, String msgText, ArrayList<String> attachFiles) {

		Properties props = new Properties();
		props.put("mail.smtp.host", Constantes.MAIL_SERVIDOR);
		props.setProperty("mail.smtp.starttls.enable", "true");
		props.setProperty("mail.smtp.port", "587");
		props.setProperty("mail.smtp.user", Constantes.MAIL_USUARIO);
		props.setProperty("mail.smtp.auth", "true");

		Session session = Session.getDefaultInstance(props, null);
		session.setDebug(true);
		BodyPart adjunto = new MimeBodyPart();
		try {
			BodyPart texto = new MimeBodyPart();
			texto.setText(msgText);

			MimeMultipart multiParte = new MimeMultipart();

			for (String filename : attachFiles) {
				File f = new File(filename);
				adjunto = new MimeBodyPart();
				adjunto.setDataHandler(new DataHandler(new FileDataSource(f)));
				adjunto.setFileName(f.getName());
				multiParte.addBodyPart(adjunto);
			}

			multiParte.addBodyPart(texto);

			MimeMessage message = new MimeMessage(session);

			// Se rellena el From
			message.setFrom(new InternetAddress(from));

			// Se rellenan los destinatarios
			message.addRecipient(Message.RecipientType.TO, new InternetAddress(
					to));

			// Se rellena el subject
			message.setSubject(subject);

			// Se mete el texto y la foto adjunta.
			message.setContent(multiParte);

			// Se envia el correo.
			Transport t = session.getTransport("smtp");
			t.connect(Constantes.MAIL_SERVIDOR, Constantes.MAIL_USUARIO,
					Constantes.MAIL_PASSWORD);
			t.sendMessage(message, message.getAllRecipients());
			t.close();
			estado=true;
			// Transport.send(message);
			System.out.println("Sent message successfully....");
		} catch (MessagingException mex) {
			mex.printStackTrace();
		}
		return estado;
	}

}
