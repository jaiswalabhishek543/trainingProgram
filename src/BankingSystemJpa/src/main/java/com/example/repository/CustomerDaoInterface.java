package com.example.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.example.model.Customer;

public interface CustomerDaoInterface extends JpaRepository<Customer, Integer> {
	
	@Query(value = "select * from customer where customer_id= ?1" , nativeQuery=true)
	Customer findOneCustomer( Integer id);
	
	
	@Query(value="select * from Customer where customer_id= ?1",nativeQuery=true)
    public Optional<Customer> findById(Integer id);
}
