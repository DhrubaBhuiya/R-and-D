package com.capgemini.bank;

public class CurrentAccount2 extends CurrentAccount implements Insurance {

	@Override
	public String getInsuranceName() {
		return "CurrentInsurance";
	}

	@Override
	public double getInsuranceAmount() {
		return 500000;
	}
}
