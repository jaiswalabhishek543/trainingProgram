package com.example.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.example.model.Transaction;

public interface TransactionDaoInterface extends JpaRepository<Transaction, Integer> {

	@Query(value="select * Transaction from  where transaction_id= ?1",nativeQuery=true)
    public Optional<Transaction> findById(Integer id);
}
