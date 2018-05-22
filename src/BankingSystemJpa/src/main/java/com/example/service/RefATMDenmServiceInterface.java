package com.example.service;

import java.math.BigDecimal;

import com.example.exception.MyException;

public interface RefATMDenmServiceInterface {

	/*
	 * Called during the creation of bank to initialize the table
	 */
	void iniRefTable(Integer atmID1);

	/*
	 * Adding money from bank and initializing table
	 */
	void iniDenom(Integer currency, Integer noOfCurrency, Integer atmId9);

	/*
	 * Taking Money from ATM
	 */
	void withdrawFromAtm(BigDecimal amount,Integer atmId11) throws MyException;
}
