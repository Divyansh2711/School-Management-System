package com.SchoolManagementSystem;

import static org.assertj.core.api.Assertions.assertThat;


import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase.Replace;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.boot.test.autoconfigure.orm.jpa.TestEntityManager;

import com.SchoolManagementSystem.Model.StudentRegistration;
import com.SchoolManagementSystem.Repository.StudentRepository;

@DataJpaTest
@AutoConfigureTestDatabase(replace=Replace.NONE)
public class StudentRepositoryTest {

	@Autowired
	private StudentRepository repo;
	
	@Autowired
	private TestEntityManager entityManager;
	
	
	@Test
	public void TestTeacherConnection(){
		StudentRegistration studentRegistration=new StudentRegistration();
		
		studentRegistration.setEmail("dk2711@gmail.com");
		studentRegistration.setPassword("Dk1999");
		studentRegistration.setFirst_Name("Divyansh");
		studentRegistration.setLast_Name("Kumar");
		studentRegistration.setAddress("Ranchi");
		studentRegistration.setPhone_no("8210127675");
		studentRegistration.setCity("Delhi");
		studentRegistration.setPin(110006);
		studentRegistration.setGender("Male");
		
		StudentRegistration savedRegistration=repo.save(studentRegistration);
		
		StudentRegistration existRegistration=entityManager.find(StudentRegistration.class, savedRegistration.getID());
		
		assertThat(existRegistration.getEmail()).isEqualTo(studentRegistration.getEmail());
		
		
	}
}
