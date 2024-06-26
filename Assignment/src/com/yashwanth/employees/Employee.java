package com.yashwanth.employees;
//creating class of employee with access modifier of private
public class Employee {
	private String name;
	private int empid;
	private double salary;
	void show() {
		System.out.println("Name: "+name+"\t Id: "+empid+"\t Salary:"+salary);
	}
	// getting getter and setter for attribute name,employeId,salary
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getEmpid() {
		return empid;
	}
	public void setEmpid(int empid) {
		this.empid = empid;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double newSalary) {
		this.salary = newSalary;
	}
	//tostring method
	@Override
	public String toString() {
		return "Employee [name=" + name + ", empid=" + empid + ", salary=" + salary + "]";
	}
	

}
