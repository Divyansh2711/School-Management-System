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
	
	
	@Autowired
	private StudentRepository repo;
	
	//Controller for showing forget password form
	@GetMapping("/studentForgotPassword")
	public String showforgotPasswordPage()
	{
		return "StudentForgotPassword";
	}


	
	//controller for verify pin
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
				if (repo.findByPassword(newPassword)!=null)
				{
					model.addAttribute("message", "Please enter a different password");
					return "TeacherForgotPassword";
				
				}

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
			 
				
			 
			
			
		
	
			

	
	

			
		
			
			
	
		
		
	
	


