package com.SchoolManagementSystem.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Component;

import com.SchoolManagementSystem.Model.TeacherRegistration;

@Component
public interface TeacherRepository extends JpaRepository<TeacherRegistration,Long>{
    TeacherRegistration findByemail(String email);
	
    
}
