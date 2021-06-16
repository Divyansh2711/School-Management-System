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

	
	@Autowired
	FeedbackRepository feedbackRepo;
	
	@RequestMapping("/feedback")
	public String showFeedbackPage() {
		return "Feedback";
	}
	
	@PostMapping("/feedback/submitted")
	public String submitFeedback(@ModelAttribute("Feedback") Feedback feedback) {
		feedbackRepo.save(feedback);
		return "FeedbackSubmitted";
	}
}
