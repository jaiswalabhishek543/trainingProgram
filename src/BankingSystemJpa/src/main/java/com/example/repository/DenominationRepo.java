package com.example.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.example.model.Denomination;

public interface DenominationRepo extends JpaRepository<Denomination, Integer> {

	
	
	@Query(value="select * Denomination from  where denomination= ?1",nativeQuery=true)
    public Optional<Denomination> findById(Integer id);
}
