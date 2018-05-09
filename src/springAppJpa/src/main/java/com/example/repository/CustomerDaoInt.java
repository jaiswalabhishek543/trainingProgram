package com.example.repository;

import org.springframework.data.repository.CrudRepository;

import com.example.model.Customer;

public interface CustomerDaoInt extends CrudRepository<Customer, Integer> {
	
	

}
