package com.SchoolManagementSystem.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.SchoolManagementSystem.Model.AdminRegistration;
import com.SchoolManagementSystem.Model.StudentRegistration;
import com.SchoolManagementSystem.Model.TeacherRegistration;
import com.SchoolManagementSystem.Repository.AdminRepository;
import com.SchoolManagementSystem.Repository.StudentRepository;
import com.SchoolManagementSystem.Repository.TeacherRepository;

@Service
public class RegisrtrationValidationService {
	
	@Autowired 
	private TeacherRepository tRepo;
	
	@Autowired
	private StudentRepository sRepo;
	
	@Autowired
	private AdminRepository aRepo;
	
	
	public String serversideValidation(TeacherRegistration teacherRegistration) {
		

	

		if (tRepo.findByEmail(teacherRegistration.getEmail())!=null)
		{
		return "Email is already registered with us";		
		
		}
		else if (tRepo.findByPhone(teacherRegistration.getPhone_no())!=null)
		{
		   
			return "Phone Number is already registered";
		}
		else if (tRepo.findByPassword(teacherRegistration.getPassword())!=null)
		{
		    return "Please Use a different Password";		
		
		}
		return "";
		

	}
	public String serversideValidation(StudentRegistration studentRegistration) {
		

		

		if (sRepo.findByemail(studentRegistration.getEmail())!=null)
		{
		return "Email is already registered with us";		
		
		}
		else if (sRepo.findByPhone(studentRegistration.getPhone_no())!=null)
		{
		   
			return "Phone Number is already registered";
		}
		else if (sRepo.findByPassword(studentRegistration.getPassword())!=null)
		{
		    return "Please Use a different Password";		
		
		}
		return "";
		

	}
	
public String serversideValidation(AdminRegistration adminRegistration) {
		

		

		if (aRepo.findByemail(adminRegistration.getEmail())!=null)
		{
		return "Email is already registered with us";		
		
		}
		else if (aRepo.findByPhone(adminRegistration.getPhone_no())!=null)
		{
		   
			return "Phone Number is already registered";
		}
		else if (aRepo.findByPassword(adminRegistration.getPassword())!=null)
		{
		    return "Please Use a different Password";		
		
		}
		return "";
		

	}

}
