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
	
	

        @Autowired
        private TeacherRepository repo;
	
		@GetMapping("/teacherForgotPassword")
		public String showForgotPasswordPage()
		{
			return "TeacherForgotPassword";
			
		}
		
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
					if (repo.findByPassword(newPassword)!=null)
					{
						model.addAttribute("message", "Please enter a different password");
						return "TeacherForgotPassword";
					
					}
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
			

