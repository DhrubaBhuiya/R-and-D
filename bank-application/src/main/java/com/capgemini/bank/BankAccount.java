package com.capgemini.bank;

/**
 * This comment is documentation based comment
 * 
 * @author dbhuiya
 * @since 3/10/2018
 * @version 1.0.0
 *
 */

public abstract class BankAccount {

	int accountNo;
	String accountHolderName;
	double accountBalance;
	static int autoAccountNoGen;

	{
		accountNo = ++autoAccountNoGen;
	}

	public BankAccount() {
		accountHolderName = "Unknown";
		accountBalance = 0;
	}

	public BankAccount(String accountHolderName, double accountBalance) {
		super();
		this.accountHolderName = accountHolderName;
		this.accountBalance = accountBalance;
	}

	public int getAccountNo() {
		return accountNo;
	}

	public String getAccountHolderName() {
		return accountHolderName;
	}

	public void setAccountHolderName(String accountHolderName) {
		this.accountHolderName = accountHolderName;
	}

	public double getAccountBalance() {
		return accountBalance;
	}

	public abstract void withdraw(double amount);

	public void deposit(double amount) {
		accountBalance += amount;
	}

	@Override
	public String toString() {
		return "BankAccount [accountNo=" + accountNo + ", accountHolderName="
				+ accountHolderName + ", accountBalance=" + accountBalance
				+ "]";
	}

}
