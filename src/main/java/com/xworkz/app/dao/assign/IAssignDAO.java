package com.xworkz.app.dao.assign;

import com.xworkz.app.entity.CreateAssignmentEntity;
import com.xworkz.app.exception.DAOException;

public interface IAssignDAO {
	public CreateAssignmentEntity assigningDAO(String[] emailIds, int pin) throws DAOException;

}
