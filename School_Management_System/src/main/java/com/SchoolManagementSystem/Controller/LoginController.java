package com.SchoolManagementSystem.Controller;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttributes;

import com.SchoolManagementSystem.Model.AdminRegistration;
import com.SchoolManagementSystem.Model.StudentRegistration;
import com.SchoolManagementSystem.Model.TeacherRegistration;

import com.SchoolManagementSystem.Repository.AdminRepository;
import com.SchoolManagementSystem.Repository.StudentRepository;
import com.SchoolManagementSystem.Repository.TeacherRepository;

@Controller
@SessionAttributes({"email","address"})
public class LoginController {

	/* Object creation of Student Repository class */
	@Autowired
	private StudentRepository repo;
	
	/* Object creation of Admin Repository class */
	@Autowired
	private AdminRepository adminRepo;
	
	/* Object creation of Teacher Repository class */
	@Autowired
	private TeacherRepository teacherRepo;
	
	
	@RequestMapping("/studentLogin")
	public String showLoginPage() {
		return "StudentLogin";
	}
	
	@PostMapping("/studentlgn")
	public String login(@RequestParam("email") String email,@RequestParam("password") String password,
			Model model)
	{
		StudentRegistration student= repo.findByemail(email);
		if(student.getPassword().equals(password))
		{
			model.addAttribute("student", student);
			return "StudentProfile";
		}
		else
		{
			model.addAttribute("message","Invalid username or password");
			return "StudentLogin";
			
		}
		
	}
	
	
	/*
	 * @GetMapping("/adminLogin") public String showAdminLoginPage() { return
	 * "AdminLogin"; }
	 * 
	 * @PostMapping("/adminLogin") public String Adminlogin(@RequestParam("email")
	 * String email,@RequestParam("password") String password,Model model) {
	 * AdminRegistration admin= adminRepo.findByemail(email); if(admin!=null &&
	 * admin.getPassword().equals(password)) { model.addAttribute("admin",admin);
	 * return "AdminProfile"; } else {
	 * model.addAttribute("message","Invalid username or password"); return
	 * "AdminLogin";
	 * 
	 * }
	 * 
	 * }
	 */
	

	
	@GetMapping("/teacherLogin")
	public String showTeacherLoginPage() {
		return "TeacherLogin";
	}
	
	@PostMapping("/teacherlgn")
	public String Teacherlogin(@RequestParam("email") String email,@RequestParam("password") String password,Model model)
	{
		TeacherRegistration teacher= teacherRepo.findByEmail(email);
		if(teacher!=null && teacher.getPassword().equals(password))
		{
			model.addAttribute("teacher",teacher);
			System.out.println();
			return "TeacherProfile";
		}
		else
		{
			model.addAttribute("message","Invalid username or password");
			return "TeacherLogin";
			
		}
		
	}
	

}
