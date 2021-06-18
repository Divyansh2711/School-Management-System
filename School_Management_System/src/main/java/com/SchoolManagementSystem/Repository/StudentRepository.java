package com.SchoolManagementSystem.Repository;




import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Component;

import com.SchoolManagementSystem.Model.StudentRegistration;

@Component
public interface StudentRepository extends JpaRepository<StudentRegistration,Long>{
	
	@Query("select u from StudentRegistration u where u.email = ?1")
    StudentRegistration findByemail(String email);
<<<<<<< HEAD
    
}
=======
	
	@Query("select u from StudentRegistration u where u.id = ?1")
    StudentRegistration findByID(long id);
    
}
>>>>>>> fa9adab204a375edbff28d292420a0613fce3d71
