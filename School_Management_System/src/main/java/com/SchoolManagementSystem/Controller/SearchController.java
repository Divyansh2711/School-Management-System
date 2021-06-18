package com.SchoolManagementSystem.Controller;



import java.util.Optional;

import javax.servlet.http.HttpSession;

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
	
	@Autowired
	private StudentRepository repo;
	
	@GetMapping("/teachersprofile/searchStudent")
	public String showsearchPage() {
		return "searchStudent";
	}
	
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
