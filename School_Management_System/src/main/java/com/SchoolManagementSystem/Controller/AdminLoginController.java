package com.SchoolManagementSystem.Controller;

import java.security.Principal;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
<<<<<<< HEAD
=======
import org.springframework.web.bind.annotation.PostMapping;
>>>>>>> e3f1abb797095a70843f8fb2e65b9cc28b5b88fb

import com.SchoolManagementSystem.Model.AdminRegistration;
import com.SchoolManagementSystem.Repository.AdminRepository;

@Controller
public class AdminLoginController {
	
<<<<<<< HEAD
	/*
	 * //object creation for Admin Repository
	 */	
=======

>>>>>>> e3f1abb797095a70843f8fb2e65b9cc28b5b88fb
	@Autowired
	private AdminRepository repo;
	
	
<<<<<<< HEAD
	/*
	 * // will return admin Login page
	 */	
=======
	
>>>>>>> e3f1abb797095a70843f8fb2e65b9cc28b5b88fb
	@GetMapping("/adminLogin")
	public String showAdminLoginPage() {
		return "AdminLogin";
	}
	
<<<<<<< HEAD
	
	/*
	 * //if correct email ID and password is enetred admin Profile page will be
	 * returned.
	 */	
=======
>>>>>>> e3f1abb797095a70843f8fb2e65b9cc28b5b88fb
	@GetMapping("/adminProfile")
	public String showadminProfile(AdminRegistration admin,Model md,Principal principal )
	{
		String email =principal.getName();
		admin	 = repo.findByemail(email);
		md.addAttribute("admin",admin);
		
		return"AdminProfile";
	}
	
<<<<<<< HEAD
	/*
	 * // to logout from the profile page. It will be redirected to home page after
	 * logout.
	 */
=======
	
>>>>>>> e3f1abb797095a70843f8fb2e65b9cc28b5b88fb
	@GetMapping("/afterLogout")
	public String logout()
	{
		return "Delhi-Public-School.html";
		
	}
	
	


}
