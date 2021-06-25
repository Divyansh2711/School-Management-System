package com.SchoolManagementSystem.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Component;

import com.SchoolManagementSystem.Model.Feedback;

@Component
public interface FeedbackRepository extends JpaRepository<Feedback,Long>{
	
	/*
	 * //Return the details of user with particular email
	 */	
	Feedback findByemail(String email);
}
