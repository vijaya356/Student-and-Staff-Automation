package com.cg.AutomationSystem.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cg.AutomationSystem.entity.StaffTimeTable;
import com.cg.AutomationSystem.repo.StaffTableDao;


@Service
public class StaffTableServiceImpl implements StaffTableService {
	
	@Autowired
	private StaffTableDao stafftable;

	
	@Override
	public List<StaffTimeTable> getStaffTable() {
		// TODO Auto-generated method stub
		List<StaffTimeTable> stafftimetable= stafftable.findAll();
		return stafftimetable;
	}

	@Override
	public void addstafftable(StaffTimeTable timetable) {
		// TODO Auto-generated method stub
		stafftable.save(timetable);
	    
		
	}

}
