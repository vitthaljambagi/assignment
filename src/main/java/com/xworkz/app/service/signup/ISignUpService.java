package com.xworkz.app.service.signup;

import com.xworkz.app.entity.UserEntity;
import com.xworkz.app.exception.DAOException;

public interface ISignUpService {
	public UserEntity signUpService(UserEntity userEntity)throws DAOException;
}
