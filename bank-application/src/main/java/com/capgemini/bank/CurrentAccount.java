package com.capgemini.bank;

public class CurrentAccount extends BankAccount{

	public CurrentAccount(){
		super();
		// TODO Auto-generated constructor stub
	}

	public CurrentAccount(String accountHolderName, double accountBalance) {
		super(accountHolderName, accountBalance);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void withdraw(double amount) {
		System.out.println("Savings account withdraw");
	}
}
