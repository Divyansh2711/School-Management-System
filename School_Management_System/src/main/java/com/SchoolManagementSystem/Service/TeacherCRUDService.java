package com.SchoolManagementSystem.Service;

import java.util.List;

import com.SchoolManagementSystem.Model.TeacherRegistration;
/***
 * 
 * 
 * Interface for creating abstract methods for TeacherCrud Operations
 * 
 * 
 */
public interface TeacherCRUDService {
	
	List<TeacherRegistration> getAllTeacher();
	void saveTeacher(TeacherRegistration teacher);
	TeacherRegistration getTeacherByID(long ID);
	void deleteTeacherById(long ID);

}
