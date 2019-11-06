package com.cg.AutomationSystem.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "staff_time")
public class StaffTimeTable {
	
	@Id
	@GeneratedValue
	private int id;
	@Column(length = 20)
	private String facultyName;
	@Column(length = 20)
	private String courseName;
	@Column(length = 20)
	private String startDate;
	@Column(length = 20)
	private String endDate;
	
	
	public StaffTimeTable(String facultyName, String courseName, String startDate, String endDate) {
		super();
		this.facultyName = facultyName;
		this.courseName = courseName;
		this.startDate = startDate;
		this.endDate = endDate;
	}
	
     public StaffTimeTable() {
	// TODO Auto-generated constructor stub
}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getFacultyName() {
		return facultyName;
	}

	public void setFacultyName(String facultyName) {
		this.facultyName = facultyName;
	}

	public String getCourseName() {
		return courseName;
	}

	public void setCourseName(String courseName) {
		this.courseName = courseName;
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

	@Override
	public String toString() {
		return "StaffTimeTable [id=" + id + ", facultyName=" + facultyName + ", courseName=" + courseName
				+ ", startDate=" + startDate + ", endDate=" + endDate + "]";
	}	


	
	
	
	
	

}
