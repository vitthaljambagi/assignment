package com.xworkz.app.service.signup;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.stereotype.Service;

import com.xworkz.app.dao.signup.SignUpDAOImpl;
import com.xworkz.app.entity.UserEntity;
import com.xworkz.app.util.AssignMail;
import com.xworkz.app.util.RandomPasswordGenerator;

@Service
public class SignUpServiceImpl implements ISignUpService {

	@Autowired
	private SignUpDAOImpl signUpDAO;
	@Autowired
	private RandomPasswordGenerator passwordGenerator;
	@Autowired
	//private AssignMail mailSender;

	public SignUpServiceImpl() {
		System.out.println("created:\t" + this.getClass().getSimpleName());
	}

	public String sendMail(String to, String subject, String text, String password) {

		SimpleMailMessage MailMessage = new SimpleMailMessage();

		MailMessage.setTo(to);
		MailMessage.setSubject(subject);
		MailMessage.setText(text);
		AssignMail mailSender=new AssignMail();
		System.out.println("mailsenfder " + mailSender);
		mailSender.send(MailMessage);

		return "Mail sent to:\t" + to;

	}

	public UserEntity signUpService(UserEntity userEntity) {
		
		  userEntity.setPassword(passwordGenerator.generatePasseword());
		  userEntity.setStatus((short)0);
		  signUpDAO.signUpDAO(userEntity);
		  String emailId = userEntity.getEmailId();
		  String subject ="Confirmation Mail From Assignment Management System"; 
		  String password =passwordGenerator.generatePasseword();
		  String text = "Your account is created \n" +
		  "please login by using \n" + "email:\n" + emailId + "password:" + password;
		  
		  String emailResult = sendMail(emailId, subject, text, password);
		 
		  System.out.println(emailResult);
		  
		  
		  System.out.println("signUpService ended");
		 
		return userEntity;
	}

	public Long checkUSerIsAvailableByEmail(String emailId) {
		return signUpDAO.checkUSerIsAvailableByEmail(emailId);
	}

}
