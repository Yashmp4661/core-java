package com.tnsif.exceptions;

public class UserDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		try {
			UsrDefined.validate(6);
		}
		catch(Age e) {
			System.out.println("caught"+e.getMessage());
		}
		

	}

}
