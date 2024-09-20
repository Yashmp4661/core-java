package com.tnsif.exceptions;

public class NestedTry {
	public static void check() {
		String str="tns";
		int arr[]=null;
		int y=6;
		try {//outer
			int z=y/2;
			try {//inner
				System.out.println(arr[0]);
				System.out.println(str.charAt(y));
			}
			catch(StringIndexOutOfBoundsException e) {
				System.out.println("Exception caught"+e.getMessage());
				
			}
			catch(NullPointerException e) {
				System.out.println("Exception caught"+e.getMessage());
				System.exit(0);
			}
		}
		catch(ArithmeticException e) {
			System.out.println("Exception caught"+e.getMessage());
			System.exit(0);
		}
		finally {
			System.out.println("Executed");
		
		}
	}

}
