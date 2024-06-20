package com.asuni.myapp.POJO;

import com.asuni.myapp.entity.EmployeeEntity;

public class Employee {


	public Employee()
	{

	}

	private Integer eid;
	
	private String fname;
	
	private String lname;
	
	private String email;

	public Employee(EmployeeEntity entity) {
		this.eid = entity.getEid();
		this.fname = entity.getFname();
		this.lname = entity.getLname();
		this.email = entity.getEmail();
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public void setFname(String fname) {
		this.fname = fname;
	}

	public void setLname(String lname) {
		this.lname = lname;
	}

	public void setEid(Integer eid) {
		this.eid = eid;
	}

	public String getEmail() {
		return email;
	}

	public String getFname() {
		return fname;
	}

	public Integer getEid() {
		return eid;
	}

	public String getLname() {
		return lname;
	}
}
