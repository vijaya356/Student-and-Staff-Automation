package com.cg.AutomationSystem.service;

import java.util.List;

import com.cg.AutomationSystem.entity.Student;

public interface StudentService {

	
	void addStudent(Student student);
	List<Student> getAllstudents();
	boolean validateStudentlogin(String userName, String password);
	public void deleteStudent(int id);
	void editStudent(Student student);
	
}
