package com.SchoolManagementSystem.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.SessionAttributes;

import com.SchoolManagementSystem.Model.Feedback;
import com.SchoolManagementSystem.Repository.FeedbackRepository;

@Controller
@SessionAttributes("email")
public class FeedbackController {

	/*
	 * //object creation for FeedbackRepository
	 */	
	@Autowired
	FeedbackRepository feedbackRepo;
	
	/*
	 * //It will return Feedback page.
	 */	
	@RequestMapping("/feedback")
	public String showFeedbackPage() {
		return "Feedback";
	}
	
	/*
	 * //After filling the form and Successfully submitting it, it will return
	 * FeedbackSubmitted page.
	 */	
	@PostMapping("/feedback/submitted")
	public String submitFeedback(@ModelAttribute("Feedback") Feedback feedback) {
		feedbackRepo.save(feedback);
		return "FeedbackSubmitted";
	}
}
