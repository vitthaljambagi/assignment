package com.xworkz.app.service.createassignment;

import com.xworkz.app.dto.createassignment.CreateAssignmentDTO;
import com.xworkz.app.exception.DAOException;

public interface ICreateAssignmentService {
	public long assignmentService(CreateAssignmentDTO createAssignmentDTO)throws DAOException;

}
