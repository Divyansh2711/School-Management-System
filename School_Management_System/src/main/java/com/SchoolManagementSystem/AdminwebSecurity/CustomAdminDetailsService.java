package com.SchoolManagementSystem.AdminwebSecurity;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;

import com.SchoolManagementSystem.Model.AdminRegistration;
import com.SchoolManagementSystem.Repository.AdminRepository;

<<<<<<< HEAD
public class CustomAdminDetailsService implements UserDetailsService {
	/**  
	 *  autowired object of AdminRepository 
	 * 
	 */
	@Autowired
	private AdminRepository  repo;
	
	/**
	 * 
	 *  method takes email as argument
	 *  finds user in database using findByemail method
	 *  method returns userdetails 
	 * 	if not found throws exception
	 * 
	 */
	@Override
	public UserDetails loadUserByUsername(String email) throws UsernameNotFoundException {
=======

public class CustomAdminDetailsService implements UserDetailsService {
	
	@Autowired
	private AdminRepository  repo;
	@Override
	public UserDetails loadUserByUsername(String email) throws UsernameNotFoundException {
		// TODO Auto-generated method stub
>>>>>>> e3f1abb797095a70843f8fb2e65b9cc28b5b88fb
		AdminRegistration admin  = repo.findByemail(email);
		if (admin==null)
		{
			throw new UsernameNotFoundException("User Not Found");
		}
		
		return new CustomAdminDetails(admin);
	}

}
