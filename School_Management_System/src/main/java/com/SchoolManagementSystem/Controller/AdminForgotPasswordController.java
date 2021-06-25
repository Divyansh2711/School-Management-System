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
	
	/***
	 *   Created autowired object of AdminRepository
	 */

    @Autowired
    private  AdminRepository repo;

<<<<<<< HEAD
    /***
     * 
     * @return AdminForgotPassword view
     */
=======

>>>>>>> e3f1abb797095a70843f8fb2e65b9cc28b5b88fb
	@GetMapping("/adminForgotPassword")
	public String showForgotPasswordPage()
	{
		return "AdminForgotPassword";
		
	}
	/***
	 * Finds admin by username i.e email validate security pin and changes password
	 * @param model
	 * @param email
	 * @param securitypin
	 * @param newPassword
	 * @param admin
	 * @return  AdminForgotSuccessfull view on succefull password resets
	 * 
	 */
	
	@PostMapping("/adminForgotPassword/verifySecurityPin")
	public String verifySecurityPin(Model model,@RequestParam("email") String email,@RequestParam ("securitypin") String securitypin,@RequestParam("newPassword") String newPassword,AdminRegistration admin)
	{
<<<<<<< HEAD
	 
=======
	   BCryptPasswordEncoder encoder = new BCryptPasswordEncoder();
		
>>>>>>> e3f1abb797095a70843f8fb2e65b9cc28b5b88fb
		
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
<<<<<<< HEAD
=======
				if (repo.findByPassword(newPassword)!=null)
				{
					model.addAttribute("message", "Please enter a different password");
					return "AdminForgotPassword";
				
				}
>>>>>>> e3f1abb797095a70843f8fb2e65b9cc28b5b88fb
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
