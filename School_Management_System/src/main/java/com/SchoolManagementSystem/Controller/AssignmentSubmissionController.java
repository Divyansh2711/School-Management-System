package com.SchoolManagementSystem.Controller;

import java.io.IOException;
import java.time.LocalDate;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

import com.SchoolManagementSystem.Model.Assignment;
import com.SchoolManagementSystem.Model.SubmittedAssignment;
import com.SchoolManagementSystem.Repository.AssignmentRepository;
import com.SchoolManagementSystem.Repository.SubmittedAssignRepo;

@Controller
public class AssignmentSubmissionController {
	
	
	/*
	 * //object creation for AssignmentRepository class.
	 */	
	@Autowired
	private AssignmentRepository assignmentRepo;
	
	/*
	 * //object creation for SubmittedAssignRepo class.
	 */	
	@Autowired
	private SubmittedAssignRepo sRepo;
	
	
	/*
	 * //It will return getClass Page
	 */	
	@GetMapping("/studentProfile/getClass")
	public String sectionForm()
	{
		return "getClass";
	}
	
	
	/* Student will be able to view the assignments given to him/her. */
	
	@PostMapping("/studentProfile/getAssignmentSection")
	public String getAssignmentSection(@RequestParam("slass") String slass,Model md )
	
	{
		List<Assignment> assignment = assignmentRepo.findBySlass(slass);
		
		md.addAttribute("assignments",assignment);
		return "StudentAssignmentSection";
		
	}
	
	/*
	 * // Student will be able to submit the assignment
	 */	
	@GetMapping("/studentProfile/submitAssignmentForm")
	public String submitForm()
	{
		return "SubmitAssignment";
	}
	
	
	/*
	 * Student will be able to upload the files. After successful uploadation,
	 * successfully submitted message will be shown.
	 */
	@PostMapping("/studentProfile/submitAssignment")
	public String submitAssignment(@RequestParam("data") MultipartFile data, @RequestParam("student_name") String student_name,
			@RequestParam("assignment_id") long assignment_id, @RequestParam("reg_id") long reg_id ,Model md) throws IOException
			
	{
		String filename = data.getOriginalFilename();
		String datatype = data.getContentType();
	    LocalDate uploadtime = LocalDate.now();		
	    
	   SubmittedAssignment assignment =  new SubmittedAssignment( assignment_id,reg_id, student_name, uploadtime, filename,
				datatype, data.getBytes()) ;
		sRepo.save(assignment);
		md.addAttribute("message","successfully submitted");
		return"SubmitAssignment";
		
	}


}
