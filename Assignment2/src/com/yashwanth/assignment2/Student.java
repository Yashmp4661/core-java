package com.yashwanth.assignment2;
public class Student {
	int number;
	
	
	public Student() {
		
		super();
		System.out.println("Student object is created");
		
		
	}
public static void main(String[] args) {
	Student ob=new Student();
	 
	 System.out.println(ob);

		
	}
@Override
public String toString() {
	return "Student [number=" + number + "]";
}


	}
	
