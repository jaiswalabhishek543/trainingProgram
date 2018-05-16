package com.example.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.example.exception.MyException;
import com.example.model.Bank;
import com.example.model.Customer;
import com.example.repository.BankInterface;
import com.example.repository.CustomerDaoInterface;

@Service
public class CustomerServiceImpl implements CustomerServiceInterface {

	
	@Autowired
	private CustomerDaoInterface cust;
	@Autowired
	private BankInterface bankk;
	
	
	
	
	@Override
	public Customer createCustomer(Customer cust1) throws MyException {
		
		Integer aab= cust1.getBankId();
		
		Optional<Bank> liss=bankk.findById(aab);
		if(!liss.isPresent())
		{
			throw new MyException(" Bank id is not present ");
		}
		else
		{
			Customer cust2=cust.save(cust1);
			return cust2;
		}
	}

	@Override
	public Optional<Customer> getCustomerDetails(Integer id1) throws MyException {
		
		
		Optional<Customer> lis1=cust.findById(id1);
		if(lis1.isPresent())
		{
			Customer cusot=lis1.get();
		}
		else 
		{
			throw new MyException(" Id is not present ");
		}
		
		return lis1;
	}

	
	
	
	
}
