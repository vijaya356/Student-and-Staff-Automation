package com.cg.AutomationSystem.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.cg.AutomationSystem.entity.Course;
import com.cg.AutomationSystem.entity.Registration;
import com.cg.AutomationSystem.service.AdminService;

@RestController
@CrossOrigin(origins = "http://localhost:4200")
public class AdminController {

	@Autowired
	private AdminService adminservice;
	
	

	@GetMapping("/getCourcesWithUserName/{userName}")
	public List<Course> getCourcesWithUserName(@PathVariable String userName){
		
		return adminservice.validateCourse(userName);
	}

	@GetMapping("/validateAdminLogin/{userName}/{password}")
	public boolean validateAdminLogin(@PathVariable("userName") String userName,
			@PathVariable("password") String password) {
		boolean valid = adminservice.validateAdminLogin(userName, password);
		return valid;

	}
	
	@PostMapping("/registerStudentCourse")
	public void  RegisterCourse(@RequestBody Registration register) {
		System.out.println("qwertyuiuytr");
		adminservice.registerCourse(register);
		
	}
	@GetMapping("/showRegisteredCourse")
	public List<Registration> getregisteredCourse(){
		return adminservice.getregisteredCourse();
	}
	
}
