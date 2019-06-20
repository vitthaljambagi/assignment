package com.xworkz.app.dao.changepassword;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.query.Query;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.xworkz.app.controller.signup.SignUpController;

@Repository
public class ChangePasswordDAOImpl implements IChangePasswordDAO {
	private final static Logger log=LoggerFactory.getLogger(SignUpController.class);
	
	@Autowired
	private SessionFactory sessionFactory;
	
	public ChangePasswordDAOImpl() {
		System.out.println("object created \t"+this.getClass().getSimpleName());

	}
	
	public void changepasswordDAO(String emailId, String password) {
		String sql="update UserEntity user set user.password=:pass , user.status= 1 where user.emailId=:em";
		Session session=sessionFactory.openSession();
		Transaction transaction=session.beginTransaction();
		Query query=session.createQuery(sql);
		query.setParameter("em", emailId);
		query.setParameter("pass", password);
		int update = query.executeUpdate();
		transaction.commit();
		
		System.out.println("Data is Update "+update);
		
		//session.save(update);
	} 	
} 



