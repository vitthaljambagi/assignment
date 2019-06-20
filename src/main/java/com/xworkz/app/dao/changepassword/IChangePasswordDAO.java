package com.xworkz.app.dao.changepassword;

import com.xworkz.app.exception.DAOException;

public interface IChangePasswordDAO {
	
	public void changepasswordDAO(String emailId, String password ) throws DAOException;

}
