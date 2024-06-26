package com.yashwanth.utilities;
import com.yashwanth.employees.*;
public class Emputilities {
	//creating a fuction or method which going to increase the salary of instance of manager or developer
	public static void increaseSalary(Employee employee, double percentage) {
         double currentSalary = employee.getSalary();
        double newSalary = currentSalary + (currentSalary * percentage / 100);
        employee.setSalary(newSalary);
        
    }
	//function for printing the employ details
	 public static void printEmployeeDetails(Employee employee) {
	        System.out.println("Employee ID: " + employee.getEmpid());
	        System.out.println("Name: " + employee.getName());
	        System.out.println("Salary: " + employee.getSalary());
	        if (employee instanceof Manager) {
	            Manager manager = (Manager) employee;
	            System.out.println("Department: " + manager.getDept());
	            System.out.println("Experience: "+manager.getExperience());
	        }
	        else if (employee instanceof Developer) {
	            Developer developer = (Developer) employee;
	            System.out.println("Programming Language: " + developer.getLanguage());
	        }
	 }
}
