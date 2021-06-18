package com.SchoolManagementSystem.AdminwebSecurity;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;

import com.SchoolManagementSystem.Model.AdminRegistration;
import com.SchoolManagementSystem.Repository.AdminRepository;


public class CustomAdminDetailsService implements UserDetailsService {
	
	@Autowired
	private AdminRepository  repo;
	@Override
	public UserDetails loadUserByUsername(String email) throws UsernameNotFoundException {
		// TODO Auto-generated method stub
		AdminRegistration admin  = repo.findByemail(email);
		if (admin==null)
		{
			throw new UsernameNotFoundException("User Not Found");
		}
		
		return new CustomAdminDetails(admin);
	}

}
