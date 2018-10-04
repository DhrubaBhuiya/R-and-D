package com.capgemini.bank;


public class SavingsAccount2 extends SavingsAccount implements Insurance{

	@Override
	public String getInsuranceName() {
		return "SavingsInsurance";
	}

	@Override
	public double getInsuranceAmount() {
		return 100000;
	}

}
