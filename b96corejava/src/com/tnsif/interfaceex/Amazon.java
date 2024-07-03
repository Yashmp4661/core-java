//program to demonstrate interface
package com.tnsif.interfaceex;

public interface Amazon {

	void welcome();
	void thankyou();//abstract method
	
	default void servicecharge() {
		int amt=100;
		System.out.println("The service charge is: "+amt);		
	}
	static void aboutus() {
		System.out.println("Its a e commerce website");
	}

}
