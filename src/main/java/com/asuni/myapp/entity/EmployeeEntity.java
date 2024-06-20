package com.asuni.myapp.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import com.asuni.myapp.POJO.Employee;

@Entity
@Table(name = "employee")
public class EmployeeEntity {

	@Id
	@Column(name = "eid")
	private Integer eid;

	@Column(name = "fname")
	private String fname;

	@Column(name = "lname")
	private String lname;

	@Column(name = "email")
	private String email;

	public EmployeeEntity()
	{

	}

	public EmployeeEntity(Employee employee) {
		this.eid = employee.getEid();
		this.fname = employee.getFname();
		this.lname = employee.getLname();
		this.email = employee.getEmail();
	}



	public void setEid(Integer eid) {
		this.eid = eid;
	}

	public void setFname(String fname) {
		this.fname = fname;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public void setLname(String lname) {
		this.lname = lname;
	}

	public String getEmail() {
		return email;
	}

	public Integer getEid() {
		return eid;
	}

	public String getFname() {
		return fname;
	}

	public String getLname() {
		return lname;
	}
}
