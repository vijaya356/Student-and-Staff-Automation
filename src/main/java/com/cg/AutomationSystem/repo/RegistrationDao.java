package com.cg.AutomationSystem.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.cg.AutomationSystem.entity.Registration;
import com.cg.AutomationSystem.entity.Student;

public interface RegistrationDao extends JpaRepository<Registration, Integer> {
	
	@Query("SELECT reg.courseId FROM Registration reg WHERE reg.userName=(:uName)")
	List<Integer> validateCourse(@Param("uName") String uName);


}
