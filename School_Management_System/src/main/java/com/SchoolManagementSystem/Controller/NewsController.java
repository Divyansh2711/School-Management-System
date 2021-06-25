package com.SchoolManagementSystem.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.SessionAttributes;

import com.SchoolManagementSystem.Model.News;
import com.SchoolManagementSystem.Repository.NewsRepository;
import com.SchoolManagementSystem.Service.News_EventsServiceImpl;

@Controller
@SessionAttributes("ID")
public class NewsController {

	/*
	 * //object creation for NewsRepository.
	 */	
	@Autowired
	NewsRepository newsRepo;

	/*
	 * //object creation for News_EventsServiceImpl service class .
	 */	
	@Autowired
	News_EventsServiceImpl newsService;

	/*
	 * //It will return News page.
	 */	
	@RequestMapping("/adminProfile/news")
	public String showFeedbackPage() {
		return "News";
	}

	/*
	 * //Admin will be able to add new news.
	 */	
	@PostMapping("/news/added")
	public String submitFeedback(@ModelAttribute("News") News news) {
		newsRepo.save(news);
		return "NewsAdded";
	}
	/*
	 * //User will be able to view all the news. The news section is available
	 * in home page.
	 */
	@GetMapping("/viewAllNews")
	public String viewAllNews(ModelMap model) {
		model.addAttribute("news", newsService.getAllNews());
		return "NewsRecords";
	}

}
