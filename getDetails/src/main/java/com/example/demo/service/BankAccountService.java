package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.BankAccount;
import com.example.demo.repository.BankAccountRepository;

@Service
public class BankAccountService {
	
	@Autowired
	BankAccountRepository bankAccountRepository;

	public BankAccount getBankAccount(String accNo) {
		return bankAccountRepository.findByAccNo(accNo);
	}

	public List<BankAccount> getAll() {
		return bankAccountRepository.findAll();
	}

	public double getBankBalance(String accNo) {
		return bankAccountRepository.findByAccNo(accNo).getBalance();
	}
	
}
