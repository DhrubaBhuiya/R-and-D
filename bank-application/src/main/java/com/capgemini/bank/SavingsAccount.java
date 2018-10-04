package com.capgemini.bank;

/**
 * @author dbhuiya
 *
 */
public class SavingsAccount extends BankAccount{

	public SavingsAccount() {
		super();
	}

	public SavingsAccount(String accountHolderName, double accountBalance) {
		super(accountHolderName, accountBalance);
	}

	@Override
	public void withdraw(double amount) {
		System.out.println("Savings account withdraw");
	}
	
	public void isSalaryAccount(){
		System.out.println("Salary Account");
	}
}
