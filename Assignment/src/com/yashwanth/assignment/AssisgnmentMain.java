package com.yashwanth.assignment;
import com.yashwanth.employees.*;
import com.yashwanth.utilities.*;
public class AssisgnmentMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Manager manager = new Manager();
		manager.setName("mp");
		manager.setEmpid(123);
		manager.setSalary(10000);
		manager.setDept("marketing");
		manager.setExperience(10);
		
		 // Creating a Developer instance
        Developer developer = new Developer();
        developer.setName("keerthi");
        developer.setEmpid(002);
        developer.setSalary(80000);
        developer.setLanguage("Java");
     // Printing employee details by passing manager or developer instance before increase of salary
       System.out.println("Before increase in salary:"); 
        Emputilities.printEmployeeDetails(manager);
        Emputilities.printEmployeeDetails(developer);
     // Using EmployeeUtilities methods or functions
        Emputilities.increaseSalary(manager, 20);// Increasing salary by 20%
        Emputilities.increaseSalary(developer, 25);// Increasing salary by 25%

        System.out.println("After increase in salary:");
        Emputilities.printEmployeeDetails(manager);
        Emputilities.printEmployeeDetails(developer);
        


	}

}
