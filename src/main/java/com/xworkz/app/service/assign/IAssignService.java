package com.xworkz.app.service.assign;

import com.xworkz.app.exception.DAOException;

public interface IAssignService {
	public void assignOnMail(int pin, String[] emailIds)throws DAOException;
}
