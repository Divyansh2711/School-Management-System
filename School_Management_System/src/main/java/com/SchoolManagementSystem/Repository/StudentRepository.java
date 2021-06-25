package com.SchoolManagementSystem.Repository;




import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import com.SchoolManagementSystem.Model.StudentRegistration;

@Component
@Repository
public interface StudentRepository extends JpaRepository<StudentRegistration,Long>{
	
	/*
	 * //Return the details of user with particular email
	 */	
	@Query("select u from StudentRegistration u where u.email = ?1")
    StudentRegistration findByemail(String email);



<<<<<<< HEAD
	/*
	 * //Return the details of user with particular ID
	 */	
	@Query("select u from StudentRegistration u where u.id = ?1")
    StudentRegistration findByID(long id);


	/*
	 * //Return the details of user with particular phone_no
	 */	
	@Query("select u from StudentRegistration u where u.phone_no = ?1")
	StudentRegistration findByPhone(String phone_no);
=======
>>>>>>> e3f1abb797095a70843f8fb2e65b9cc28b5b88fb
	
	
	/*
	 * //Return the details of user with particular password
	 */	
	@Query("select u from StudentRegistration u where u.password = ?1")
	StudentRegistration findByPassword(String password);


	/*
	 * //Return the details of user with particular ID
	 */	
	@Query("select u from StudentRegistration u where u.id = ?1")
<<<<<<< HEAD
	List<StudentRegistration> findByIDlist(long ID);
=======
    StudentRegistration findByID(long id);



	@Query("select u from StudentRegistration u where u.phone_no = ?1")
	StudentRegistration findByPhone(String phone_no);
	
	@Query("select u from StudentRegistration u where u.password = ?1")
	StudentRegistration findByPassword(String password);
>>>>>>> e3f1abb797095a70843f8fb2e65b9cc28b5b88fb
    
}
