package com.SchoolManagementSystem.Service;

import java.util.List;

import com.SchoolManagementSystem.Model.AdminRegistration;

/***
 * 
 * 
 * This interface contains abstract methods for AdminCrud operations
 */

public interface AdminCRUDService {

	
	List<AdminRegistration> getAllAdmin();
	void saveAdmin(AdminRegistration admin);
	AdminRegistration getAdminByID(long ID);
	void deleteAdminById(long ID);

	
}
