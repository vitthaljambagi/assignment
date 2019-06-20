package com.xworkz.app.controller.signin;

import javax.servlet.http.HttpServletRequest; 
import javax.servlet.http.HttpSession;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.xworkz.app.dto.signin.SignInDTO;
import com.xworkz.app.entity.UserEntity;
import com.xworkz.app.service.signin.SignInServiceImpl;

@Controller
@RequestMapping("/")
public class SignInController {
	@Autowired
	private SignInServiceImpl signInService;

	private static Logger log = LoggerFactory.getLogger(SignInController.class);

	public SignInController() {
		System.out.println("created:\t" + this.getClass().getSimpleName());
	}

	@RequestMapping(value = "/signin.ams", method = RequestMethod.POST)
	public ModelAndView signInController(SignInDTO signInDTO, HttpServletRequest request) {

		log.info("{}" + signInDTO);
		System.out.println(signInDTO);
		// System.out.println("Data From User:"+signInDTO);
		UserEntity dtoFromDb = signInService.signInService(signInDTO);
		System.out.println("DATA from database:" + dtoFromDb);
		if (dtoFromDb != null) {
			HttpSession session = request.getSession(true);
			session.setAttribute("viru", dtoFromDb);
			if (dtoFromDb.getStatus() == 0) {
				return new ModelAndView("/changepassword.jsp");
  
			} else {
				return new ModelAndView("/Home.jsp").addObject("msg", "user signing successfully");
			}
		} else {
			return new ModelAndView("/signin.jsp").addObject("msg", "Username and password is wrong....");
		}
	}

	@RequestMapping(value = "/signout.ams", method = RequestMethod.GET)
	public ModelAndView signout(HttpServletRequest request) {
		HttpSession session = request.getSession(false);
		/*if (session != null) {
			session.invalidate();
		}*/
		session.invalidate();

		return new ModelAndView("/signin.jsp");

	}
	@RequestMapping(value="/changesettings.jsp")
	public ModelAndView changeSettings(HttpServletRequest request) {
		HttpSession session=request.getSession();
			if(session!=null) {
				session.equals(session);
			}
		return new ModelAndView("/Home.jsp");
			
		
	}

}
