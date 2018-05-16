package com.example.service;

import java.math.BigDecimal;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;

import com.example.exception.MyException;
import com.example.model.Account;
import com.example.repository.AccountDaoInterface;
import com.example.repository.BankInterface;
import com.example.repository.CustomerDaoInterface;

public class AccountServiceImpl implements AccountServiceInterface {

	@Autowired
	private CustomerDaoInterface custom;
	@Autowired 
	private BankInterface bank1;
	@Autowired
	private AccountDaoInterface acc1;
	
	@Override
	public Account createAccount(Account acc) throws MyException {
		Integer cust11=acc.getCustomerId();
		Integer bank11=acc.getBankId();
		if(custom.findById(cust11).isPresent() && bank1.findById(bank11).isPresent() )
		{
			Account acc2=acc1.save(acc);
			return acc2;
		}
		else
		{
			throw new MyException(" Id is not right ");
		}
		
	}

	@Override
	public Account depositMoney(BigDecimal amunt2, Integer acId) {
		return null;
	}

	@Override
	public Account withdrawMoney(BigDecimal amunt2, Integer acId) {
		return null;
	}

	@Override
	public Account getAccountDetails(Integer id7) throws MyException {
		Optional<Account> acc4=acc1.findById(id7);
		if(acc4.isPresent())
		{
			Account acc5=acc4.get();
			return acc5;
		}
		else
		{
			throw new MyException(" Id not found ");
		}
	
	}

}
