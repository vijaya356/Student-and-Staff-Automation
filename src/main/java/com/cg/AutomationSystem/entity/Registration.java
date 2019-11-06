package com.cg.AutomationSystem.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "student_registration")
public class Registration {
	
	@Id
	@GeneratedValue
	private int id;
	@Column(length = 20)
	private int courseId;
	@Column(length = 20)
	private String userName;
	
	
	public Registration(int courseId, String userName) {
		super();
		this.courseId = courseId;
		this.userName = userName;
	}


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public int getCourseId() {
		return courseId;
	}


	public void setCourseId(int courseId) {
		this.courseId = courseId;
	}


	public String getUserName() {
		return userName;
	}


	public void setUserName(String userName) {
		this.userName = userName;
	}


	@Override
	public String toString() {
		return "Regsitration [id=" + id + ", courseId=" + courseId + ", userName=" + userName + "]";
	}
	
	
	
	
	

}
