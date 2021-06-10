package com.SchoolManagementSystem.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;


@Controller
public class HomeController {

	
	@RequestMapping(value="/DPS/school", method = RequestMethod.GET)
	public String showLoginPage(ModelMap model){
		return "Delhi-Public-School";
	}
}
