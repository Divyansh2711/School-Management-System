package com.SchoolManagementSystem;

import static org.assertj.core.api.Assertions.assertThat;


import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase.Replace;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.boot.test.autoconfigure.orm.jpa.TestEntityManager;

import com.SchoolManagementSystem.Model.Feedback;
import com.SchoolManagementSystem.Repository.FeedbackRepository;

@DataJpaTest
@AutoConfigureTestDatabase(replace=Replace.NONE)
public class FeedbackRepositoryTest {

	@Autowired
	private FeedbackRepository feedbackRepo;
	
	@Autowired
	private TestEntityManager entityManager;
	
	
	@Test
	public void testFeedbackConnection(){
		Feedback feedback=new Feedback();
		
		feedback.setEmail("dk2711@gmail.com");
		feedback.setFirst_Name("Divyansh");
		feedback.setLast_Name("Kumar");
		feedback.setPhone_no("8210127675");
		feedback.setDescription("awesome facilities");
		
		Feedback savedRegistration=feedbackRepo.save(feedback);
		
		Feedback existfeedback=entityManager.find(Feedback.class, savedRegistration.getID());
		
		assertThat(existfeedback.getDescription()).isEqualTo(feedback.getDescription());
		
		
	}
}
