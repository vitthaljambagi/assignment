package com.xworkz.app.dao.createassignment;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.xworkz.app.entity.CreateAssignmentEntity;

@Repository
public class CreateAssignmentDAOImpl implements ICreateAssigmentDAO {
	
	@Autowired
	private SessionFactory sessionFactory;
	
	public CreateAssignmentDAOImpl() {
		System.out.println("Create \t"+this.getClass().getSimpleName());
	}

	
	public CreateAssignmentEntity saveCreatedAssignment(CreateAssignmentEntity createAssignmentEntity) {
		Session session=sessionFactory.openSession();
		Transaction transaction=session.beginTransaction();
		session.save(createAssignmentEntity);
		transaction.commit();
		return createAssignmentEntity;
	}


	

}
