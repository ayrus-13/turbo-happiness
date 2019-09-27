package com.cg.springcore.service;




public class Employee {
	private String empName;
	private double empSalary;
	private int empId;
	private SBU businessUnit;
	public Employee() {
		// TODO Auto-generated constructor stub
		System.out.println("Hooooo");
	}
	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	public double getEmpSalary() {
		return empSalary;
	}
	public void setEmpSalary(double empSalary) {
		this.empSalary = empSalary;
	}
	public int getEmpId() {
		return empId;
	}
	public void setEmpId(int empId) {
		this.empId = empId;
	}
	public SBU getBusinessUnit() {
		return businessUnit;
	}
	public void setBusinessUnit(SBU businessUnit) {
		this.businessUnit = businessUnit;
	}
	public void getSbuDetails() {
		System.out.println("Sbu Id: "+this.businessUnit.getSbuId()+" "+"Sbu Name: "+this.businessUnit.getSbuName()+" "+"Sbu Head: "+this.businessUnit.getSbuHead());
		System.out.println("Emp id: "+this.getEmpId()+" "+"EmpName: "+this.getEmpName()+" "+"EmpSalary: "+this.getEmpSalary());
	}
}
	

	

	

