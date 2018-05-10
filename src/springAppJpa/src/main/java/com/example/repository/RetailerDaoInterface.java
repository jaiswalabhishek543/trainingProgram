package com.example.repository;

import org.springframework.data.repository.CrudRepository;

import com.example.model.Retailer;

public interface RetailerDaoInterface extends CrudRepository<Retailer, Integer> {

}
