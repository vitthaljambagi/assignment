package com.xworkz.app.service.signin;

import com.xworkz.app.dto.signin.SignInDTO;
import com.xworkz.app.entity.UserEntity;
import com.xworkz.app.exception.DAOException;

public interface ISignInService {
	public UserEntity signInService(SignInDTO signInDTO)throws DAOException;

}
