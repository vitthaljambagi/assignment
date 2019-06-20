package com.xworkz.app.dao.search;

import java.util.List;

import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.xworkz.app.entity.CreateAssignmentEntity;



@Repository
public class SearchDAO {

	@Autowired
	private SessionFactory factory;

	public SearchDAO() {
		System.out.println("Created \t" + this.getClass().getSimpleName());
	}

	public List<CreateAssignmentEntity> searhDAO(String course, String topic) {
		System.out.println("invoked  SearchDAO()");
		String hql = "from CreateAssignmentEntity where course=:courses and topic=:topics ";
		org.hibernate.Session session = factory.openSession();
		Transaction transaction = session.beginTransaction();
		Query query = session.createQuery(hql);
		query.setParameter("courses", course);
		query.setParameter("topics", topic);

		List<CreateAssignmentEntity> list = query.list();

		return list;
	}

}
