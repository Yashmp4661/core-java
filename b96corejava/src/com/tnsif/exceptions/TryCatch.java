package com.tnsif.exceptions;

public class TryCatch {
	public static void divide() {//called or caller method
		int a=6,b=0,c;
		try{
			 c=a/b;
			 
		}
		catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("Exception caught"+e.getMessage());
		}
		catch(ArithmeticException e){
			System.out.println("Exception caught"+e.getMessage());
			
			
		}
		catch(Exception e) {
			System.out.println("Exception caught"+e.getMessage());
			
		}
		
		
	}
	
	}

