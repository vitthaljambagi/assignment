package com.xworkz.app.service.assign;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import com.xworkz.app.dao.assign.AssignDAOImpl;
import com.xworkz.app.entity.CreateAssignmentEntity;
import com.xworkz.app.exception.DAOException;
import com.xworkz.app.util.AssignMail;

@Service
public class AssignServiceImpl implements IAssignService {

	@Autowired
	private AssignDAOImpl assignDAOImpl;
	@Autowired
	private AssignMail mails;
	
	
	
	public AssignServiceImpl() {
		System.out.println("Created \t"+this.getClass().getSimpleName());
	}
	
	
	public void assignOnMail(int pin, String[] emailIds) {
		System.out.println("main method started");
		try {
			CreateAssignmentEntity createAssignmentEntity=assignDAOImpl.assigningDAO(emailIds, pin);
			System.out.println("entity from db="+createAssignmentEntity);
			mails.mailAssign(createAssignmentEntity,emailIds);
			System.out.println("main method ended");
		} catch (DAOException e) {
			e.printStackTrace();
		}	
	}

	

}
