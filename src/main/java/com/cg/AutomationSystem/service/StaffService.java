package com.cg.AutomationSystem.service;

import java.util.List;

import com.cg.AutomationSystem.entity.Staff;

public interface StaffService {

	
	void addstaff(Staff staff);
	List<Staff> getAllStaffs();
	boolean validateStafflogin(String userName, String password);
	public void deleteStaff(int id);
}
