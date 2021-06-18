package com.SchoolManagementSystem.Service;

import java.util.List;

import com.SchoolManagementSystem.Model.StudentRegistration;

public interface StudentService {

	List<StudentRegistration> getAllStudent();
	void saveStudent(StudentRegistration student);
	StudentRegistration getStudentByID(long ID);
	void deleteStudentById(long ID);
}
