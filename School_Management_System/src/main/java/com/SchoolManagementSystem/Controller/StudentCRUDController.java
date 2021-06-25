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
public class StudentCRUDController {

	//object creation of StudentCRUDService service class.
	@Autowired
	private StudentCRUDService studentService;
	
<<<<<<< HEAD
	//Admin will be able to view All the Student Records.
=======
>>>>>>> e3f1abb797095a70843f8fb2e65b9cc28b5b88fb
	@GetMapping("/adminProfile/AllStudent")
	public String viewStudentDetails(ModelMap model) {
		model.addAttribute("student",studentService.getAllStudent());
		return "StudentRecords";
		}
	
		/*
		 * //Upon updation the values, the values will be changed in database and
		 * SuccessfulUpdate will be returned.
		 */
	@PostMapping("/saveStudent")
	public String saveStudent(@ModelAttribute("student") StudentRegistration student) {
		studentService.saveStudent(student);
		return "SuccessfulUpdate";
	}
	
	/*
	 * //Student will be able to update their records.
	 */	
	@GetMapping("/StudentUpdate/{ID}")
	public String EditStudentDetails(@PathVariable (value="ID") long ID,ModelMap model) {
		StudentRegistration student=studentService.getStudentByID(ID);
		model.addAttribute("update", student);
		return "UpdateStudent";
	}
	
	/*
	 * //Admin will be able to update the details of a particular student.
	 */	
	@GetMapping("adminProfile/StudentUpdate/{ID}")
	public String updateStudentDetails(@PathVariable (value="ID") long ID,ModelMap model) {
		StudentRegistration student=studentService.getStudentByID(ID);
		model.addAttribute("update", student);
		return "UpdateStudent";
	}
<<<<<<< HEAD
	/*
	 * //Admin will be able to delete the details of a particular student.
	 */	
=======
	
>>>>>>> e3f1abb797095a70843f8fb2e65b9cc28b5b88fb
	@GetMapping("adminProfile/StudentDelete/{ID}")
	public String deleteStudent(@PathVariable (value = "ID") long ID) { 
		this.studentService.deleteStudentById(ID);
		return "SuccessfullyDeleted";
	}
	

}

