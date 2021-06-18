package com.SchoolManagementSystem.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.SessionAttributes;

import com.SchoolManagementSystem.Model.AdminRegistration;
import com.SchoolManagementSystem.Model.StudentRegistration;
import com.SchoolManagementSystem.Model.TeacherRegistration;
import com.SchoolManagementSystem.Repository.AdminRepository;
import com.SchoolManagementSystem.Repository.StudentRepository;
import com.SchoolManagementSystem.Repository.TeacherRepository;
import com.SchoolManagementSystem.Service.RegisrtrationValidationService;

@Controller
@SessionAttributes("email")
public class RegistrationController {
	
	@Autowired
	private StudentRepository repo;
	
	@Autowired
	private TeacherRepository teacherRepo;
	
	@Autowired
	private AdminRepository adminRepo;
	
	@Autowired
	private RegisrtrationValidationService service;
	

	
	/**
	 * 
	 * For student Registration
	 * @param model
	 * @return
	 */
	
	@GetMapping(value="DPS/school/registration")
	public String viewStudentRegistrationPage(ModelMap model) {
		model.addAttribute("StudentRegistration", new StudentRegistration());
		return "StudentRegistration";
	}
	
	
	@PostMapping("DPS/school/registration/process_register")
	public String processRegistration(Model md,StudentRegistration studentRegistration) {
		
		//for Server side validation 
		

	    String error=service.serversideValidation(studentRegistration);
	    if(!error.isEmpty())
	    {
	    	md.addAttribute("link","/DPS/school/registration");  
	        md.addAttribute("message",error);
	        return "userexisterror";
	    }
	    
		repo.save(studentRegistration);
		md.addAttribute(studentRegistration);
		return "Registration Successful";
	}
	
	/**
	 * 
	 * For Registration of teacher
	 * 
	 * 
	 */
	
	@GetMapping("/adminProfile/TeacherRegistration")
	public String viewTeacherRegistrationPage(ModelMap model) {
		model.addAttribute("teacher", new TeacherRegistration());
		return "TeacherRegistration";
	}
	
	@PostMapping("/adminProfile/process_TeacherRegistration")
	public String processTeacherRegistration(Model md, TeacherRegistration teacherRegistration) {
		
		//for validation serversideValidation is done
		
	    String error=service.serversideValidation(teacherRegistration);
	    if(!error.isEmpty()) {
		   
	    md.addAttribute("message",error);
	    md.addAttribute("link","/adminProfile/TeacherRegistration");
	    return "userexisterror";
	    }
		
	    teacherRepo.save(teacherRegistration);
		md.addAttribute("teacher",teacherRegistration);
		return "Success";
	}
	
	//Admin Registration 
	
	
	@GetMapping("/adminProfile/AdminRegistration")
	public String viewAdminRegistrationPage(ModelMap model) {
		model.addAttribute("adminRegistration", new AdminRegistration());
		return "AdminRegistration";
	}
	
	@PostMapping("/adminProfile/process_AdminRegistration")
	public String processAdminRegistration(Model md, AdminRegistration adminRegistration) {
		
//for validation serversideValidation is done
		
	    String error=service.serversideValidation(adminRegistration);
	    
	    //if credentials are not valid
	    if(!error.isEmpty()) {
		   
	    md.addAttribute("message",error);
	    md.addAttribute("link","/adminProfile/AdminRegistration");
	    return "userexisterror";
	    }
		
	    //for valid inputs
	    
		  BCryptPasswordEncoder encoder = new BCryptPasswordEncoder(); 
		  String encodedPassword = encoder.encode(adminRegistration.getPassword());
		  String encodedSecurityPin =
		  encoder.encode(adminRegistration.getSecuritypin());
		  adminRegistration.setPassword(encodedPassword);
		  adminRegistration.setSecuritypin(encodedSecurityPin);
		 
		  adminRepo.save(adminRegistration);
		  md.addAttribute("admin",adminRegistration);
		  return "AdminAdded";
	}
	
}
