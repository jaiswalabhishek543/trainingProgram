package com.example.service;

import java.math.BigDecimal;

import com.example.exception.MyException;
import com.example.model.Account;

public interface AccountServiceInterface {

	
	public Account createAccount(Account acc) throws MyException;
	public Account depositMoney(BigDecimal amunt2,Integer acId);
	public Account withdrawMoney(BigDecimal amunt2,Integer acId);
	public Account getAccountDetails(Integer id7) throws MyException;
	
	
}
