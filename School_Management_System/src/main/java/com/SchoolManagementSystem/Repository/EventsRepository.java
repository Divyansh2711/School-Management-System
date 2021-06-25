package com.SchoolManagementSystem.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Component;

import com.SchoolManagementSystem.Model.Events;

@Component
public interface EventsRepository extends JpaRepository<Events, Long> {

	/*
	 * //Return the details of news with particular description
	 */	
	Events findBydescription(String description);
}
