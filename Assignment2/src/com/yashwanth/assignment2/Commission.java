package com.yashwanth.assignment2;
import java.util.Scanner;

public class Commission {
   private String Name;
   private String address;
   private int phone;
   private	double sales;
   

public void details() {
	 Scanner obj=new Scanner(System.in);
	 System.out.println("Enter name: ");
	 this.Name = obj.nextLine();
	 System.out.println("Enter address: ");
	 this.address=obj.nextLine();
	 System.out.println("Enter number:  ");
	 this.phone=obj.nextInt();
	 System.out.println("Enter sales: ");
	 this.sales=obj.nextDouble();
	 System.out.println("Employee details: name: "+Name+ "address: " +address+ "Number: "+phone);
	 
 }
public void calccommission() {
	// TODO Auto-generated method stub
	double commission=0.0;
	if(sales>=100000) {
		commission=(sales*10/100);
	}
	else if(sales>=50000 && sales<100000) {
		commission=(sales*5/100);
	}
	else if(sales>=30000 && sales<50000) {
		commission=(sales*3/100);
		
	}
	else if(sales<30000) {
		commission=0;
	}
   
	   System.out.println("Commission: "+commission);
	
}

public void  calccommision() {
	
	  
}


	public static void main(String[] args) {
	Commission employee=new Commission();
	employee.details();
	employee.calccommission();
	}
	
}
