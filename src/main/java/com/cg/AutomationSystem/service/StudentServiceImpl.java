package com.cg.AutomationSystem.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cg.AutomationSystem.entity.Student;
import com.cg.AutomationSystem.repo.StudentDao;

@Service
public class StudentServiceImpl implements StudentService {

	@Autowired
	private StudentDao studentdao;

	@Override
	public void addStudent(Student student) {
		// TODO Auto-generated method stub
		studentdao.save(student);

	}

	@Override
	public List<Student> getAllstudents() {
		// TODO Auto-generated method stub
		List<Student> students = studentdao.findAll();
		return students;
	}

	@Override
	public boolean validateStudentlogin(String userName, String password) {
		// TODO Auto-generated method stub
		try {
			Student student = studentdao.getByuserName(userName);
			if (student != null) {
				String pwd = student.getPassword();
				if (pwd.equals(password))
					return true;
				else
					return false;
			} else
				return false;
		} catch (Exception e) {
			System.out.println("No user found");

		}
		return false;
	}

	@Override
	public void deleteStudent(int id) {
		// TODO Auto-generated method stub
		studentdao.deleteById(id);

	}

	@Override
	public void editStudent(Student student) {
		// TODO Auto-generated method stub
		Student s = new Student(student.getId(),student.getStudFName(), student.getStudLName(), student.getPhonenum(),
				student.getUserName(), student.getPassword(), student.getEmail(), student.getStuddepart());
		System.out.println(s);
//		s.setId(student.getId());
//		s.setPassword(student.getPassword());
//		s.setUserName(student.getUserName());
//		s.setEmail(student.getEmail());
//		s.setStuddepart(student.getStuddepart());
		studentdao.save(s);

	}

}
