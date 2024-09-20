package com.tnsif.exceptions;

public class Exeexm {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			int d=0;
			try {
				int a=42/d;
				System.out.println("mp");
				
			}
			catch(ArithmeticException e){
				System.out.println("Will not be printed"+e.getLocalizedMessage());
				
			}
			
		

	}

}
