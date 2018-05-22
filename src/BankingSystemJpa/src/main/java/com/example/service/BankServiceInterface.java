package com.example.service;

/*
 * @abhishek
 */
import java.util.Optional;

import com.example.exception.MyException;
import com.example.model.Bank;

public interface BankServiceInterface {
	/*
	 * Creating Bank first time
	 */
	Bank createBank(Bank ban1) throws MyException;

	/*
	 * Fetching details of bank
	 */
	Optional<Bank> getBankDetails(Integer id1) throws MyException;

	/*
	 * Saving bank obj
	 */
	void savinBankObj(Bank obj);

	// Bank getBankObj(Integer id0);

}
