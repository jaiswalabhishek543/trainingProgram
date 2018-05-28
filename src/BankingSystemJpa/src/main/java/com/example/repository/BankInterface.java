package com.example.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.example.model.Bank;

public interface BankInterface extends JpaRepository<Bank, Integer> {

	@Query(value="select * from Bank where bank_id= ?1",nativeQuery=true)
    public Optional<Bank> findById(Integer id);
	
}
