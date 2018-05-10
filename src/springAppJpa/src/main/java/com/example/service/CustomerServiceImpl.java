package com.example.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.example.exceptions.MyException;
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
	@Override
	public Customer del(Integer id2) throws MyException {
		// TODO Auto-generated method stub
		
		Customer cust16;
		Optional<Customer> cust5=cust.findById(id2);
		cust16=cust5.get();
		cust.deleteById(id2);
	
		
		return cust16;
	}

	
	

}
