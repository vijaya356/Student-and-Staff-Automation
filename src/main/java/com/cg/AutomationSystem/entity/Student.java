package com.cg.AutomationSystem.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "stud_details")
public class Student {
	
	
	@Id
	@GeneratedValue
	private int id;
	@Column(length = 50)
	private String studFName;
	@Column(length = 50)
	private String studLName;
	@Column(length = 50)
	private String phonenum;
	@Column(length = 50)
	private String userName;
	@Column(length = 50)
	private String password;
	@Column(length = 50)
	private String email;
	@Column(length = 50)
	private String studdepart;
	
	public Student() {
		// TODO Auto-generated constructor stub
	}

	

	public Student(String studFName, String studLName, String phonenum, String userName, String password, String email,
			String studdepart) {
		super();
		this.studFName = studFName;
		this.studLName = studLName;
		this.phonenum = phonenum;
		this.userName = userName;
		this.password = password;
		this.email = email;
		this.studdepart = studdepart;
	}

	

	
	public int getId() {
		return id;
	}



	public void setId(int id) {
		this.id = id;
	}



	public String getStudFName() {
		return studFName;
	}



	public void setStudFName(String studFName) {
		this.studFName = studFName;
	}



	public String getStudLName() {
		return studLName;
	}



	public void setStudLName(String studLName) {
		this.studLName = studLName;
	}



	public String getPhonenum() {
		return phonenum;
	}



	public void setPhonenum(String phonenum) {
		this.phonenum = phonenum;
	}



	public String getUserName() {
		return userName;
	}



	public void setUserName(String userName) {
		this.userName = userName;
	}



	public String getPassword() {
		return password;
	}



	public void setPassword(String password) {
		this.password = password;
	}



	public String getEmail() {
		return email;
	}



	public void setEmail(String email) {
		this.email = email;
	}



	public String getStuddepart() {
		return studdepart;
	}



	public void setStuddepart(String studdepart) {
		this.studdepart = studdepart;
	}
	
	





	
	
	
	
	


}
