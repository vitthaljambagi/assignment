package com.xworkz.app.dao.assign;

import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.xworkz.app.entity.AssignAssignmentEntity;
import com.xworkz.app.entity.CreateAssignmentEntity;
import com.xworkz.app.exception.DAOException;

@Repository
public class AssignDAOImpl implements IAssignDAO {

	@Autowired
	private SessionFactory factory;
	public CreateAssignmentEntity assigningDAO(String[] emailIds, int pin) throws DAOException {
		System.out.println("mms");
		org.hibernate.Session session=null;
		Transaction transaction=null;
		    
		String hql="from CreateAssignmentEntity assign where assign.pin=:pins";
		session=factory.openSession();
		//Transaction transaction=session.beginTransaction();
		Query query=session.createQuery(hql);
		query.setParameter("pins",pin);
		CreateAssignmentEntity entityFromDB=(CreateAssignmentEntity) query.uniqueResult();
		transaction=session.beginTransaction();
		for(int i=0; i<emailIds.length; i++) {
			AssignAssignmentEntity assignAssignmentEntity=new 	AssignAssignmentEntity();
			assignAssignmentEntity.setCreateAssignmentEntity(entityFromDB);
			assignAssignmentEntity.setEmailId(emailIds[i]);
			session.save(assignAssignmentEntity);
			System.out.println("save data"+emailIds[i]+""+"pin="+pin);
		}
		System.out.println("data is comming...............\ndata is: "+entityFromDB);
		transaction.commit();
		return entityFromDB;
		
	}

	

}
