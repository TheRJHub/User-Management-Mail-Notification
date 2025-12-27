package org.TheRJHub.UserManagement.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
@Service
public class MailSenderUser {

	@Autowired
	private JavaMailSender jms;
	
	@PostMapping("/mail")
	public void sendMail(String to, String msg) {
		SimpleMailMessage mail=new SimpleMailMessage();
		mail.setTo(to);
		mail.setSubject("Data Inserted");
		mail.setText(msg);
		
		jms.send(mail);
	}	
}
