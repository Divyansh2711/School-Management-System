package com.SchoolManagementSystem.Service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.SchoolManagementSystem.Model.TeacherRegistration;
import com.SchoolManagementSystem.Repository.TeacherRepository;


/*
 * This service class will perform all the crud (create, read, update and delete) operations.
 */
@Service
public class TeacherServiceImpl implements TeacherCRUDService {

	/*
	 * Object creation of TeacherRepository class.
	 */
	@Autowired
	private TeacherRepository teacherRepo;

	
	/*
	 * This method will show the list of all teachers 
	 * present in database.
	 */
	@Override
	public List<TeacherRegistration> getAllTeacher() {
		return teacherRepo.findAll();
	}
	
	
	/*
	 * This method will save the details of a teacher in the 
	 * databse.
	 * 
	 */
	public void saveTeacher(TeacherRegistration student) {
		this.teacherRepo.save(student);
	}

	
	/*
	 * This method will update the details of a particular
	 * teacher
	 *
	 */
	@Override
	public TeacherRegistration getTeacherByID(long ID) {
		Optional<TeacherRegistration> optional=teacherRepo.findById(ID);
		TeacherRegistration teacher = null;
		if (optional.isPresent()) {
			teacher = optional.get();
		} else {
			throw new RuntimeException(" Teacher not found for id :: " + ID);
		}
		return teacher;
	}
	
	
	/*
	 * This method will delete the records of a teacher from 
	 *   the database.
	 */
	@Override
	public void deleteTeacherById(long ID) {
		this.teacherRepo.deleteById(ID);
	}
	
	

}
