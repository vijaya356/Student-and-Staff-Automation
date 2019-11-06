package com.cg.AutomationSystem.service;

import java.util.List;

import com.cg.AutomationSystem.entity.Course;

public interface CourseService {
	
	public void addcourse(Course course);
	List<Course> getAllCourses();
	public void deletecourse(int id);

}
