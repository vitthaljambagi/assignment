package com.xworkz.app.util;

import org.springframework.beans.factory.annotation.Autowired; 
import org.springframework.mail.MailException;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Component;

import com.xworkz.app.entity.CreateAssignmentEntity;

@Component
public class AssignMail {

	@Autowired
	private JavaMailSender mailSender;

	public AssignMail() {
		System.out.println("AssignMail is Created.............................");
	}
	
	public void mailAssign(CreateAssignmentEntity createAssignmentEntity, String[] emailIds) {
		System.out.println("mailsend() invoked " + createAssignmentEntity);
		SimpleMailMessage mailMessage = new SimpleMailMessage();
		for (int i = 0; i < emailIds.length; i++) {
			try {
				 mailMessage.setTo(emailIds[i]);
				 mailMessage.setSubject("X-workz Assignment Management Application"+"\n");
				 mailMessage.setText("Pin="+createAssignmentEntity.getPin()+"\n"+"Topic="+
				 createAssignmentEntity.getTopic()
				 +"\n"+"Description="+createAssignmentEntity.getDescription()
				 +"\n"+"DeadLine="+createAssignmentEntity.getDeadLine()+"\n"+"UploadType="+
				 createAssignmentEntity.getUploadType() +"\n"+"Thank You");
				 /*mailSender.send(mailMessage);
				 */
				send(mailMessage);
				System.out.println("Email id is: " + emailIds[i]);
				System.out.println("Mail sent Succssfully");
			} catch (MailException e) {
				System.out.println("Exceptions \t" + e.getMessage());
			}
		}
	}   

	public void send(SimpleMailMessage mailMessage) {
		mailSender.send(mailMessage);
	}

}
