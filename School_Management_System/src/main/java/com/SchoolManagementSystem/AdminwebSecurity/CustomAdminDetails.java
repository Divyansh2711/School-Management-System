package com.SchoolManagementSystem.AdminwebSecurity;

import java.util.Collection;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import com.SchoolManagementSystem.Model.AdminRegistration;

<<<<<<< HEAD


@SuppressWarnings("serial")
public class CustomAdminDetails implements UserDetails {

	
	/**
	 * Constructor with AdminRegistration object
	 */
=======
public class CustomAdminDetails implements UserDetails {

>>>>>>> e3f1abb797095a70843f8fb2e65b9cc28b5b88fb
	private AdminRegistration admin;
	public CustomAdminDetails(AdminRegistration admin) {
		
		this.admin =admin;
	}
<<<<<<< HEAD
	
	

	@Override
	public Collection<? extends GrantedAuthority> getAuthorities() {
		return null;
	}
	
	/**
	 * getter method for getting admin password
	 */
=======

	@Override
	public Collection<? extends GrantedAuthority> getAuthorities() {
		// TODO Auto-generated method stub
		return null;
	}
>>>>>>> e3f1abb797095a70843f8fb2e65b9cc28b5b88fb

	@Override
	public String getPassword() {
	
		return admin.getPassword();
	}
<<<<<<< HEAD
	
	/**
	 * getter method for getting admin username i.e email here
	 */
=======
>>>>>>> e3f1abb797095a70843f8fb2e65b9cc28b5b88fb

	@Override
	public String getUsername() {
		
		return admin.getEmail();
	}

<<<<<<< HEAD
	/**
	 * will check weather account is expired or not
	 */
=======
>>>>>>> e3f1abb797095a70843f8fb2e65b9cc28b5b88fb
	@Override
	public boolean isAccountNonExpired() 
	{
		
		return true;
	}

<<<<<<< HEAD
	/**
	 * will check weather account is locked or not
	 */
=======
>>>>>>> e3f1abb797095a70843f8fb2e65b9cc28b5b88fb
	@Override
	public boolean isAccountNonLocked() {
		
		return true;
	}

<<<<<<< HEAD
	/**
	 * will check weather credentials is expired or not
	 */
=======
>>>>>>> e3f1abb797095a70843f8fb2e65b9cc28b5b88fb
	@Override
	public boolean isCredentialsNonExpired() {
		
		return true;
	}

<<<<<<< HEAD

	/**
	 * will check weather account is enabled or not
	 */
	@Override
	public boolean isEnabled() {
		
		return true;
	}

=======
	@Override
	public boolean isEnabled() {
		// TODO Auto-generated method stub
		return true;
	}


>>>>>>> e3f1abb797095a70843f8fb2e65b9cc28b5b88fb
}

