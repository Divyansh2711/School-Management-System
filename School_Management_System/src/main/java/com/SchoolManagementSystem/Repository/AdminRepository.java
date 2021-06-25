package com.SchoolManagementSystem.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Component;

import com.SchoolManagementSystem.Model.AdminRegistration;

@Component
public interface AdminRepository extends JpaRepository<AdminRegistration,Long>{
	
	
	/*
	 * //Return the details of user with particular email
	 */	
	@Query("select u from AdminRegistration u where u.email = ?1")
	AdminRegistration findByemail(String email);
	
<<<<<<< HEAD
	/*
	 * //Return the details of user with particular phone_no
	 */	
	@Query("select u from AdminRegistration u where u.phone_no = ?1")
	AdminRegistration findByPhone(String phone_no);
	
	/*
	 * //Return the details of user with particular password
	 */	
=======
	
	@Query("select u from AdminRegistration u where u.phone_no = ?1")
	AdminRegistration findByPhone(String phone_no);
	

>>>>>>> e3f1abb797095a70843f8fb2e65b9cc28b5b88fb
	@Query("select u from AdminRegistration u where u.password = ?1")
	AdminRegistration findByPassword(String password);

}
