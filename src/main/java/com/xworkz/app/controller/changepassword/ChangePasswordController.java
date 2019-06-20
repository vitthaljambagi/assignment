package com.xworkz.app.controller.changepassword;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.xworkz.app.controller.signup.SignUpController;
import com.xworkz.app.entity.UserEntity;
import com.xworkz.app.service.changepassword.ChangePasswordServiceImpl;

@Controller
@RequestMapping("/")
public class ChangePasswordController {

	private final static Logger log = LoggerFactory.getLogger(SignUpController.class);

	@Autowired
	private ChangePasswordServiceImpl changePasswordService;

	public ChangePasswordController() {
		System.out.println("object created  for change \t" + this.getClass().getSimpleName());
	}

	@RequestMapping(value = "/changepassword.ams", method = RequestMethod.POST)
	public ModelAndView updatePassword(@RequestParam("oldPassword") String oldpass,
			@RequestParam("newPassword") String newpass, @RequestParam("confirmPassword") String confPass,
			HttpServletRequest request) {

		if (newpass.equals(confPass)) {
			HttpSession session = request.getSession(false);
			if (session != null) {
				UserEntity dto = (UserEntity) session.getAttribute("viru");
				System.out.println("Session Not Null..................");
				if (dto != null) {
					if (dto.getPassword().equals(oldpass)) {
						changePasswordService.changePasswordService(dto.getEmailId(), newpass);
						return new ModelAndView("Home.jsp");
					} else {
						return new ModelAndView("/changepassword.jsp").addObject("msg",
								"current password is not matching");
					}
				} else {
					return new ModelAndView("/signin.jsp").addObject("msg", "Something went wrong try again login");
				}
			} else {
				return new ModelAndView("/signin.jsp").addObject("msg", "Something went wrong try again login");
			}
		} else {
			return new ModelAndView("/changepassword.jsp").addObject("msg",
					"new password and confirm password is not matching");
		}
	}


}
