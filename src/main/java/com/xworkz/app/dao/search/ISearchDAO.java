package com.xworkz.app.dao.search;

import com.xworkz.app.entity.CreateAssignmentEntity;
import com.xworkz.app.exception.DAOException;

public interface ISearchDAO {
	public SearchDAO searchAssignment(CreateAssignmentEntity createAssignmentEntity) throws DAOException;
}
