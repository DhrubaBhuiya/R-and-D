package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.BankAccount;
import com.example.demo.repository.BankAccountRepository;

@Service
public class BankAccountService {
	
	@Autowired
	BankAccountRepository bankAccountRepository;

	public BankAccount withdraw(String accNo, double amt) {
		BankAccount acc = bankAccountRepository.findByAccNo(accNo);
		System.out.println();
		BankAccount acc1=null;
		if(acc!=null) {
			acc.setBalance(acc.getBalance()-amt);
			acc1 = bankAccountRepository.save(acc);
		}
		return acc1;
	}
	
}
