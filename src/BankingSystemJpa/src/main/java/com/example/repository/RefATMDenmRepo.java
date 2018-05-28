package com.example.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.example.model.RefATMDenm;

public interface RefATMDenmRepo extends JpaRepository<RefATMDenm, Integer> {

	
	@Query(value="select * RefATMDenm from  where denomination= ?1",nativeQuery=true)
    public Optional<RefATMDenm> findById(Integer id);
	
}
