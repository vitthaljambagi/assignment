package com.xworkz.app.service.service;

import java.util.List;

import org.apache.jasper.tagplugins.jstl.core.ForEach;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.xworkz.app.dao.search.SearchDAO;
import com.xworkz.app.entity.CreateAssignmentEntity;

@Service
public class SearchServiceImpl implements ISearchService {
	
	@Autowired
	private SearchDAO searchDAO;
	
	public SearchServiceImpl() {
		System.out.println("Creatd \t"+this.getClass().getSimpleName());
	}

	public List<CreateAssignmentEntity> searchServiceImpl(String course, String topic) {
		System.out.println("invoking serachService()");
		List<CreateAssignmentEntity>list=searchDAO.searhDAO(course,topic);
		//System.out.println("Search topic and course \t"+list);
		
		for (CreateAssignmentEntity createAssignmentEntity : list) {
			System.out.println(createAssignmentEntity);
		}
		
		return list;
	}

}
