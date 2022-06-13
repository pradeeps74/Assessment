package com.vastpro.studentCrud;

public class Employee {
	private int id;

	 private String empId;

	private String empAge, empName, empDesignation;
	private String empPhoneNumber;
	private String empSalary;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getEmpAge() {
		return empAge;
	}

	public void setEmpAge(String empAge) {
		this.empAge = empAge;
	}

	public String getEmpId() {
		return empId;
	}

	public void setEmpId(String empId2) {
		this.empId = empId2;
	}

	public String getEmpName() {
		return empName;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}

	public String getEmpDesignation() {
		return empDesignation;
	}

	public void setEmpDesignation(String empDesignation) {
		this.empDesignation = empDesignation;
	}

	public String getEmpPhoneNumber() {
		return empPhoneNumber;
	}

	public void setEmpPhoneNumber(String phoneno) {
		this.empPhoneNumber = phoneno;
	}

	public String getEmpSalary() {
		return empSalary;
	}

	public void setEmpSalary(String salary) {
		this.empSalary = salary;
	}

}
