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

import com.cg.AutomationSystem.entity.Staff;
import com.cg.AutomationSystem.service.StaffService;

@RestController
@CrossOrigin(origins = "http://localhost:4200")
public class StaffController {
	
	@Autowired
	private StaffService staffservice;
	
	@PostMapping("/addStaff")
	public void addstaff(@RequestBody Staff staff) {
		staffservice.addstaff(staff);
		
	}
	@GetMapping("/getAllstaff")
	public List<Staff> getAllStaffs(){
		return staffservice.getAllStaffs();
	}
	
	@GetMapping("/validateStaffLogin/{userName}/{password}")
	public boolean validateStafflogin(@PathVariable("userName") String userName,
			@PathVariable("password") String password) {
		boolean valid=staffservice.validateStafflogin(userName, password);
		return valid;
	}
	@DeleteMapping("/deletestaff/{id}")
	public void deleteStaff(@PathVariable("id") int id) {
		staffservice.deleteStaff(id);
		
	}
	

}
