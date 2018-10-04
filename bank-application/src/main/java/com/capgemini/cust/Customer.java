package com.capgemini.cust;

import com.capgemini.bank.BankAccount;
import com.capgemini.bank.CurrentAccount2;
import com.capgemini.bank.SavingsAccount;
import com.capgemini.bank.SavingsAccount2;

public class Customer {
	
	public static void main(String[]args){
		BankAccount acc = null;
		
		acc = new SavingsAccount();
		acc.withdraw(5000);
		
		SavingsAccount2 savingsAccount = new SavingsAccount2();
		System.out.println(savingsAccount.getInsuranceName());
		System.out.println(savingsAccount.getInsuranceAmount());
		
		CurrentAccount2 currentAccount = new CurrentAccount2();
		System.out.println(currentAccount.getInsuranceName());
		System.out.println(currentAccount.getInsuranceAmount());
	}
}
