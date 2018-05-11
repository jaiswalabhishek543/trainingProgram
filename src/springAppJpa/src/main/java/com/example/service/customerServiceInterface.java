package com.example.service;

import java.util.HashMap;
import java.util.List;
import java.util.Optional;

import org.springframework.http.ResponseEntity;

import com.example.exceptions.MyException;
import com.example.model.Customer;

public interface CustomerServiceInterface {
	
	
	// Methods to be implemented
		public Customer addCustomer(Customer obj);

		public List<Customer> viewAllCustomer();
		
		public Optional<Customer> delete(Integer id1);

		public Customer update(Integer id2) throws MyException;
		
		public List<Customer> update2(List<Customer> lis2) throws MyException;
		
		public Customer del(Integer id2) throws MyException;
		
		public HashMap<Integer, String> del2(List<Integer> lisd);
}
