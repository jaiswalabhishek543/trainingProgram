package com.example.service;

import java.util.List;
import java.util.Optional;

import com.example.model.Supplier;

public interface SupplierServiceInterface {
	
	
	
	public Supplier addSupplier(Supplier obj);

	public List<Supplier> viewAllSupplier();
	
	public Optional<Supplier> delete(Integer id1);

	public Supplier update(Integer id2);

}
