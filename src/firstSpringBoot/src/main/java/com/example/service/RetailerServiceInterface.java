package com.example.service;

import java.sql.ResultSet;
import java.util.List;

import com.example.model.Customer;
import com.example.model.Goods;
import com.example.model.Supplier;

/*
 * @abhi
 */
public interface RetailerServiceInterface {
	// Methods to be implemented
	public String addRetailer(String rId, String rName, String rAddr);

	public List<Goods> viewGoods();

	public List<Customer> viewCustomer();

	public List<Supplier> viewSupplier();

}
