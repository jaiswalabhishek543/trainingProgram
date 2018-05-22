package com.example.service;

import java.math.BigDecimal;
/*
 * @abhishek
 */
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

import com.example.exception.MyException;
import com.example.model.Bank;
import com.example.repository.BankInterface;

@Service
public class BankServiceImpl implements BankServiceInterface {

	@Autowired
	private BankInterface bank1;

	@Autowired
	private DenominationServiceInterface denomS;

	@Override
	public Bank createBank(Bank ban1) throws MyException {

		if (ban1.getAmount().compareTo(BigDecimal.ZERO) == 0) {
			final Bank ban2 = bank1.save(ban1);

			denomS.createBankDenm(ban2.getBankId());

			return ban2;
		} else {
			throw new MyException("Amount must be initialized to zero at the time of creating bank");
		}

	}

	@Override
	public Optional<Bank> getBankDetails(Integer id1) throws MyException {

		if (bank1.findById(id1).isPresent()) {
			final Optional<Bank> ban3 = bank1.findById(id1);

			return ban3;
		} else {
			throw new MyException(" Id is not present");
		}

	}

	@Override
	public void savinBankObj(Bank obj) {

		
		Bank bankObj=bank1.save(obj);
		
	}

	/*@Override
	public Bank getBankObj(Integer id0) {
		final Optional<Bank> bak = bank1.findById(id0);
		final Bank bak1 = bak.get();
		return bak1;
	}*/

}
