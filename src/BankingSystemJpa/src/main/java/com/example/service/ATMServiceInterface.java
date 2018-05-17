package com.example.service;

import java.math.BigDecimal;

import com.example.exception.MyException;
import com.example.model.ATM;

/*
 * @abhishek
 */
public interface ATMServiceInterface {

	ATM createATM(ATM at1) throws MyException;

	ATM addMoneyFromBank(BigDecimal addit, Integer aId) throws MyException;

}
