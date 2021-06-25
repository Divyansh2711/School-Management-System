package com.SchoolManagementSystem.Controller;

import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.SchoolManagementSystem.Model.StudentRegistration;
import com.SchoolManagementSystem.Repository.StudentRepository;
import com.SchoolManagementSystem.Service.CreatePdfService;
import com.lowagie.text.DocumentException;



@Controller
public class DownloadController {
	
	/*
	 * //object creation for StudentRepository.
	 */	
	@Autowired
	private StudentRepository studentRepository;
	
	
	/*
	 * // Student will be able to download the record . The file will be downloaded
	 * in pdf format.
	 */
	 @GetMapping("/studentProfile/pdf/{ID}")
	    public String exportToPDF(@PathVariable long ID,HttpServletResponse response) throws DocumentException, IOException {
	        response.setContentType("application/pdf");
	        DateFormat dateFormatter = new SimpleDateFormat("yyyy-MM-dd_HH:mm:ss");
	        String currentDateTime = dateFormatter.format(new Date());
	         
	        String headerKey = "Content-Disposition";
	        String headerValue = "attachment; filename=student_" + currentDateTime + ".pdf";
	        response.setHeader(headerKey, headerValue);
	         
	        List<StudentRegistration> listUsers = studentRepository.findByIDlist(ID);
	         
	        CreatePdfService exporter = new CreatePdfService(listUsers);
	        exporter.export(response);
	        
	        return"redirect:/studentLgn";
	        
	    }
}
