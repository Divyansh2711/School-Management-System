package com.SchoolManagementSystem.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Component;

import com.SchoolManagementSystem.Model.TeacherRegistration;

@Component
public interface TeacherRepository extends JpaRepository<TeacherRegistration,Long>{
<<<<<<< HEAD
   
	@Query("select u from TeacherRegistration u where u.email = ?1")
	TeacherRegistration findByEmail(String email) ;
=======

   
	@Query("select u from TeacherRegistration u where u.email = ?1")
	TeacherRegistration findByEmail(String email) ;

    

>>>>>>> fa9adab204a375edbff28d292420a0613fce3d71
}
