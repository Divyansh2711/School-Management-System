package com.SchoolManagementSystem.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.SchoolManagementSystem.Model.TeacherRegistration;
import com.SchoolManagementSystem.Repository.TeacherRepository;

@Controller
public class TeacherForgotPasswordController {
	
	
	/***
	 *   Created autowired object of TeacherRepository
	 */

        @Autowired
        private TeacherRepository repo;
	
      //Controller for showing forget password form
		@GetMapping("/teacherForgotPassword")
		public String showForgotPasswordPage()
		{
			return "TeacherForgotPassword";
			
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
		@PostMapping("/teacherForgotPassword/verifySecurityPin")
		public String verifySecurityPin(Model model,@RequestParam("email") String email,@RequestParam ("securitypin") String securitypin,@RequestParam("newPassword") String newPassword,TeacherRegistration teacher)
		{
			
		    teacher = repo.findByEmail(email);
		    
		    
			if (teacher==null)
			{
				model.addAttribute("message", "Please enter a valid email");
				return "TeacherForgotPassword";
			}
			
			else
			{
				if(securitypin.equals(teacher.getSecuritypin()))
				{
					teacher.setPassword((newPassword));
					repo.save(teacher);
					
					model.addAttribute("teacher",teacher);
					
					return "TeacherForgotSuccessfull";
				
			     }
				else
				{
					model.addAttribute("message", "Enter Correct Security Pin");
					return"TeacherForgotPassword";
				}
			
			}
			
		}
		
}
			

