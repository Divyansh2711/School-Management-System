package com.SchoolManagementSystem;

import static org.assertj.core.api.Assertions.assertThat;

import java.text.ParseException;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase.Replace;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.boot.test.autoconfigure.orm.jpa.TestEntityManager;

import com.SchoolManagementSystem.Model.AdminRegistration;
import com.SchoolManagementSystem.Repository.AdminRepository;

@DataJpaTest
@AutoConfigureTestDatabase(replace=Replace.NONE)
public class AdminRepositoryTest {

	@Autowired
	private AdminRepository adminRepo;
	
	@Autowired
	private TestEntityManager entityManager;
	
	
	@Test
	public void testCreateRegistration() throws ParseException {
		AdminRegistration adminRegistration=new AdminRegistration();
		
		adminRegistration.setEmail("dk2711@gmail.com");
		adminRegistration.setPassword("Dk1999");
		adminRegistration.setFirst_Name("Divyansh");
		adminRegistration.setLast_Name("Kumar");
		adminRegistration.setAddress("Ranchi");
		adminRegistration.setPhone_no("8210127675");
		adminRegistration.setCity("Delhi");
		adminRegistration.setPin(110006);
		adminRegistration.setGender("Male");
		
		AdminRegistration savedRegistration=adminRepo.save(adminRegistration);
		
		AdminRegistration existRegistration=entityManager.find(AdminRegistration.class, savedRegistration.getID());
		
		assertThat(existRegistration.getEmail()).isEqualTo(adminRegistration.getEmail());
		
		
	}
}