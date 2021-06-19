package com.SchoolManagementSystem.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.SchoolManagementSystem.Model.StudentRegistration;
import com.SchoolManagementSystem.Service.StudentService;

@Controller
public class StudentCRUDController {

	@Autowired
	private StudentService studentService;
	
	@GetMapping("/adminProfile/AllStudent")
	public String viewStudentDetails(ModelMap model) {
		model.addAttribute("student",studentService.getAllStudent());
		return "StudentRecords";
		}
	
	@PostMapping("/saveStudent")
	public String saveEmployee(@ModelAttribute("employee") StudentRegistration student) {
		studentService.saveStudent(student);
		return "SuccessfulUpdation";
	}
	
	@RequestMapping(value="/StudentUpdate", method = RequestMethod.GET)
	public String editStudentDetails(ModelMap model){
		return "UpdateStudent";
	}
	
	@GetMapping("/StudentUpdate/{ID}")
	public String updateStudentDetails(@PathVariable (value="ID") long ID,ModelMap model) {
		StudentRegistration student=studentService.getStudentByID(ID);
		model.addAttribute("update", student);
		return "UpdateStudent";
	}
	
	@GetMapping("adminProfile/StudentDelete/{ID}")
	public String deleteStudent(@PathVariable (value = "ID") long ID) { 
		this.studentService.deleteStudentById(ID);
		return "SuccessfullyDeleted";
	}
}
