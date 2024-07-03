//program to demonstrate abstract class
package com.tnsif.abstractclass;
//non concrete class
public abstract class TaxPayer {
	protected double salary;
	public abstract double calTax();//abstract method
	//non abstract method
	public void display() {
		System.out.println("The tax payed is"+calTax());
	}
	public TaxPayer(double salary) {
		super();
		this.salary = salary;
	}
	

}
