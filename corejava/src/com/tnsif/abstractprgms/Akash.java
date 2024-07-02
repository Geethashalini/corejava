package com.tnsif.abstractprgms;

public class Akash extends TaxPayer {

	public Akash(double salary) {
		super(salary);
	}

	@Override
	public double calTax() {
		// TODO Auto-generated method stub
		if(salary <= 50000) {
			return salary*0.10;
	}
		else
		return salary*0.50;

	}

}
