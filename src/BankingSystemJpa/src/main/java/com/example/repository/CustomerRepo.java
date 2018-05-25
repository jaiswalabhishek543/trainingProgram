package com.example.repository;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import com.example.model.Customer;

public interface CustomerRepo extends CrudRepository<Customer, Integer>{
	
	@Query(value = "select * from customer where customer_id= ?1" , nativeQuery=true)
	Customer findOneCustomer( Integer id);

}
