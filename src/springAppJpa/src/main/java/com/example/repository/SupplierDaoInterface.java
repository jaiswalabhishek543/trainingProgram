package com.example.repository;

import org.springframework.data.repository.CrudRepository;

import com.example.model.Supplier;

public interface SupplierDaoInterface extends CrudRepository<Supplier, Integer> {

}
