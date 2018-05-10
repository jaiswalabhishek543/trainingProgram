package com.example.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.model.Customer;
import com.example.repository.CustomerDaoInt;

@Service
public class CustomerServiceImpl implements CustomerServiceInterface {

	
	@Autowired
	private CustomerDaoInt cust;	
	@Override
	public Customer addCustomer(Customer obj) {
		// TODO Auto-generated method stub
		cust.save(obj);
		return obj;
	}
	@Override
	public List<Customer> viewAllCustomer() {
		// TODO Auto-generated method stub
		
		List<Customer> cust2=(List<Customer>) cust.findAll();
		return cust2;
	}
	@Override
	public Optional<Customer> delete(Integer id1) {
		// TODO Auto-generated method stub
		Optional<Customer> custo=cust.findById(id1);
		cust.deleteById(id1);
		
		return custo;
	}
	@Override
	public Customer update(Integer id2) {
		// TODO Auto-generated method stub
		Optional<Customer> cust1=cust.findById(id2);
		Customer cust2=cust1.get();
		cust2.setPaymentMode("Card");
		return cust2;
	}


}
