package com.cg.AutomationSystem.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cg.AutomationSystem.entity.Student;


@Repository
public interface StudentDao extends JpaRepository<Student, Integer> {
	
	Student getByuserName(String userName);

}
