package com.tnsif.abstractclass;

public class Abhishek extends TaxPayer{

	public Abhishek(double salary) {
		super(salary);
		// TODO Auto-generated constructor stub
	}

	@Override
	public double calTax() {
		// TODO Auto-generated method stub
		if(salary>=50000) {
		return salary*0.5;
		}
		else
			return salary*0.2;
	}
	

}
