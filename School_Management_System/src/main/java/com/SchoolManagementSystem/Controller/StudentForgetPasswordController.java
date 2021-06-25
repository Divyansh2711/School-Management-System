package com.SchoolManagementSystem.Controller;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.SchoolManagementSystem.Model.StudentRegistration;
import com.SchoolManagementSystem.Repository.StudentRepository;

@Controller
public class StudentForgetPasswordController {
	
	/***
	 *   Created autowired object of StudentRepository
	 */

	@Autowired
	private StudentRepository repo;
	
	//Controller for showing forget password form
	@GetMapping("/studentForgotPassword")
	public String showforgotPasswordPage()
	{
		return "StudentForgotPassword";
	}


	
	//controller for verify pin
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
	@PostMapping("/verifySecurityPin")
	public String verifySecurityPin(Model model,@RequestParam("email") String email,@RequestParam ("securitypin") String securitypin,@RequestParam("newPassword") String newPassword,StudentRegistration student,HttpSession session)
	{
		
	    student= repo.findByemail(email);
	    
	    
		if (student==null)
		{
			model.addAttribute("message", "Please enter a valid email");
			return "StudentForgotPassword";
		}
		
		else
		{
			if(securitypin.equals(student.getSecuritypin()))
			{
				student.setPassword((newPassword));
				repo.save(student);
				
				model.addAttribute("student",student);
				
				return "StudentForgotSuccessfull";
			
		     }
			else
			{
				model.addAttribute("message", "Enter Correct Security Pin");
				return"StudentForgotPassword";
			}
		}
			
			
	}
}
			 
				
			 
			
			
		
	
			

	
	

			
		
			
			
	
		
		
	
	


