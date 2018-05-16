package com.example.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.model.Account;

public interface AccountDaoInterface extends JpaRepository<Account, Integer> {

}
