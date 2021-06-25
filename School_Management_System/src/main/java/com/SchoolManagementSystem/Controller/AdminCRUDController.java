package com.SchoolManagementSystem.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import com.SchoolManagementSystem.Model.AdminRegistration;
import com.SchoolManagementSystem.Service.AdminCRUDService;
/***
 * 
 * 
 *
 * This controller class controls admin record stories
 *
 */
@Controller
public class AdminCRUDController {
	/***
	 *  Autowired AdminCRUDService for using its' services 
	 */
	@Autowired
	private AdminCRUDService adminService;
	
	
	/***
	 * 
	 * @param model
	 * @return AdminRecords view 
	 */
	@GetMapping("/adminProfile/AllAdmin")
	public String viewAdminDetails(ModelMap model) 
	{
		model.addAttribute("admin",adminService.getAllAdmin());
		return "AdminRecords";
	}
	
	
	/***
	 * 
	 * @param admin
	 * use saveadmin method of adminService for saving admin in database
	 * @return SucccesfulUpdate view
	 */
	
	
	@PostMapping("/saveAdmin")
	public String saveAdmin(@ModelAttribute("admin") AdminRegistration admin) {
		adminService.saveAdmin(admin);
		return "SuccessfulUpdate";
	}
	
	/***
	 * Get mapping for fetching admin form database 
	 * @param ID
	 * uses getAdminByID method from adminService class 
	 * @param model
	 * @return UpdateAdmin view 
	 */
	
	@GetMapping("/AdminUpdate/{ID}")
	public String EditAdminDetails(@PathVariable (value="ID") long ID,ModelMap model)
	{
		AdminRegistration admin=adminService.getAdminByID(ID);
		model.addAttribute("update", admin);
		return "UpdateAdmin";
	}
	
	
	/***
	 * Updates admin profile using getAdminByID method 
	 * @param ID
	 * @param model
	 * @return UpdateAdmin view
	 */
	
	
	@GetMapping("adminProfile/AdminUpdate/{ID}")
	public String updateAdminDetails(@PathVariable (value="ID") long ID,ModelMap model) {
		AdminRegistration admin=adminService.getAdminByID(ID);
		model.addAttribute("update", admin);
		return "UpdateAdmin";
	}
	
	/***
	 * Deletes admin record form database using deleteAdminById method of AdminService Class
	 * @param ID
	 * @return
	 */
	
	@GetMapping("adminProfile/adminDelete/{ID}")
	public String deleteAdmin(@PathVariable (value = "ID") long ID) { 
		this.adminService.deleteAdminById(ID);
		return "SuccessfullyDeleted";
	}
}
