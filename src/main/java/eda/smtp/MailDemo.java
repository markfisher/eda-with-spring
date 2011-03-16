package eda.smtp;

import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSenderImpl;

public class MailDemo {

	public static void main(String[] args) {
		// create sender
		JavaMailSenderImpl sender = new JavaMailSenderImpl();
		sender.setHost("localhost");
		sender.setUsername("admin");
		sender.setPassword("admin");

		// create message
		SimpleMailMessage message = new SimpleMailMessage();
		message.setTo("mark@localhost");
		message.setSubject("EDA demo");
		message.setText("hello");
		
		// send it
		sender.send(message);
	}
}
