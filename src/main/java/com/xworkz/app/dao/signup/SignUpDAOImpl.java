package com.xworkz.app.dao.signup;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.query.Query;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.xworkz.app.controller.signup.SignUpController;
import com.xworkz.app.entity.UserEntity;

@Repository
public class SignUpDAOImpl implements ISignUpDAO {

	private final static Logger log = LoggerFactory.getLogger(SignUpController.class);

	@Autowired
	private SessionFactory factory;

	public SignUpDAOImpl() {
		System.out.println("created:\t" + this.getClass().getSimpleName());
	}
 
	public UserEntity signUpDAO(UserEntity userEntity) {
		// System.out.println("signUpDAO started");
		try(Session session=factory.openSession()){
			Transaction transaction=session.beginTransaction();
			session.save(userEntity);
			transaction.commit();
			System.out.println("Data is Seved............");
			return userEntity;
		}catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}

	public Long checkUSerIsAvailableByEmail(String emailId) {
		
		try(Session session=factory.openSession()) {
			Transaction transaction=session.beginTransaction();
			Query query=session.createQuery("SELECT Count(user.emailId) from UserEntity user where user.emailId=:email");
			query.setParameter("email", emailId);
			Long res=(Long)query.uniqueResult();
			transaction.commit();
			return res;
		}catch (Exception e) {
			e.printStackTrace();
		}
		
		return 0l;
	}

}
