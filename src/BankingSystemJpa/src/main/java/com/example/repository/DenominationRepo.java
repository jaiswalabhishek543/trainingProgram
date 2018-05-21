package com.example.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.model.Denomination;

public interface DenominationRepo extends JpaRepository<Denomination, Integer> {

}
