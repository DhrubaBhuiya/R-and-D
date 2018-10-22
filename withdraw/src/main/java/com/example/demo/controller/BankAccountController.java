package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.BankAccount;
import com.example.demo.service.BankAccountService;

@RestController
public class BankAccountController {
	
	@Autowired
	BankAccountService bankAccountService;
	
	@PostMapping(value="/withdraw/")
	public BankAccount withdraw(@RequestParam("accNo") String accNo, @RequestParam("amount") double amt) {
		return bankAccountService.withdraw(accNo,amt);
	}

}
