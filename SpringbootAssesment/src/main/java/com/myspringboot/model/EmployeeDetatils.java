package com.myspringboot.model;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;



  
@Entity
@Table(name="Employee")
public class EmployeeDetatils {
    @Id
    @Column(name="empId",unique=true,nullable=false)
    @GeneratedValue
	private int empId;
    @Column(nullable=false)
	private String name;
    @Column(unique=true,nullable=false)
	private int jobId;
    @Column(unique=true,nullable=false)
	private String email;
    @Column(unique=true,nullable=false)
	private String phoneNo;
    @Column(nullable=false)
	private int salary;
	public int getEmpId() {
		return empId;
	}
	public void setEmpId(int empId) {
		this.empId = empId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getJobId() {
		return jobId;
	}
	public void setJobId(int jobId) {
		this.jobId = jobId;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPhoneNo() {
		return phoneNo;
	}
	public void setPhoneNo(String phoneNo) {
		this.phoneNo = phoneNo;
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	
	
	
	
	
	
	
}
