package com.tnsif.staticprog;

public class Myclass {
	private int section;//instance variable
	static int srNo;//static variable
	static {
		System.out.println("-----Static Block-----");
		srNo=1000;
		
	}
	public Myclass() {
		super();
		System.out.println("----Default constructor----");
	}
	static void display() {
		System.out.println("-----Static Method-----");
		System.out.println("serial no. is:"+ ++srNo);
	}
	@Override
	public String toString() {
		return "Myclass [section=" + section + "]";
	}
	
	
	

}
