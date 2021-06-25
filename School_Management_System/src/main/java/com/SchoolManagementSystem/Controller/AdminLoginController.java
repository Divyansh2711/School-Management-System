package com.SchoolManagementSystem.Controller;

import java.security.Principal;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.SchoolManagementSystem.Model.AdminRegistration;
import com.SchoolManagementSystem.Repository.AdminRepository;

@Controller
public class AdminLoginController {
	
	/*
	 * //object creation for Admin Repository
	 */	
	@Autowired
	private AdminRepository repo;
	
	
	/*
	 * // will return admin Login page
	 */	
	@GetMapping("/adminLogin")
	public String showAdminLoginPage() {
		return "AdminLogin";
	}
	
	
	/*
	 * //if correct email ID and password is enetred admin Profile page will be
	 * returned.
	 */	
	@GetMapping("/adminProfile")
	public String showadminProfile(AdminRegistration admin,Model md,Principal principal )
	{
		String email =principal.getName();
		admin	 = repo.findByemail(email);
		md.addAttribute("admin",admin);
		
		return"AdminProfile";
	}
	
	/*
	 * // to logout from the profile page. It will be redirected to home page after
	 * logout.
	 */
	@GetMapping("/afterLogout")
	public String logout()
	{
		return "Delhi-Public-School.html";
		
	}
	
	


}
