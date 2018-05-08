package com.example.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.model.Customer;
import com.example.service.RetailerServiceInterface;

@RestController
public class Controller1 {

	@Autowired 
	private RetailerServiceInterface retailer;
	
	@RequestMapping(value="/viewcustomer", method= RequestMethod.GET)
	public List<Customer> cust()
	{
		List<Customer> cust2=new ArrayList<Customer>();
		cust2=retailer.viewCustomer();
		return cust2;
		
	}
	
	
	
	
	
}
