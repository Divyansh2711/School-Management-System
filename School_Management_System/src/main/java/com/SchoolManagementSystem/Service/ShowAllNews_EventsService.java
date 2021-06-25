package com.SchoolManagementSystem.Service;

import java.util.List;

import com.SchoolManagementSystem.Model.Events;
import com.SchoolManagementSystem.Model.News;

/***
 * 
 * 
 * Interface for creating abstract methods for Event and News
 *
 */
public interface ShowAllNews_EventsService {
	/***
	 * Abstract Methods for News
	 * @return List of type News
	 */
	List<News> getAllNews();
	
	/**
	 * Abstract method method for Event 
	 * @return  List of type Event
	 */
	List<Events> getAllEvents();
}
