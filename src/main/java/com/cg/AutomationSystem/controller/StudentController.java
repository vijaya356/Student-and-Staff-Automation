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

import com.cg.AutomationSystem.entity.Student;
import com.cg.AutomationSystem.service.StudentService;


@RestController
@CrossOrigin(origins = "http://localhost:4200")
public class StudentController {
	
	@Autowired
	private StudentService studentservice;
	
	@PostMapping("/addstudent")
	public void addStudent(@RequestBody Student student) {
	System.out.println("student added");
		studentservice.addStudent(student);
		
	}
	@GetMapping("/getAllStudents")
	public List<Student> getAllstudents() {
		return studentservice.getAllstudents();
	}
	
	@GetMapping("/validateStudentLogin/{userName}/{password}")
	public boolean validateStudentlogin(@PathVariable("userName") String userName,
			@PathVariable("password") String password) {
		boolean valid=studentservice.validateStudentlogin(userName, password);
		return valid;
	}
	
	@DeleteMapping("/deletebyid/{id}")
	public void deleteStudent(@PathVariable("id") int id) {
		studentservice.deleteStudent(id);
	}
	
	@PostMapping("/editStudent")
	public void editStudent(@RequestBody Student student) {
		System.out.println("eqwre   .............");
		studentservice.editStudent(student);
		
	}
	
	

}
