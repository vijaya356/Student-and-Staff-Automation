package com.cg.AutomationSystem.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cg.AutomationSystem.entity.Course;
import com.cg.AutomationSystem.repo.CourseDao;

@Service
public class CourseServiceImpl implements CourseService {
	
	@Autowired
	private CourseDao coursedao;

	@Override
	public void addcourse(Course course) {
		// TODO Auto-generated method stub
		course.setRegistered(false);
		coursedao.save(course);

	}

	@Override
	public List<Course> getAllCourses() {
		// TODO Auto-generated method stub
		List<Course> courses= coursedao.findAll();
		return courses;
	}

	@Override
	public void deletecourse(int id) {
		// TODO Auto-generated method stub
		coursedao.deleteById(id);
		
	}

}
