package com.SchoolManagementSystem;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase.Replace;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.boot.test.autoconfigure.orm.jpa.TestEntityManager;

import com.SchoolManagementSystem.Model.TeacherRegistration;
import com.SchoolManagementSystem.Repository.TeacherRepository;

@DataJpaTest
@AutoConfigureTestDatabase(replace=Replace.NONE)
public class TeacherRepositoryTest {

	@Autowired
	private TeacherRepository teacherRepo;
	
	@Autowired
	private TestEntityManager entityManager;
	
	
	@Test
	public void testTeacherConnection() {
		TeacherRegistration teacherRegistration=new TeacherRegistration();
		
		teacherRegistration.setEmail("dk2711@gmail.com");
		teacherRegistration.setPassword("Dk1999");
		teacherRegistration.setFirst_Name("Divyansh");
		teacherRegistration.setLast_Name("Kumar");
		teacherRegistration.setAddress("Ranchi");
		teacherRegistration.setPhone_no("8210127675");
		teacherRegistration.setSubject("English");
		
		
		TeacherRegistration savedRegistration=teacherRepo.save(teacherRegistration);
		
		TeacherRegistration existRegistration=entityManager.find(TeacherRegistration.class, savedRegistration.getID());
		
		assertThat(existRegistration.getEmail()).isEqualTo(teacherRegistration.getEmail());
		
		
	}
}
