package com.xworkz.app.controller.assign;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.xworkz.app.service.assign.AssignServiceImpl;

@Controller
public class AssignController {
	
	@Autowired
	private AssignServiceImpl assignServiceImpl;
	
	public AssignController() {
		System.out.println("Created \t"+this.getClass().getSimpleName());
	}
	@RequestMapping(value="/assigning.ams",method=RequestMethod.POST)
	public ModelAndView assignController(@RequestParam int pin,@RequestParam String emailId,HttpServletRequest request) {
		System.out.println("Assigning is started");
		HttpSession session = request.getSession(false);
		if (session!= null) {
		System.out.println("Random pin is="+pin);
		String[] emailIds=emailId.split(",");
		for(int i=0; i<emailIds.length; i++) {
			System.out.println("to email id "+emailIds[i]);
		}
		assignServiceImpl.assignOnMail(pin,emailIds);
		System.out.println("Assigning is ended");
		return new ModelAndView("assigning.jsp","msg","mail send successfully");
	}
		else {
			return new ModelAndView("/signin.jsp","msg","session went from assign ");	
			}

}
	@RequestMapping(value="/Assign.ams" ,method=RequestMethod.GET )
	public String getCreateAssignmntPage(HttpServletRequest request) {
		System.out.println("Create Assignment Page calling.........................");
		HttpSession session=request.getSession(false);
		if(session.getAttribute("viru")!=null) {
			return "assigning.jsp";
		}else {
			return "signin.jsp";			
		}
	}
}