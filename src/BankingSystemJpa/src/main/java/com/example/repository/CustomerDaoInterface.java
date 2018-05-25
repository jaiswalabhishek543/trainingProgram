package com.example.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.example.model.Customer;

public interface CustomerDaoInterface extends JpaRepository<Customer, Integer>,CustomizedRepository {
	
	@Query(value = "select * from customer where customer_id= ?1" , nativeQuery=true)
	Customer findOneCustomer( Integer id);
	
}
