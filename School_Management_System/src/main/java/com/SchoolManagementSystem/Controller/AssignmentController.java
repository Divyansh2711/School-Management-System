package com.SchoolManagementSystem.Controller;

import java.io.IOException;
import java.sql.Date;
import java.util.List;

import javax.servlet.ServletOutputStream;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.SchoolManagementSystem.Model.Assignment;
import com.SchoolManagementSystem.Model.SubmittedAssignment;
import com.SchoolManagementSystem.Repository.AssignmentRepository;
import com.SchoolManagementSystem.Repository.SubmittedAssignRepo;

@Controller
public class AssignmentController {

	/*
	 * //object creation for AssignementRepository class.
	 */	
	@Autowired
	private AssignmentRepository repo;
	
	/*
	 * //object creation for SubmittedAssignRepo class.
	 */	
	@Autowired
	private SubmittedAssignRepo sRepo;

	
	/*
	 * //will return assignement records page. Teacher can downloa the assignement
	 * of all the students.
	 */
	@GetMapping("/techersProfile/getAssignmentSection")
	public String assignmentSection(Model md) {
		List<Assignment> assignment = repo.findAll();
		md.addAttribute("assignments", assignment);

		return "assignmentRecords";

	}

	/*
	 * //It will return GIve Assignment pgae.
	 */	
	@GetMapping("/teachersProfile/getAssignmentForm")
	public String getAssignForm() {

		return "GiveAssignment";

	}
	
	/**
	 * For Saving assignment in database 
	 * @param data
	 * @param subject
	 * @param slass
	 * @param description
	 * @param deadline
	 * @param md
	 * @param ra
	 * @return
	 * @throws IOException
	 */

	@PostMapping("/teachersProfile/giveAssignmnet")
	public String giveAssignment(@RequestParam("data") MultipartFile data, @RequestParam("subject") String subject,
			@RequestParam("slass") String slass, @RequestParam("description") String description,
			@RequestParam("deadline") Date deadline, Model md, RedirectAttributes ra) throws IOException {
		String filename = data.getOriginalFilename();
		String datatype = data.getContentType();

		Assignment assignment = new Assignment(subject, slass, description, data.getBytes(), deadline, filename,
				datatype);
		repo.save(assignment);

		return "redirect:/techersProfile/getAssignmentSection";

	}

	/**
	 * 
	 *  For downloading files 
	 */
	@GetMapping("/downloadFile/{id}")
	public void renderFile(@PathVariable Long id, HttpServletResponse response) throws IOException {
		Assignment doc = repo.getById(id);

		response.setContentType(doc.getDatatype());
		String headerKey = "Content-Disposition";
		String headerValue = "attachment; filename =" + doc.getFilename();

		response.setHeader(headerKey, headerValue);

		ServletOutputStream outputstream = response.getOutputStream();

		outputstream.write(doc.getData());
		outputstream.close();
	}
	
	/**
	 * 
	 * For viewing assignments submitted by students
	 * @return 
	 */
	
	@GetMapping("/teachersProfile/viewAssignment")
	public String assignidform()
	{
		return "GetAssignIDForm";
	}
	
	/**
	 * 
	 * For viewing assignments submitted by a particular student.
	 * @return 
	 */
	
	@GetMapping("/teacherProfile/viewSubmittedAssignmentSection/{assignment_id}")
	public String getSubmittedAssignment(@PathVariable long assignment_id,Model md )
	
	{
		List<SubmittedAssignment> assignment = sRepo.findByassgnmtid(assignment_id);
		
		md.addAttribute("assignments",assignment);
		return "SubmittedAssignmentList";
		
	}
	
	/**
	 * 
	 *  for downloading assignments submitted by Students
	 */
	
	@GetMapping("/techersProfile/downloadSubmittedAssignment/{reg_id}")
	public void downloadSubmittedAssignment(@PathVariable Long reg_id, HttpServletResponse response) throws IOException {
		SubmittedAssignment doc = sRepo.getById(reg_id);

		response.setContentType(doc.getDatatype());
		String headerKey = "Content-Disposition";
		String headerValue = "attachment; filename =" + doc.getFilename();

		response.setHeader(headerKey, headerValue);

		ServletOutputStream outputstream = response.getOutputStream();

		outputstream.write(doc.getData());
		outputstream.close();
	}
	
	
	}
