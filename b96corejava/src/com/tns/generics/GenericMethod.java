package com.tns.generics;

public class GenericMethod {
	public<T>void displayArrayEle(T[] elements){
		for(T ele:elements ) {
			System.out.println("elements is"+ele);
		}
	}
	public static void main(String[] args) { 
		
			GenericMethod obj=new GenericMethod();
			Integer[] intarry= {10,20,30};
			
			String[] strarr = {"hello","hi"};
			obj.displayArrayEle(intarry);
			obj.displayArrayEle(strarr);
			
		}
	}


