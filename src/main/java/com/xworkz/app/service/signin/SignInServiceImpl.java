package com.xworkz.app.service.signin;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.xworkz.app.dao.signin.SignInDAOImpl;
import com.xworkz.app.dto.signin.SignInDTO;
import com.xworkz.app.entity.UserEntity;

@Service
public class SignInServiceImpl implements ISignInService {
	
	@Autowired
	private SignInDAOImpl signInDAO;
	
	public SignInServiceImpl() {
		System.out.println("created:\t"+this.getClass().getSimpleName());
	}
	
	public UserEntity signInService(SignInDTO signInDTO) {
		UserEntity dtoFromDb=signInDAO.signInDAO(signInDTO);
		
		return dtoFromDb;
	}

	

}
