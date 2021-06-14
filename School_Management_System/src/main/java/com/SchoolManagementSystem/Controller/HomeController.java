package com.SchoolManagementSystem.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;


@Controller
public class HomeController {

	
	@RequestMapping(value="/DPS/school", method = RequestMethod.GET)
	public String showHomePage(ModelMap model){
		return "Delhi-Public-School";
	}
	
	@RequestMapping(value="/DPS/school/AboutUs", method = RequestMethod.GET)
	public String AboutUsPage(ModelMap model){
		return "About-Us";
	}
	
	@RequestMapping(value="/DPS/school/Academics", method = RequestMethod.GET)
	public String AcademicsPage(ModelMap model){
		return "Academics";
	}
	
	@RequestMapping(value="/DPS/school/Facilities", method = RequestMethod.GET)
	public String FacilitiesPage(ModelMap model){
		return "Facilities";
	}
	
	@RequestMapping(value="/DPS/school/Admission", method = RequestMethod.GET)
	public String AdmissionPage(ModelMap model){
		return "Admission";
	}
	
	@RequestMapping(value="/DPS/school/Transportation", method = RequestMethod.GET)
	public String TransportationPage(ModelMap model){
		return "Transport";
	}
	
	@RequestMapping(value="/DPS/school/Programme", method = RequestMethod.GET)
	public String ProgrammesPage(ModelMap model){
		return "Programmes";
	}
	
	@RequestMapping(value="/DPS/school/Alumni", method = RequestMethod.GET)
	public String AlumniPage(ModelMap model){
		return "Alumni";
	}
	
	
	@RequestMapping(value="/DPS/school/Contact Us", method = RequestMethod.GET)
	public String ContactUsPage(ModelMap model){
		return "Contact-Us";
	}

}
