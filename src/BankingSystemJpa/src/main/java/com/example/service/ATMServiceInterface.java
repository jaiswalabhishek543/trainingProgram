package com.example.service;

import java.math.BigDecimal;

import com.example.exception.MyException;
import com.example.model.ATM;

public interface ATMServiceInterface {
	
	
	
	public ATM createATM(ATM at1) throws MyException;
	public ATM addMoneyFromBank(BigDecimal addit,Integer aId) throws MyException;
	public ATM withdrawMoney(BigDecimal deduct);

}
