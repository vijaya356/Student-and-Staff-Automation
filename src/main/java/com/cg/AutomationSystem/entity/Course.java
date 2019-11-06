package com.cg.AutomationSystem.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Courses")
public class Course {
	
	@Id
	@GeneratedValue
	private int id;
	@Column(length = 20)
	private String courseName;
	@Column(length = 20)
	private String facultyName;
	@Column(length = 20)
	private String startDate;
	@Column(length = 20)
	private String endDate;
	@Column(length = 20)
	private int capacity;
	private boolean registered;
	
	public Course() {
		// TODO Auto-generated constructor stub
	}
	

	public Course(String courseName, String facultyName, String startDate, String endDate, int capacity,
			boolean registered) {
		super();
		this.courseName = courseName;
		this.facultyName = facultyName;
		this.startDate = startDate;
		this.endDate = endDate;
		this.capacity = capacity;
		this.registered = registered;
	}


	public String getCourseName() {
		return courseName;
	}

	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}

	public String getFacultyName() {
		return facultyName;
	}

	public void setFacultyName(String facultyName) {
		this.facultyName = facultyName;
	}

	public String getStartDate() {
		return startDate;
	}

	public void setStartDate(String startDate) {
		this.startDate = startDate;
	}

	public String getEndDate() {
		return endDate;
	}

	public void setEndDate(String endDate) {
		this.endDate = endDate;
	}

	public int getCapacity() {
		return capacity;
	}

	public void setCapacity(int capacity) {
		this.capacity = capacity;
	}
	
	

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}
	
	

	

	

	public boolean isRegistered() {
		return registered;
	}

	public void setRegistered(boolean registered) {
		this.registered = registered;
	}

	
	
	
	
	

}
