package com.example.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.model.Customer;
import com.example.model.Goods;


@Service
public class RetailerServiceImpl implements RetailerServiceInterface {

	@Autowired
  private CustomerServiceInterface cus1;
	
	@Autowired
	private GoodsServiceInterface gud8;
	
	
	@Override
	public List<Customer> viewcus() {
		// TODO Auto-generated method stub
		
		
		return cus1.viewAllCustomer();
	}

	@Override
	public List<Goods> viewG() {
		// TODO Auto-generated method stub
		return gud8.viewGud();
	}

}
