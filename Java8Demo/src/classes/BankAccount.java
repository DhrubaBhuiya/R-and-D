package classes;

import java.util.Scanner;

public class BankAccount {
	private int accountId;
	private String accountHolderName;
	private String ifscCode;
	private double balance;
	private static final double dailyLimit = 2500.00;

	public BankAccount(int accountId, String accountHolderName,
			String ifscCode, double balance) {
		this.accountId = accountId;
		this.setAccountHolderName(accountHolderName);
		this.ifscCode = ifscCode;
		this.balance = balance;
	}

	public int getAccountId() {
		return accountId;
	}

	public String getAccountHolderName() {
		return accountHolderName;
	}

	public void setAccountHolderName(String accountHolderName) {
		this.accountHolderName = accountHolderName;
	}

	public String getIfscCode() {
		return ifscCode;
	}

	public double getBalance() {
		return balance;
	}

	public static double getDailylimit() {
		return dailyLimit;
	}

	// withdrawl money and set daily withdrawl limit
	public void withdrawMoney() {

		Scanner withdraw = new Scanner(System.in);
		System.out.println("please enter the withdraw amount");
		double withdrawAmount = withdraw.nextDouble();
		withdraw.close();

		if (balance < withdrawAmount)
			System.out
					.println("you have less amount : your current balance is="
							+ balance);

		else if (withdrawAmount > dailyLimit)
			System.out
					.println("you have entered amount exceed than daily limit : your dailyLimit="
							+ dailyLimit);

		else
			balance -= withdrawAmount;
		System.out.println("your current balance is=" + balance);

	}

	public void depositMoney() {

		Scanner deposit = new Scanner(System.in);
		System.out.println("please enter the withdraw amount");
		double depositAmount = deposit.nextDouble();
		deposit.close();
		balance += depositAmount;
		System.out.println("your current balance is=" + balance);

	}

	@Override
	public String toString() {
		return "BankAccount [accountId=" + accountId + ", accountHolderName="
				+ accountHolderName + ", ifscCode=" + ifscCode + ", balance="
				+ balance + "]";
	}

	public static void main(String[] args) {
		BankAccount account = new BankAccount(1234455533, "samy", "ICIC09",
				1000);
		System.out.println("you have created account : " + account);

		account.withdrawMoney();

	}

}
