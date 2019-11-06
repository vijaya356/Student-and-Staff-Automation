package com.cg.AutomationSystem.entity;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "staff_details")
public class Staff {

	@Id
	@GeneratedValue
	private int id;
	@Column(length = 50)
	private String staffname;
	@Column(length = 50)
	private String subject;
	@Column(length = 50)
	private String phonenumber;
	@Column(length =50)
	private String email;
	@Column(length = 50)
	private String userName;
	@Column(length = 50)
	private String password;
	
	
	public Staff(String staffname, String subject, String phonenumber, String email, String userName, String password) {
		super();
		this.staffname = staffname;
		this.subject = subject;
		this.phonenumber = phonenumber;
		this.email = email;
		this.userName = userName;
		this.password = password;
	}

	public Staff() {
		// TODO Auto-generated constructor stub
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getStaffname() {
		return staffname;
	}

	public void setStaffname(String staffname) {
		this.staffname = staffname;
	}

	public String getSubject() {
		return subject;
	}

	public void setSubject(String subject) {
		this.subject = subject;
	}

	public String getPhonenumber() {
		return phonenumber;
	}

	public void setPhonenumber(String phonenumber) {
		this.phonenumber = phonenumber;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
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

}
