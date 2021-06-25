package com.SchoolManagementSystem.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.SchoolManagementSystem.Model.AdminRegistration;
import com.SchoolManagementSystem.Model.StudentRegistration;
import com.SchoolManagementSystem.Model.TeacherRegistration;
import com.SchoolManagementSystem.Repository.AdminRepository;
import com.SchoolManagementSystem.Repository.StudentRepository;
import com.SchoolManagementSystem.Repository.TeacherRepository;
/***
 * This service class validates userdetails like username phone and password  before registering 
 * 
 *
 */
@Service
public class RegistrationValidationService {
	/*
	 * creates autowired object of TeacherRepository 
	 */
	@Autowired 
	private TeacherRepository teacherRepo;
	
	/*
	 * creates autowired object of StudentRepository 
	 */	
	@Autowired
	private StudentRepository studentRepo;
	
	/*
	 *creates autowired object of AdminRepository
	 */
	@Autowired
	private AdminRepository adminRepo;
	
	
	/***
	 * 
	 * This method validates unique techer details and returns message if userdetails is already present in database
	 * @param teacherRegistration
	 * @return
	 */
	public String serversideValidation(TeacherRegistration teacherRegistration) {

		if (teacherRepo.findByEmail(teacherRegistration.getEmail())!=null)
		{
		return "Email is already registered with us";		
		
		}
		else if (teacherRepo.findByPhone(teacherRegistration.getPhone_no())!=null)
		{
		   
			return "Phone Number is already registered";
		}
		else if (teacherRepo.findByPassword(teacherRegistration.getPassword())!=null)
		{
		    return "Please Use a different Password";		
		
		}
		return "";
		

	}
	
	/***
	 * This method validates unique Student details and returns message if userdetails is already present in database
	 * @param studentRegistration
	 * @return
	 */
	public String serversideValidation(StudentRegistration studentRegistration) {

		if (studentRepo.findByemail(studentRegistration.getEmail())!=null)
		{
		return "Email is already registered with us";		
		
		}
		else if (studentRepo.findByPhone(studentRegistration.getPhone_no())!=null)
		{
		   
			return "Phone Number is already registered";
		}
		else if (studentRepo.findByPassword(studentRegistration.getPassword())!=null)
		{
		    return "Please Use a different Password";		
		
		}
		return "";
		

	 }
	
	/***
	 *  This method validates unique admin details and returns message if userdetails is already present in database
	 * @param adminRegistration
	 * @return
	 */
     public String serversideValidation(AdminRegistration adminRegistration) {

		if (adminRepo.findByemail(adminRegistration.getEmail())!=null)
		{
		return "Email is already registered with us";		
		
		}
		else if (adminRepo.findByPhone(adminRegistration.getPhone_no())!=null)
		{
		   
			return "Phone Number is already registered";
		}
		else if (adminRepo.findByPassword(adminRegistration.getPassword())!=null)
		{
		    return "Please Use a different Password";		
		
		}
		return "";
		

	}

}
