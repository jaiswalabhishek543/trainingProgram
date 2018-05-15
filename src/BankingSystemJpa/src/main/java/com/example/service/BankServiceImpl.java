package com.example.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.model.Bank;
import com.example.repository.BankInterface;

@Service
public class BankServiceImpl implements BankServiceInterface {

	@Autowired
	private BankInterface bank1;
	
	@Override
	public Bank createBank(Bank ban1) {
		Bank ban2=bank1.save(ban1);
		
		return ban2;
	}

	@Override
	public List<Bank> getBankDetails() {
		
		List<Bank> ban3=bank1.findAll();
		
		return ban3;
	}

}
