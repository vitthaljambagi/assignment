package com.xworkz.app.dao.createassignment;

import com.xworkz.app.entity.CreateAssignmentEntity;
import com.xworkz.app.exception.DAOException;

public interface ICreateAssigmentDAO {
	public CreateAssignmentEntity saveCreatedAssignment(CreateAssignmentEntity createAssignmentEntity)throws DAOException;

}
