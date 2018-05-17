package com.example.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.model.Transaction;

public interface TransactionDaoInterface extends JpaRepository<Transaction, Integer> {

}
