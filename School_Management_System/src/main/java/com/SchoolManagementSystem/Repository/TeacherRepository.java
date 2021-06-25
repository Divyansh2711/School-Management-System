package com.SchoolManagementSystem.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Component;

import com.SchoolManagementSystem.Model.TeacherRegistration;

@Component
public interface TeacherRepository extends JpaRepository<TeacherRegistration,Long>{

<<<<<<< HEAD
	/*
	 * //Return the details of user with particular email
	 */	
	@Query("select u from TeacherRegistration u where u.email = ?1")
	TeacherRegistration findByEmail(String email) ;
	
	/*
	 * //Return the details of user with particular phone_no
	 */	
	@Query("select u from TeacherRegistration u where u.phone_no = ?1")
	TeacherRegistration  findByPhone(String  phone_no);
	
	/*
	 * //Return the details of user with particular password
	 */	
=======
   
	@Query("select u from TeacherRegistration u where u.email = ?1")
	TeacherRegistration findByEmail(String email) ;
	
	@Query("select u from TeacherRegistration u where u.phone_no = ?1")
	TeacherRegistration  findByPhone(String  phone_no);
	
	
>>>>>>> e3f1abb797095a70843f8fb2e65b9cc28b5b88fb
	@Query("select u from TeacherRegistration u where u.password = ?1")
	TeacherRegistration findByPassword(String password);


   
	

    


}
