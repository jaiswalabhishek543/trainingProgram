package com.example.service;

/*
 * @abhishek
 */
import java.util.Optional;

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
		final Bank ban2 = bank1.save(ban1);

		return ban2;
	}

	@Override
	public Optional<Bank> getBankDetails(Integer id1) {

		final Optional<Bank> ban3 = bank1.findById(id1);

		return ban3;
	}

	@Override
	public Bank getBankObj(Integer id0) {
		final Optional<Bank> bak = bank1.findById(id0);
		final Bank bak1 = bak.get();
		return bak1;
	}

}
