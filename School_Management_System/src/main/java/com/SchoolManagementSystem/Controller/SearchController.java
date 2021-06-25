package com.SchoolManagementSystem.Controller;



<<<<<<< HEAD
=======
import java.util.Optional;

import javax.servlet.http.HttpSession;

>>>>>>> e3f1abb797095a70843f8fb2e65b9cc28b5b88fb
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
	
<<<<<<< HEAD
	//object creation of StudentRepository.
	@Autowired
	private StudentRepository repo;
	
	//It will return searchStudent page.
=======
	@Autowired
	private StudentRepository repo;
	
>>>>>>> e3f1abb797095a70843f8fb2e65b9cc28b5b88fb
	@GetMapping("/teachersprofile/searchStudent")
	public String showsearchPage() {
		return "searchStudent";
	}
	
<<<<<<< HEAD
	
	/*
	 * //Teacher will be able to search student's profile based on student's
	 * registration Id. If ID is not found in database it will return student not
	 * found.
	 */
=======
>>>>>>> e3f1abb797095a70843f8fb2e65b9cc28b5b88fb
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
