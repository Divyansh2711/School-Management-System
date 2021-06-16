package com.SchoolManagementSystem.SearchController;



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
	
	@GetMapping("/searchStudent")
	public String showsearchPage() {
		return "searchStudent";
	}
	@PostMapping("/search_process")
	public String searchStudent(@RequestParam("ID") long ID,Model md,HttpSession session)
	{
		Optional<StudentRegistration>  student = repo.findById(ID);
		if(student==null)
		{
			md.addAttribute("message","Please enter a valid");
			return"searchStudent";
		}
	
		
			md.addAttribute("message","students searchde");
			session.setAttribute("student", student);
			return "searchedStudentDetails";
	
		
	}
}
