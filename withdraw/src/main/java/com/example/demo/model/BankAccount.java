package com.example.demo.model;

import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection="BankAccount")
public class BankAccount {
	
	@Id
	private ObjectId _id;
	private String accNo;
	private String accHolderName;
	private double balance;
	
	public BankAccount() {
		super();
	}
	
	public void setAccNo(String accNo) {
		this.accNo = accNo;
	}

	public void setAccHolderName(String accHolderName) {
		this.accHolderName = accHolderName;
	}

	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}
	public String getAccNo() {
		return accNo;
	}
	public String getAccHolderName() {
		return accHolderName;
	}
	@Override
	public String toString() {
		return "BankAccount [accNo=" + accNo + ", accHolderName=" + accHolderName + ", balance=" + balance + "]";
	}
	
}
