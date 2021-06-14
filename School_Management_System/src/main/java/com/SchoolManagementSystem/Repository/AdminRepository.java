package com.SchoolManagementSystem.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Component;

import com.SchoolManagementSystem.Model.AdminRegistration;

@Component
public interface AdminRepository extends JpaRepository<AdminRegistration,Long>{
	
	AdminRegistration findByemail(String email);
}
