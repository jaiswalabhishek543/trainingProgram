package com.example.service;

import java.math.BigDecimal;
import java.util.List;
import java.util.Optional;

import com.example.model.Bank;

public interface BankServiceInterface {
	
	
	public Bank createBank(Bank ban1);
	public Optional<Bank> getBankDetails(Integer id1);
	public Bank getBankObj(Integer id0);
	
}
