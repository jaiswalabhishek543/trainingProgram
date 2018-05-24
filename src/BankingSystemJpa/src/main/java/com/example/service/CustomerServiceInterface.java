package com.example.service;

import java.util.Optional;

import com.example.exception.MyException;
import com.example.model.Customer;

/*
 * @abhishek
 */
public interface CustomerServiceInterface {

	Customer createCustomer(Customer cust1) throws MyException;

	Optional<Customer> getCustomerDetails(Integer id1) throws MyException;
	
	Customer updatePin(Integer intId,String userId,String pincode) throws MyException;

}
