package com.tnsif.abstractclass;

public class Hit extends TaxPayer{

	public Hit(double salary) {
		super(salary);
		// TODO Auto-generated constructor stub
	}

	@Override
	public double calTax() {
		// TODO Auto-generated method stub
		return salary*0.15;
	}

}
