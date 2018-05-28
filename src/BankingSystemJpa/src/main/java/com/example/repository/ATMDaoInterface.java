package com.example.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.example.model.ATM;

public interface ATMDaoInterface extends JpaRepository<ATM, Integer> {

	
	@Query(value="select * from ATM where atmid= ?1",nativeQuery=true)
    public Optional<ATM> findById(Integer id);
	
}
