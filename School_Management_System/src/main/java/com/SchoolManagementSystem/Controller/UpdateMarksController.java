package com.SchoolManagementSystem.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import com.SchoolManagementSystem.Model.StudentRegistration;
import com.SchoolManagementSystem.Service.StudentCRUDService;

@Controller
public class UpdateMarksController {
	
	//object creation of StudentCRUDService service class.
	@Autowired
	private StudentCRUDService studentService;
	
	
	//List of all the students in database will be shown to the tecaher.
	@GetMapping("TeacherProfile/AllStudent")
	public String viewStudentDetails(ModelMap model) {
		model.addAttribute("student",studentService.getAllStudent());
		return "StudentMarksUpload";
		}
	
	@PostMapping("/saveMarks")
	public String saveStudent(@ModelAttribute("student") StudentRegistration student) {
		studentService.saveStudent(student);
		return "SuccessfulUpload";
	}
	
	@GetMapping("/UploadMarks/{ID}")
	public String updateStudentDetails(@PathVariable (value="ID") long ID,ModelMap model) {
		StudentRegistration student=studentService.getStudentByID(ID);
		model.addAttribute("upload", student);
		return "UploadMarks";
	}

}
