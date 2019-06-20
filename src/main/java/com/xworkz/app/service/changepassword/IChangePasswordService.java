package com.xworkz.app.service.changepassword;

import com.xworkz.app.exception.DAOException;

public interface IChangePasswordService {
	public void changePasswordService(String emailId, String password)throws DAOException;

}
