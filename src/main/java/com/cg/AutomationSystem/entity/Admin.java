package com.cg.AutomationSystem.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name = "admin_auto")
public class Admin {
	
	
//	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "admin_generator")
//	@SequenceGenerator(name="admin_generator", sequenceName = "admin_seq", allocationSize=100)
	@Id
	@Column(length = 20)
	private String userName;
	@Column(length = 20)
	private String password;
	
	
	public Admin(String userName, String password) {
		super();
		this.userName = userName;
		this.password = password;
	}
	public Admin() {
		// TODO Auto-generated constructor stub
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
