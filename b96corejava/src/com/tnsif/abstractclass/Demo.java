package com.tnsif.abstractclass;
import java.util.Scanner;
public class Demo {

	public  static  void  main(String[] args) {
		// TODO Auto-generated method stub
		
		
		System.out.println("Enter akash salary");
		Scanner sc=new Scanner(System.in);
		double abhisalary=sc.nextDouble();
		TaxPayer ob = new Abhishek(abhisalary);
		//TaxPayer ob;// another method
		//ob=new Abhishek();
		//ob=new Hit();
		System.out.println("Enter akash salary");
		double hitsalary=sc.nextDouble();
		TaxPayer obj=new Hit(hitsalary);
		System.out.println("Tax for abhi");
		ob.display();
		System.out.println("Tax for Hit");
		obj.display();
	

	}

}
