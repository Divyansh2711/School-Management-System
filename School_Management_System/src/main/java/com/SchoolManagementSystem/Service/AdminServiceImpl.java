package com.SchoolManagementSystem.Service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.SchoolManagementSystem.Model.AdminRegistration;
import com.SchoolManagementSystem.Repository.AdminRepository;




/***
 * 
 * This service class will perform all the crud (create, read, update and delete) operations.
 */
@Service
public class AdminServiceImpl implements AdminCRUDService {

	/*
	 * Object creation of StudentRepository class.
	 */
	@Autowired
	private AdminRepository adminRepo;

	
	/*
	 * This method will show the list of all students 
	 * present in database.
	 */
	@Override
	public List<AdminRegistration> getAllAdmin() {
		return adminRepo.findAll();
	}
	
	
	/*
	 * This method will save the details of the student in the 
	 * databse.
	 * 
	 */
	public void saveAdmin(AdminRegistration admin) {
		this.adminRepo.save(admin);
	}

	
	/*
	 * This method will update the details of a particular
	 * student 
	 *
	 */
	@Override
	public AdminRegistration getAdminByID(long ID) {
		Optional<AdminRegistration> optional=adminRepo.findById(ID);
		AdminRegistration admin = null;
		if (optional.isPresent()) {
			admin = optional.get();
		} else {
			throw new RuntimeException(" Admin not found for id :: " + ID);
		}
		return admin;
	}
	
	
	/*
	 * This method will delete the records of the student present 
	 *   in database.
	 */
	@Override
	public void deleteAdminById(long ID) {
		this.adminRepo.deleteById(ID);
	}
	
	

}
