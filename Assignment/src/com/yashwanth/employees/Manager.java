package com.yashwanth.employees;
//creating a class of manager which includes of the attributes which used in employee class(extends)
public class Manager extends Employee {
private int experience;
private String dept;
//creating getter and setter for attribute departmen
public int getExperience() {
	return experience;
}
public void setExperience(int experience) {
	this.experience = experience;
}
public String getDept() {
	return dept;
}
public void setDept(String dept) {
	this.dept = dept;
}

}