package com.example.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.model.ATM;

public interface ATMDaoInterface extends JpaRepository<ATM, Integer> {

}
