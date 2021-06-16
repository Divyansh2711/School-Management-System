package com.SchoolManagementSystem.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.SessionAttributes;

import com.SchoolManagementSystem.Model.AdminRegistration;
import com.SchoolManagementSystem.Model.StudentRegistration;
import com.SchoolManagementSystem.Model.TeacherRegistration;
import com.SchoolManagementSystem.Repository.AdminRepository;
import com.SchoolManagementSystem.Repository.StudentRepository;
import com.SchoolManagementSystem.Repository.TeacherRepository;

@Controller
@SessionAttributes("email")
public class RegistrationController {
	
	@Autowired
	private StudentRepository repo;
	
	@Autowired
	private TeacherRepository teacherRepo;
	
	@Autowired
	private AdminRepository adminRepo;
	
	
	@GetMapping(value="DPS/school/registration")
	public String viewStudentRegistrationPage(ModelMap model) {
		model.addAttribute("StudentRegistration", new StudentRegistration());
		return "StudentRegistration";
	}
	
	
	@PostMapping("DPS/school/registration/process_register")
	public String processRegistration(@ModelAttribute("Studentregistration") StudentRegistration studentRegistration) {
		repo.save(studentRegistration);
		return "Registration Successful";
	}
	
	
	
	@GetMapping(value="DPS/school/Teacherregistration")
	public String viewTeacherRegistrationPage(ModelMap model) {
		model.addAttribute("TeacherRegistration", new TeacherRegistration());
		return "TeacherRegistration";
	}
	
	@PostMapping("DPS/school/registration/process_TeacherRegistration")
	public String processTeacherRegistration(@ModelAttribute("TeacherRegistration") TeacherRegistration teacherRegistration) {
		teacherRepo.save(teacherRegistration);
		return "Success";
	}
	
	
	@GetMapping(value="DPS/school/AdminRegistration")
	public String viewAdminRegistrationPage(ModelMap model) {
		model.addAttribute("AdminRegistration", new AdminRegistration());
		return "AdminRegistration";
	}
	
	@PostMapping("DPS/school/registration/process_AdminRegistration")
	public String processAdminRegistration(@ModelAttribute("AdminRegistration") AdminRegistration adminRegistration) {
		adminRepo.save(adminRegistration);
		return "AdminAdded";
	}
	
}
