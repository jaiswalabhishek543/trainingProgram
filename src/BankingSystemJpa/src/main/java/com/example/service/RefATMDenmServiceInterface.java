package com.example.service;

import java.math.BigDecimal;

import com.example.exception.MyException;

public interface RefATMDenmServiceInterface {

	/*
	 * Called during the creation of bank to initialize the table
	 */
	void iniRefTable(Integer atmID1) throws MyException;

	/*
	 * Adding money from bank and initializing table
	 */
	void iniDenom(Integer currency, Integer noOfCurrency, Integer atmId9);

	/*
	 * Taking Money from ATM
	 */
	void withdrawFromAtm(BigDecimal amount,Integer atmId11) throws MyException;
	/*
	 * Adding new currency and updating table
	 */
	void addCurrency(Integer atmId5,Integer denom4);
}
