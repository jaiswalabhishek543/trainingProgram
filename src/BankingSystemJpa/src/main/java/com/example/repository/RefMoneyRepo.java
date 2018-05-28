package com.example.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.example.model.RefMoney;

public interface RefMoneyRepo extends JpaRepository<RefMoney, Integer> {

	
	@Query(value="select * RefMoney from  where denomination= ?1",nativeQuery=true)
    public Optional<RefMoney> findById(Integer id);
	
}
