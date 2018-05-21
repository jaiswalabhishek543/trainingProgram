package com.example.service;

import java.math.BigDecimal;

import com.example.exception.MyException;

public interface DenominationServiceInterface {
	/*
	 * Initializing denomination table at the time of deposit
	 */
	void denom(BigDecimal num1, Integer bId) throws MyException;

	/*
	 * Initializing denomination table at the time of withdrawl
	 */
	void denom2(BigDecimal num1, Integer bId) throws MyException;

	/*
	 * Called at time of bank creation to initialize table
	 */
	void createBankDenm(Integer banId);
}
