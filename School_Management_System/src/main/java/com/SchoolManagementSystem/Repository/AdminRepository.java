package com.SchoolManagementSystem.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Component;

import com.SchoolManagementSystem.Model.AdminRegistration;

@Component
public interface AdminRepository extends JpaRepository<AdminRegistration,Long>{
	 
	@Query("select u from AdminRegistration u where u.email = ?1")
	AdminRegistration findByemail(String email);
	
	
	@Query("select u from AdminRegistration u where u.phone_no = ?1")
	AdminRegistration findByPhone(String phone_no);
	

	@Query("select u from AdminRegistration u where u.password = ?1")
	AdminRegistration findByPassword(String password);

}
