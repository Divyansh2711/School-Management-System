package com.SchoolManagementSystem.AdminwebSecurity;

import java.util.Collection;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import com.SchoolManagementSystem.Model.AdminRegistration;



@SuppressWarnings("serial")
public class CustomAdminDetails implements UserDetails {

	
	/**
	 * Constructor with AdminRegistration object
	 */
	private AdminRegistration admin;
	public CustomAdminDetails(AdminRegistration admin) {
		
		this.admin =admin;
	}
	
	

	@Override
	public Collection<? extends GrantedAuthority> getAuthorities() {
		return null;
	}
	
	/**
	 * getter method for getting admin password
	 */

	@Override
	public String getPassword() {
	
		return admin.getPassword();
	}
	
	/**
	 * getter method for getting admin username i.e email here
	 */

	@Override
	public String getUsername() {
		
		return admin.getEmail();
	}

	/**
	 * will check weather account is expired or not
	 */
	@Override
	public boolean isAccountNonExpired() 
	{
		
		return true;
	}

	/**
	 * will check weather account is locked or not
	 */
	@Override
	public boolean isAccountNonLocked() {
		
		return true;
	}

	/**
	 * will check weather credentials is expired or not
	 */
	@Override
	public boolean isCredentialsNonExpired() {
		
		return true;
	}


	/**
	 * will check weather account is enabled or not
	 */
	@Override
	public boolean isEnabled() {
		
		return true;
	}

}

