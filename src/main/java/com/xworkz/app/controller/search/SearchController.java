package com.xworkz.app.controller.search;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.xworkz.app.entity.CreateAssignmentEntity;
import com.xworkz.app.service.service.SearchServiceImpl;

@Controller
@RequestMapping("/")
public class SearchController {
	
	@Autowired
	private SearchServiceImpl searchServiceImpl;
	
	public SearchController() {
		System.out.println("Created "+this.getClass().getSimpleName());
	}
	@RequestMapping(value="/searching.ams",method=RequestMethod.POST)
	public ModelAndView searchAssignment(HttpServletRequest request) {
		System.out.println("invokeing serchController");
		HttpSession session=request.getSession(false);
		if(session!=null) {
		String course=request.getParameter("course");
		String topic=request.getParameter("topic");
		
		List<CreateAssignmentEntity> listDtoFromDB=searchServiceImpl.searchServiceImpl(course,topic);
		
		return new ModelAndView("searching.jsp","list",listDtoFromDB);
		
	}
		else {
			return new ModelAndView("/signin.jsp","msg","session went from assign ");	
			}
	}
	@RequestMapping(value="/Search.ams" ,method=RequestMethod.GET )
	public String getCreateAssignmntPage(HttpServletRequest request) {
		System.out.println("Create Assignment Page calling.........................");
		HttpSession session=request.getSession(false);
		if(session.getAttribute("viru")!=null) {
			return "searching.jsp";
		}else {
			return "signin.jsp";			
		}
	}
	
	
}
