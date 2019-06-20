package com.xworkz.app.service.changepassword;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.xworkz.app.controller.signup.SignUpController;
import com.xworkz.app.dao.changepassword.ChangePasswordDAOImpl;

@Service
public class ChangePasswordServiceImpl implements IChangePasswordService {
	
	private final static Logger log=LoggerFactory.getLogger(SignUpController.class);
	
	@Autowired
	private ChangePasswordDAOImpl changePasswordDAO;
	
	public ChangePasswordServiceImpl() {
		System.out.println("object created \t"+this.getClass().getSimpleName());
	}

	public void changePasswordService(String emailId, String password) {
		changePasswordDAO.changepasswordDAO(emailId,password);
	}
}