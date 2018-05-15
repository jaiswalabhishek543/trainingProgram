package com.example.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.model.Bank;

public interface BankInterface extends JpaRepository<Bank, Integer> {

}
