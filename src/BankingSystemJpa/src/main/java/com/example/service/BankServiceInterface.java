package com.example.service;

/*
 * @abhishek
 */
import java.util.Optional;

import com.example.exception.MyException;
import com.example.model.Bank;

public interface BankServiceInterface {

	Bank createBank(Bank ban1) throws MyException;

	Optional<Bank> getBankDetails(Integer id1) throws MyException;

	//Bank getBankObj(Integer id0);

}
