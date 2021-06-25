package com.SchoolManagementSystem.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;


@Controller
public class HomeController {

	/* return Delhi-Public-School view. */
	@RequestMapping(value="/DPS/school", method = RequestMethod.GET)
	public String showHomePage(ModelMap model){
		return "Delhi-Public-School";
	}
	
	/* return About-US view. */
	@RequestMapping(value="/DPS/school/AboutUs", method = RequestMethod.GET)
	public String AboutUsPage(ModelMap model){
		return "About-Us";
	}
	
	/* return Academics view. */
	@RequestMapping(value="/DPS/school/Academics", method = RequestMethod.GET)
	public String AcademicsPage(ModelMap model){
		return "Academics";
	}
	
	/* return Facilitites view. */
	@RequestMapping(value="/DPS/school/Facilities", method = RequestMethod.GET)
	public String FacilitiesPage(ModelMap model){
		return "Facilities";
	}
	
	/* return Admission view. */
	@RequestMapping(value="/DPS/school/Admission", method = RequestMethod.GET)
	public String AdmissionPage(ModelMap model){
		return "Admission";
	}
	
	/* return Transport view. */
	@RequestMapping(value="/DPS/school/Transportation", method = RequestMethod.GET)
	public String TransportationPage(ModelMap model){
		return "Transport";
	}
	
	/* return Programmes view. */
	@RequestMapping(value="/DPS/school/Programme", method = RequestMethod.GET)
	public String ProgrammesPage(ModelMap model){
		return "Programmes";
	}
	
	
	/* return News&Announcements view. */
	@RequestMapping(value="/DPS/school/News", method = RequestMethod.GET)
	public String NewsSection(ModelMap model){
		return "News&Announcements";
	}
	
	/* return EventSection view. */
	@RequestMapping(value="/DPS/school/Events", method = RequestMethod.GET)
	public String EventsSection(ModelMap model){
		return "EventSection";
	}
	
	/* return Contact-Us view. */
	@RequestMapping(value="/DPS/school/Contact Us", method = RequestMethod.GET)
	public String ContactUsPage(ModelMap model){
		return "Contact-Us";
	}

	/* return PrePrimary view. */
	@GetMapping("/curriculum/pre-prim")
	public String showPrePrimaryCurriculum(ModelMap model){
		return "PrePrimary";
	}
	
	/* return Primary view. */
	@RequestMapping(value="/curriculum/primary", method = RequestMethod.GET)
	public String showPrimaryCurriculum(ModelMap model){
		return "Primary";
	}
	
	/* return Secondary view. */
	@RequestMapping(value="/curriculum/secondary", method = RequestMethod.GET)
	public String showSecondaryCurriculum(ModelMap model){
		return "Secondary";
	}
	
	/* return SeniorSecondary view. */
	@RequestMapping(value="/curriculum/senior-sec", method = RequestMethod.GET)
	public String showSeniorSecondaryCurriculum(ModelMap model){
		return "SeniorSecondary";
	}
	
	/* return Programmes view. */
	@GetMapping("/programmes/extra")
	public String showExtraCurricular(ModelMap model) {
		return "Programmes";
	}

	/* return Programmes view. */
	@GetMapping("/programmes/visual")
	public String showVisualArts(ModelMap model) {
		return "Programmes";
	}

	/* return Collab view. */
	@GetMapping("/programmes/collab")
	public String showCollab(ModelMap model) {
		return "Collab";
	}

	/* return BookList view. */
	@GetMapping("/academics/books")
	public String showBookList(ModelMap model) {
		return "BookList";
	}

	/* return Innovation view. */
	@GetMapping("/academics/innovative")
	public String showInnovation(ModelMap model) {
		return "Innovation";
	}

	/* return Policy view. */
	@GetMapping("/academics/policy")
	public String showPolicy(ModelMap model) {
		return "Policy";
	}

	/* return Mision view. */
	@GetMapping("/school/mission")
	public String showMission(ModelMap model) {
		return "Mission";
	}
	
	/* return Campus view. */
	@GetMapping("/school/campus")
	public String showCampus(ModelMap model) {
		return "Campus";
	}
	
	/* return Message view. */
	@GetMapping("/school/message")
	public String showMessage(ModelMap model) {
		return "Message";
	}
	
	/* return Awards view. */
	@GetMapping("/school/awards")
	public String showAwards(ModelMap model) {
		return "Awards";
	}
}
