package com.example.service;

import java.math.BigDecimal;

import com.example.exception.MyException;
import com.example.model.ATM;

/*
 * @abhishek
 */
public interface ATMServiceInterface {

	/*
	 * Creating Atm
	 */
	ATM createATM(ATM at1) throws MyException;

	/*
	 * Calling this method to add money from bank
	 */
	ATM addMoneyFromBank(BigDecimal addit, Integer aId) throws MyException;

	/*
	 * Saving object of ATM
	 */
	void savingAtmObj(ATM obj2);
}
