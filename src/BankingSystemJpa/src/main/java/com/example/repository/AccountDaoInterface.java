package com.example.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.example.model.Account;

public interface AccountDaoInterface extends JpaRepository<Account, Integer> {

	
	@Query(value="select * from Account where account_id= ?1",nativeQuery=true)
    public Optional<Account> findById(Integer id);
}
