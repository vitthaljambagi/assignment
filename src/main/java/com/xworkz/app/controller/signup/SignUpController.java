package com.xworkz.app.controller.signup;

import javax.servlet.http.HttpServletRequest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.xworkz.app.entity.UserEntity;
import com.xworkz.app.service.signup.SignUpServiceImpl;

@Controller
@RequestMapping("/")
public class SignUpController {

	private final static Logger log = LoggerFactory.getLogger(SignUpController.class);

	@Autowired
	private SignUpServiceImpl signUpService;

	public SignUpController() {
		System.out.println("created:\t" + this.getClass().getSimpleName());
	} 

	@RequestMapping(value = "/signup.ams", method = RequestMethod.POST)
	public ModelAndView signUpController(UserEntity userEntity,HttpServletRequest request) {

		System.out.println("signUpController started");
		log.info("signUpController started");
		
		Long userCount=signUpService.checkUSerIsAvailableByEmail(userEntity.getEmailId());
		System.out.println("User Count is "+userCount);
		if(userCount>0) {
			return new ModelAndView("/signup.jsp","msg","User is Already Signup");
		}else {
			UserEntity dtoFromDb=signUpService.signUpService(userEntity);
			System.out.println(userEntity);
			if(dtoFromDb!=null) {
				return new ModelAndView("/signup.jsp","msg","User register successfully check you mail");
			}else {
				return new ModelAndView("/signup.jsp","msg","User does not register successfully");
			}
		}
		
		
/*		
		

		

		log.info("signUpController ended");
		// System.out.println("signUpController ended");
		return new ModelAndView("index.jsp", "msg", userEntity.getFirstName() + "user created successfully");*/

	}

}
