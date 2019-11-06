package com.cg.AutomationSystem.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cg.AutomationSystem.entity.Staff;

@Repository
public interface StaffDao extends JpaRepository<Staff, Integer> {

	
	Staff getByuserName(String userName);
}
