package com.cg.AutomationSystem.service;

import java.util.List;

import com.cg.AutomationSystem.entity.StaffTimeTable;

public interface StaffTableService {
	
	void addstafftable(StaffTimeTable timetable);
	List<StaffTimeTable> getStaffTable();

}
