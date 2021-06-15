package com.SchoolManagementSystem.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Component;

import com.SchoolManagementSystem.Model.StudentRegistration;

@Component
public interface StudentRepository extends JpaRepository<StudentRegistration,Long>{
    StudentRegistration findByemail(String email);
	@Query("select u from StudentRegistration u where u.id = ?1")
	StudentRegistration findById(long Id) ;
}
