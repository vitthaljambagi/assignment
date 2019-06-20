package com.xworkz.app.dao.signin;



import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.xworkz.app.dto.signin.SignInDTO;
import com.xworkz.app.entity.UserEntity;

@Repository
public class SignInDAOImpl implements ISignInDAO {
	@Autowired
	private SessionFactory sessionFactory;
	
	public SignInDAOImpl() {
		System.out.println("created:\t"+this.getClass().getSimpleName());
	}
	
	
	public UserEntity signInDAO(SignInDTO signInDTO) {
		System.out.println("Data from user:"+signInDTO);
		String hql="from UserEntity user where user.emailId=:em and user.password=:pass";
		Session session=sessionFactory.openSession();
		Query query=session.createQuery(hql);
		query.setParameter("pass", signInDTO.getPassword());
		query.setParameter("em",signInDTO.getEmailId());
		UserEntity dtoFromDb=(UserEntity) query.uniqueResult();
	
		return dtoFromDb;
		
	}

}
