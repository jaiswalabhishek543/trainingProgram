package com.example.service;

import java.sql.ResultSet;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.model.Customer;
import com.example.model.Goods;
import com.example.model.Supplier;
import com.example.repository.RetailerDaoImpl;
import com.example.repository.RetailerDaoInterface;

@Service
public class RetailerServiceImpl implements RetailerServiceInterface {

	@Autowired
	private RetailerDaoInterface retailer01;
	
	
	/*private RetailerDaoImpl retailer01;
	
	public void setRetailer01(final RetailerDaoImpl retailer01) {
		this.retailer01 = retailer01;
	}
*/

	
	
	@Override
	public List<Goods> viewGoods() {
		
		return retailer01.viewGoods();
	}

	@Override
	public List<Customer> viewCustomer() {

		return retailer01.viewCustomer();
	}

	@Override
	public List<Supplier> viewSupplier() {

		return retailer01.viewSupplier();
	}

	@Override
	public String addRetailer(final String rId,final String rName,final String rAddr) {
		
		return retailer01.addRetailer(rId, rName, rAddr);
	}

	
	


}
