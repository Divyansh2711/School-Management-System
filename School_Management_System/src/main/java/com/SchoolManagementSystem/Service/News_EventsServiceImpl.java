package com.SchoolManagementSystem.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.SchoolManagementSystem.Model.Events;
import com.SchoolManagementSystem.Model.News;
import com.SchoolManagementSystem.Repository.EventsRepository;
import com.SchoolManagementSystem.Repository.NewsRepository;
/***
 * 
 * 
 * Service Class for fetching  News and evnets form database 
 *
 */
@Service
public class News_EventsServiceImpl implements ShowAllNews_EventsService{
	
	/*
	 *Autowired  object  of NewsRepository Class is created
	 */
	@Autowired
	NewsRepository news;
	
	/*
	 * Autowired  object  of EventsRepository Class is created
	 */
	@Autowired
	EventsRepository events;
	
	
	/*
	 * This method returns All the news form database using NewsRepository object
	 */
	@Override
	public List<News> getAllNews() {
		return news.findAll();
	}
	/*
	 * This method returns all the Event form database using EventRepository
	 */
	@Override
	public List<Events> getAllEvents() {
		return events.findAll();
	}
	
	
	

}
