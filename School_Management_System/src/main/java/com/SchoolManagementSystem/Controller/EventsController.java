package com.SchoolManagementSystem.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.SessionAttributes;

import com.SchoolManagementSystem.Model.Events;
import com.SchoolManagementSystem.Repository.EventsRepository;
import com.SchoolManagementSystem.Service.News_EventsServiceImpl;

@Controller
@SessionAttributes("description")
public class EventsController {

	/*
	 * //object creation for EventsRepository.
	 */	
	@Autowired
	EventsRepository eventsRepo;
	
	/*
	 * object creation for News_EventsServiceImpl service class .
	 */	
	@Autowired
	News_EventsServiceImpl eventsService;
	
	/*
	 * It will return Events page.
	 */	
	@RequestMapping("/adminProfile/events")
	public String showFeedbackPage() {
		return "Events";
	}
	
	/*
	 * //Admin will be able to add new event.
	 */	
	@PostMapping("/event/added")
	public String submitFeedback(@ModelAttribute("Events") Events events) {
		eventsRepo.save(events);
		return "EventAdded";
	}
	
	/*
	 * //User will be able to view all the events. The events section is available
	 * in home page.
	 */
	@GetMapping("/viewAllEvents")
	public String viewAllEvents(ModelMap model) {
		model.addAttribute("events", eventsService.getAllEvents());
		return "EventsRecords";
	}
}
