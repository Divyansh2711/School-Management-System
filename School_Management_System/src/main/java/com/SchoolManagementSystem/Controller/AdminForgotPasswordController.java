package com.SchoolManagementSystem.Controller;

import org.springframework.beans.factory.annotation.Autowired;
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
		
	  admin = repo.findByemail(email);
	    
	    
		if (admin==null)
		{
			model.addAttribute("message", "Please enter a valid email");
			return "AdminForgotPassword";
		}
		
		else
		{
			if(securitypin.equals(admin.getSecuritypin()))
			{
				admin.setPassword((newPassword));
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
