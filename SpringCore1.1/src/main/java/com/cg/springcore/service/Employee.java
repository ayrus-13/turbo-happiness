package com.cg.springcore.service;




public class Employee {
	private String empName;
	private double empSalary;
	private int empAge;
	private int empId;
	private String empBu;
	

	

	

	public void setEmpName(String empName) {
		this.empName = empName;
	}
	public void getData()
	{
		System.out.println("Emp id is "+this.empId+" "+"Emp name "+this.empName+" "+"Emp salary is "+this.empSalary+" "+"Emp age is "+this.empAge+" "+"Emp BU is "+this.empBu);
		
		}

	
	public String getEmpName() {
		return empName;
	}
	public void setEmpSalary(double empSalary) {
		this.empSalary = empSalary;
	}
	public void setEmpAge(int empAge) {
		this.empAge = empAge;
	}
	public void setEmpId(int empId) {
		this.empId = empId;
	}
	public void setEmpBu(String empBu) {
		this.empBu = empBu;
	}
}


