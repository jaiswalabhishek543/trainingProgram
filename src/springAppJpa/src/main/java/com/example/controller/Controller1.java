package com.example.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.example.model.Customer;
import com.example.service.customerServiceInterface;

@Controller
@RestController
public class Controller1 {

	@Autowired
	private customerServiceInterface custServ;
	
	
	Customer cust4=new Customer("Abhishek" ,"Delhi", "Cash");
	Customer cust5=new Customer("Abhi" ,"Del", "Card");
	Customer cust6=new Customer("Avinash" ,"Preet Vihar", "Card");
	Customer cust7=new Customer("Avi" ,"Nirman Vihar", "Card");
	
	@RequestMapping(value="/addcust",method=RequestMethod.POST)
	public Customer added() {
		
		custServ.addCustomer(cust7);
		return cust7;
		
	}
	
 
	@RequestMapping(value="/viewcust",method=RequestMethod.GET)
	public List<Customer> viewCustomer() {
		
		List<Customer> list1=custServ.viewAllCustomer();
		return list1;
		
	}

	
	@RequestMapping(value="/deletecust/{custId}",method=RequestMethod.GET)
	public Optional<Customer> delete(@PathVariable("custId") Integer custId)
	{
		return custServ.delete(custId);
		
	}
	
	
	@RequestMapping(value="/updatecust/{custI}",method=RequestMethod.GET)
	public Customer update(@PathVariable("custI") Integer custI)
	{
		return custServ.update(custI);
	}
	
	
	
	
}
