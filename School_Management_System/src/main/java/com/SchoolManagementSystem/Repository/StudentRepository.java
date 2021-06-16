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
	StudentRegistration findById(long Id) ;
}
>>>>>>> 6e3af652ebb07bc27ddff9139cdbd6ca4bc29a62
