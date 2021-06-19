package com.SchoolManagementSystem.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.SchoolManagementSystem.Model.AdminRegistration;
import com.SchoolManagementSystem.Repository.AdminRepository;

@Controller
public class AdminForgotPasswordController {
	
	

    @Autowired
    private  AdminRepository repo;


	@GetMapping("/adminForgotPassword")
	public String showForgotPasswordPage()
	{
		return "AdminForgotPassword";
		
	}
	
	@PostMapping("/adminForgotPassword/verifySecurityPin")
	public String verifySecurityPin(Model model,@RequestParam("email") String email,@RequestParam ("securitypin") String securitypin,@RequestParam("newPassword") String newPassword,AdminRegistration admin)
	{
	   BCryptPasswordEncoder encoder = new BCryptPasswordEncoder();
		
		
	  admin = repo.findByemail(email);
	    
	    
		if (admin==null)
		{
			model.addAttribute("message", "Please enter a valid email");
			return "AdminForgotPassword";
		}
		
		else
		{
			if(encoder.matches(securitypin, admin.getSecuritypin()))
			{
				if (repo.findByPassword(newPassword)!=null)
				{
					model.addAttribute("message", "Please enter a different password");
					return "AdminForgotPassword";
				
				}
				admin.setPassword((encoder.encode(newPassword)));
				repo.save(admin);
				
				model.addAttribute("admin",admin);
				
				return "AdminForgotSuccessful";
			
		     }
			else
			{
				model.addAttribute("message", "Enter Correct Security Pin");
				return"AdminForgotPassword";
			}
		
		}
		
	}
}
