package com.example.service;

/*
 * @abhishek
 */
import java.math.BigDecimal;

import com.example.exception.MyException;
import com.example.model.Account;

public interface AccountServiceInterface {

	Account createAccount(Account acc) throws MyException;

	Account depositMoney(BigDecimal amunt2, Integer acId) throws MyException;

	Account withdrawMoney(BigDecimal amunt2, Integer acId, Integer flag, Integer atmId) throws MyException;

	Account getAccountDetails(Integer id7) throws MyException;

}
