package com.example.service;

import java.util.List;
import java.util.Optional;

import com.example.model.Customer;

public interface customerServiceInterface {
	
	
	// Methods to be implemented
		public Customer addCustomer(Customer obj);

		public List<Customer> viewAllCustomer();
		
		public Optional<Customer> delete(Integer id1);

		public Customer update(Integer id2);
}
