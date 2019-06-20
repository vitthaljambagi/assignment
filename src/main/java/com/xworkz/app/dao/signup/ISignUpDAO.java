package com.xworkz.app.dao.signup;

import com.xworkz.app.entity.UserEntity;
import com.xworkz.app.exception.DAOException;

public interface ISignUpDAO {
	public UserEntity signUpDAO(UserEntity userEntity)throws DAOException;
}
