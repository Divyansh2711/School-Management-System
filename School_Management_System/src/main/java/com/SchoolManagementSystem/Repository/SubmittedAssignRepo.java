package com.SchoolManagementSystem.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;


import com.SchoolManagementSystem.Model.SubmittedAssignment;


public interface SubmittedAssignRepo extends JpaRepository<SubmittedAssignment, Long> {
	
	/*
	 * //Return the details of assignemnt, to user with a   particular ID
	 */	
	@Query("select u from SubmittedAssignment u where u.assignment_id = ?1")
	List<SubmittedAssignment> findByassgnmtid(long assignment_id);
	
	

}
