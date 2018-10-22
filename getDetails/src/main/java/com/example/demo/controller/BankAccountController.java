package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.BankAccount;
import com.example.demo.service.BankAccountService;

@RestController
public class BankAccountController {
	
	@Autowired
	BankAccountService bankAccountService;
	
	@GetMapping(value="/get/")
	public BankAccount get(@RequestParam("accNo") String accNo) {
		return bankAccountService.getBankAccount(accNo);
	}
	
	@GetMapping(value="/get/balance/")
	public double getBalance(@RequestParam("accNo") String accNo) {
		return bankAccountService.getBankBalance(accNo);
	}
	
	@GetMapping(value="/get")
	public List<BankAccount> getAll() {
		return bankAccountService.getAll();
	}
}
