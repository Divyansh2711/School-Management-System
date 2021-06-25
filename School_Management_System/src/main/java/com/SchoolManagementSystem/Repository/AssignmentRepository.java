package com.SchoolManagementSystem.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.SchoolManagementSystem.Model.Assignment;

public interface AssignmentRepository extends JpaRepository<Assignment, Long> {
	
	/*
	 * //Return the details of a particular class.
	 */	
	@Query("select u from Assignment u where u.slass = ?1")
	List<Assignment> findBySlass(String slass);

}
