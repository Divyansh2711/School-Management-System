package com.SchoolManagementSystem.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import com.SchoolManagementSystem.Model.TeacherRegistration;
import com.SchoolManagementSystem.Service.TeacherCRUDService;

@Controller
public class TeacherCRUDController {

	//object creation of TeacherCRUDService service class.
	@Autowired
	private TeacherCRUDService teacherService;
	
	//Admin will be able to view All the Teacher Records.
	@GetMapping("/adminProfile/AllTeacher")
	public String viewTeacherDetails(ModelMap model) {
		model.addAttribute("teacher",teacherService.getAllTeacher());
		return "TeacherRecords";
		}
	
	/*
	 * //Upon updation the values, the values will be changed in database and
	 * SuccessfulUpdate will be returned.
	 */
	@PostMapping("/saveTeacher")
	public String saveTeacher(@ModelAttribute("teacher") TeacherRegistration teacher) {
		teacherService.saveTeacher(teacher);
		return "SuccessfulUpdate";
	}
	/*
	 * //Teacher will be able to update their records.
	 */	
	@GetMapping("/TeacherUpdate/{ID}")
	public String EditTeacherDetails(@PathVariable (value="ID") long ID,ModelMap model) {
		TeacherRegistration student=teacherService.getTeacherByID(ID);
		model.addAttribute("update", student);
		return "UpdateTeacher";
	}
	
	/*
	 * //Admin will be able to update the details of a particular teacher.
	 */
	@GetMapping("adminProfile/TeacherUpdate/{ID}")
	public String updateStudentDetails(@PathVariable (value="ID") long ID,ModelMap model) {
		TeacherRegistration teacher=teacherService.getTeacherByID(ID);
		model.addAttribute("update", teacher);
		return "UpdateTeacher";
	}
	
	/*
	 * //Admin will be able to delete the details of a particular teacher.
	 */	
	@GetMapping("adminProfile/TeacherDelete/{ID}")
	public String deleteteacher(@PathVariable (value = "ID") long ID) { 
		this.teacherService.deleteTeacherById(ID);
		return "SuccessfullyDeleted";
	}
}
