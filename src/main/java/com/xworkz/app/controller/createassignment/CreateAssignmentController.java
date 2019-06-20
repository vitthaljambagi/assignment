package com.xworkz.app.controller.createassignment;

import java.text.SimpleDateFormat;
import java.util.Date;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.propertyeditors.CustomDateEditor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.xworkz.app.dto.createassignment.CreateAssignmentDTO;
import com.xworkz.app.service.createassignment.CreateAssignmentServiceImpl;

@Controller
@RequestMapping("/")
public class CreateAssignmentController {

	@Autowired
	private CreateAssignmentServiceImpl assignmentService;

	public CreateAssignmentController() {
		System.out.println("Create \t" + this.getClass().getSimpleName());
	}

	@InitBinder
	public void initBinder(WebDataBinder webDataBinder) {
		SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
		dateFormat.setLenient(false);
		webDataBinder.registerCustomEditor(Date.class, new CustomDateEditor(dateFormat, true));
	}

	@RequestMapping(value = "createAssignment.ams", method = RequestMethod.POST)
	public ModelAndView creatingAssignment(CreateAssignmentDTO createAssignmentDTO, HttpServletRequest request) {
		System.out.println("CreateAssignmentController started");
		// log.info("CreateAssignmentController started");
		System.out.println(createAssignmentDTO);
		HttpSession session = request.getSession(false);
		if (session!= null) {
			
			assignmentService.assignmentService(createAssignmentDTO);
			// log.info("CreateAssignmentController ended");
			System.out.println("CreateAssignmentController ended");
			return new ModelAndView("Home.jsp", "msg", "Assignment created successfully");
		} else {
			return new ModelAndView("/signin.jsp", "msg", "session gone");
		}
	}
 
	@RequestMapping(value="/crtAssignment.ams" ,method=RequestMethod.GET )
	public String getCreateAssignmntPage(HttpServletRequest request) {
		System.out.println("Create Assignment Page calling.........................");
		HttpSession session=request.getSession(false);
		if(session.getAttribute("viru")!=null) {
			return "createassignment.jsp";
		}else {
			return "signin.jsp";			
		}
	}
}
