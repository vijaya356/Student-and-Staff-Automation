package com.cg.AutomationSystem.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cg.AutomationSystem.entity.Admin;
import com.cg.AutomationSystem.entity.Course;
import com.cg.AutomationSystem.entity.Registration;
import com.cg.AutomationSystem.repo.AdminDao;
import com.cg.AutomationSystem.repo.CourseDao;
import com.cg.AutomationSystem.repo.RegistrationDao;

@Service
public class AdminServiceImpl implements AdminService {

	@Autowired
	private AdminDao admindao;
	
	@Autowired
	private RegistrationDao registerdao;
	
	@Autowired
	private CourseDao courseDao;
	

	@Override
	public boolean validateAdminLogin(String userName, String password) {
		// TODO Auto-generated method stub
		try {
			Admin admin = admindao.findById(userName).get();
			String pwd = admin.getPassword();
			if (pwd.equals(password))
				return true;
			else
				return false;
		}
		catch (Exception e) {
			System.out.println("No user");
		}
		return false;
		
	}

	@Override
	public void registerCourse(Registration register) {
		// TODO Auto-generated method stub
		System.out.println(register);
		courseDao.updateReg(true, register.getCourseId());
		registerdao.save(register);
		
	}

	@Override
	public List<Registration> getregisteredCourse() {
		// TODO Auto-generated method stub
		List<Registration> register = registerdao.findAll();
        return register;
	}

	@Override
	public List<Course> validateCourse(String uName) {
		// TODO Auto-generated method stub
		List<Integer> regcourse= registerdao.validateCourse(uName);
		List<Course> courseList=new ArrayList<Course>();
		if(regcourse!=null) {
			for(int i=0;i<regcourse.size();i++) {
				courseList.add(courseDao.findById(regcourse.get(i)).get());
				//System.out.println(courseList.get(i));
			}
			return courseList;
			
			
		
		}
		
		return null;
	}

}
