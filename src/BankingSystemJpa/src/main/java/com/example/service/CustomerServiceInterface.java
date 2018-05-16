package com.example.service;

import java.util.Optional;

import org.springframework.http.ResponseEntity;

import com.example.exception.MyException;
import com.example.model.Customer;

public interface CustomerServiceInterface {

	public Customer createCustomer(Customer cust1) throws MyException;
	public Optional<Customer> getCustomerDetails(Integer id1) throws MyException;
	
	
	
}
