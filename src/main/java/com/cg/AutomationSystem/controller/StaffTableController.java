package com.cg.AutomationSystem.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.cg.AutomationSystem.entity.StaffTimeTable;
import com.cg.AutomationSystem.service.StaffTableService;

@RestController
@CrossOrigin(origins = "http://localhost:4200")
public class StaffTableController {
	
	@Autowired
	private StaffTableService service;
	
	@PostMapping("/addtimetable")
	public void addstafftable(@RequestBody StaffTimeTable timetable) {
		service.addstafftable(timetable);
		
	}

	@GetMapping("/getstafftable")
	public List<StaffTimeTable> getStaffTable(){
		return service.getStaffTable();
		
	}
	
}
