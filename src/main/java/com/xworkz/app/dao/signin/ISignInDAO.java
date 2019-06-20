package com.xworkz.app.dao.signin;

import com.xworkz.app.dto.signin.SignInDTO;
import com.xworkz.app.entity.UserEntity;
import com.xworkz.app.exception.DAOException;

public interface ISignInDAO {
	public UserEntity signInDAO(SignInDTO signInDTO)throws DAOException;

}
