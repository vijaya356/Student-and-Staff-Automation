package com.cg.AutomationSystem.service;

import java.util.List;

import com.cg.AutomationSystem.entity.Course;
import com.cg.AutomationSystem.entity.Registration;


public interface AdminService {
	
	boolean validateAdminLogin (String userName, String password);
	
	public void registerCourse(Registration register);
	
	 List<Registration> getregisteredCourse();
	 List<Course> validateCourse(String uName);
		

}
