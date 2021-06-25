package com.SchoolManagementSystem.Controller;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.SchoolManagementSystem.Model.StudentRegistration;
import com.SchoolManagementSystem.Repository.StudentRepository;

@Controller
public class SearchController {
	
	//object creation of StudentRepository.
	@Autowired
	private StudentRepository repo;
	
	//It will return searchStudent page.
	@GetMapping("/teachersprofile/searchStudent")
	public String showsearchPage() {
		return "searchStudent";
	}
	
	
	/*
	 * //Teacher will be able to search student's profile based on student's
	 * registration Id. If ID is not found in database it will return student not
	 * found.
	 */
	@PostMapping("/teacherProfile/searchStudent/searchResult")
	public String searchStudent(@RequestParam("ID") long ID,Model md,StudentRegistration student)
	{
        student = repo.findByID(ID);
        if(student==null) {
        	md.addAttribute("message","Student Not Found");
        	return "searchStudent";
        }
		md.addAttribute("student",student);
	
	
		return"searchStudentResult";
		
	
		
	}
}
