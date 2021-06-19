package com.SchoolManagementSystem.AdminwebSecurity;

import java.util.Collection;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import com.SchoolManagementSystem.Model.AdminRegistration;

public class CustomAdminDetails implements UserDetails {

	private AdminRegistration admin;
	public CustomAdminDetails(AdminRegistration admin) {
		
		this.admin =admin;
	}

	@Override
	public Collection<? extends GrantedAuthority> getAuthorities() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String getPassword() {
	
		return admin.getPassword();
	}

	@Override
	public String getUsername() {
		
		return admin.getEmail();
	}

	@Override
	public boolean isAccountNonExpired() 
	{
		
		return true;
	}

	@Override
	public boolean isAccountNonLocked() {
		
		return true;
	}

	@Override
	public boolean isCredentialsNonExpired() {
		
		return true;
	}

	@Override
	public boolean isEnabled() {
		// TODO Auto-generated method stub
		return true;
	}


}

