package com.cg.AutomationSystem.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.cg.AutomationSystem.entity.Course;
import com.cg.AutomationSystem.service.CourseService;

@RestController
@CrossOrigin(origins = "http://localhost:4200")
public class CourseController {
	
	@Autowired
	private CourseService courseservice;
	
	@PostMapping("/addCourses")
	public void addcourse(@RequestBody Course course) {
	 courseservice.addcourse(course);
		
	}
	
	@GetMapping("/getAllCourselist")
	public List<Course> getgetAllCourses(){
		return courseservice.getAllCourses();
	}
	@DeleteMapping("/deletecourse/{id}")
	public void deletecourse(@PathVariable("id") int id) {
		courseservice.deletecourse(id);
		
	}

}
