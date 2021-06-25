package com.SchoolManagementSystem.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttributes;

import com.SchoolManagementSystem.Model.StudentRegistration;
import com.SchoolManagementSystem.Model.TeacherRegistration;

import com.SchoolManagementSystem.Repository.StudentRepository;
import com.SchoolManagementSystem.Repository.TeacherRepository;

@Controller
@SessionAttributes("email")
public class LoginController {

	/* Object creation of Student Repository class */
	@Autowired
	private StudentRepository repo;

	/* Object creation of Teacher Repository class */
	@Autowired
	private TeacherRepository teacherRepo;

	/*
	 * //It will Student Login Page.
	 */	
	@RequestMapping("/studentLogin")
	public String showLoginPage() {
		return "StudentLogin";
	}
<<<<<<< HEAD

	/*
	 * IF email is correctly entered it will go to Student login page else it will
	 * show Invalid Username or Password.
	 * If email entered is not present in database it will be return Email not found message. 
	 */
	@PostMapping("/studentLgn")
	public String login(@RequestParam("email") String email, @RequestParam("password") String password, Model model) {
		StudentRegistration student = repo.findByemail(email);
		if (student != null) {
			if (student.getPassword().equals(password)) {
				model.addAttribute("student", student);
				return "StudentProfile";
			} else {
				model.addAttribute("message", "Invalid username or password");
				return "StudentLogin";

			}

		} else {
			model.addAttribute("message", "Email not found");
			return "StudentLogin";
		}
	}
=======
	
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
	
>>>>>>> e3f1abb797095a70843f8fb2e65b9cc28b5b88fb

	/*
	 * //It will Teacher Login Page.
	 */	
	@GetMapping("/teacherLogin")
	public String showTeacherLoginPage() {
		return "TeacherLogin";
	}
<<<<<<< HEAD

	/*
	 * IF email is correctly entered it will go to Student login page else it will
	 * show Invalid Username or Password.
	 * If email entered is not present in database it will be return Email not found message. 
	 */
	@PostMapping("/teacherLgn")
	public String Teacherlogin(@RequestParam("email") String email, @RequestParam("password") String password,
			Model model) {
		TeacherRegistration teacher = teacherRepo.findByEmail(email);
		if (teacher != null) {
			if (teacher != null && teacher.getPassword().equals(password)) {
				model.addAttribute("teacher", teacher);
				return "TeacherProfile";
			} else {
				model.addAttribute("message", "Invalid username or password");
				return "TeacherLogin";

			}
=======
	
	@PostMapping("/teacherlgn")
	public String Teacherlogin(@RequestParam("email") String email,@RequestParam("password") String password,Model model)
	{
		TeacherRegistration teacher= teacherRepo.findByEmail(email);
		if(teacher!=null && teacher.getPassword().equals(password))
		{
			model.addAttribute("teacher",teacher);
			System.out.println();
			return "TeacherProfile";
>>>>>>> e3f1abb797095a70843f8fb2e65b9cc28b5b88fb
		}
		else {
			model.addAttribute("message", "Email not found");
			return "TeacherLogin";
		}

	}

}
