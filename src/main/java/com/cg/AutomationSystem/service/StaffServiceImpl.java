package com.cg.AutomationSystem.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cg.AutomationSystem.entity.Staff;
import com.cg.AutomationSystem.repo.StaffDao;

@Service
public class StaffServiceImpl implements StaffService {
	
	@Autowired
	private StaffDao staffdao;

	@Override
	public void addstaff(Staff staff) {
		// TODO Auto-generated method stub
		staffdao.save(staff);

	}

	@Override
	public List<Staff> getAllStaffs() {
		// TODO Auto-generated method stub
		List<Staff> staffs=staffdao.findAll();
		return staffs;
	}

	@Override
	public boolean validateStafflogin(String userName, String password) {
		// TODO Auto-generated method stub
		try {
			Staff staff = staffdao.getByuserName(userName);
			if(staff != null) {
				String pwd = staff.getPassword();
				if (pwd.equals(password))
					return true;
				else
					return false;
			}else
				return false;
		}catch(Exception e)
		{
			System.out.println("No user found with these credentials");
		}
		return false;
	}

	@Override
	public void deleteStaff(int id) {
		// TODO Auto-generated method stub
		staffdao.deleteById(id);
		
	}

}
