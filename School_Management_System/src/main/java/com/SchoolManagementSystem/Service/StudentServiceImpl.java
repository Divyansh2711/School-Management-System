package com.SchoolManagementSystem.Service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.SchoolManagementSystem.Model.StudentRegistration;
import com.SchoolManagementSystem.Repository.StudentRepository;


/*
 * This service class will perform all the crud (create, read, update and delete) operations.
 */
@Service
public class StudentServiceImpl implements StudentService {

	/*
	 * Object creation of StudentRepository class.
	 */
	@Autowired
	private StudentRepository studentRepo;

	
	/*
	 * This method will show the list of all students 
	 * present in database.
	 */
	@Override
	public List<StudentRegistration> getAllStudent() {
		return studentRepo.findAll();
	}
	
	
	/*
	 * This method will save the details of the student in the 
	 * databse.
	 * 
	 */
	public void saveStudent(StudentRegistration student) {
		this.studentRepo.save(student);
	}

	
	/*
	 * This method will update the details of a particular
	 * student 
	 *
	 */
	@Override
	public StudentRegistration getStudentByID(long ID) {
		Optional<StudentRegistration> optional=studentRepo.findById(ID);
		StudentRegistration student = null;
		if (optional.isPresent()) {
			student = optional.get();
		} else {
			throw new RuntimeException(" Student not found for id :: " + ID);
		}
		return student;
	}
	
	
	/*
	 * This method will delete the records of the student present 
	 *   in database.
	 */
	@Override
	public void deleteStudentById(long ID) {
		this.studentRepo.deleteById(ID);
	}
	
	

}
