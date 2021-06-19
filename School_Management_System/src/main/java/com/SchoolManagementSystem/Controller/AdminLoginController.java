package com.SchoolManagementSystem.Controller;

import java.security.Principal;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.SchoolManagementSystem.Model.AdminRegistration;
import com.SchoolManagementSystem.Repository.AdminRepository;

@Controller
public class AdminLoginController {
	

	@Autowired
	private AdminRepository repo;
	
	
	
	@GetMapping("/adminLogin")
	public String showAdminLoginPage() {
		return "AdminLogin";
	}
	
	@GetMapping("/adminProfile")
	public String showadminProfile(AdminRegistration admin,Model md,Principal principal )
	{
		String email =principal.getName();
		admin	 = repo.findByemail(email);
		md.addAttribute("admin",admin);
		
		return"AdminProfile";
	}
	
	
	@GetMapping("/afterLogout")
	public String logout()
	{
		return "Delhi-Public-School.html";
		
	}
	
	


}
