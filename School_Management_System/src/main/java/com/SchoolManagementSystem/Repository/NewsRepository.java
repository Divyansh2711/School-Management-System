package com.SchoolManagementSystem.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Component;

import com.SchoolManagementSystem.Model.News;

@Component
public interface NewsRepository extends JpaRepository<News, Long> {

	/*
	 * //Return the details of News with particular Id.
	 */	
	News findByID(Long ID);
}
