package com.example.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.example.model.Bank;
import com.example.model.Customer;
import com.example.service.BankServiceInterface;
import com.example.service.CustomerServiceInterface;

@RestController
public class Controller1 {

	@Autowired
	private BankServiceInterface bank1;
	

	@RequestMapping(value="/viewCustList/{bId}",method=RequestMethod.GET)
	public ResponseEntity<List<Customer>> listBank(@PathVariable Integer bId)
	{
		
		Bank baa=bank1.getBankObj(bId);
		
		return new ResponseEntity<List<Customer>>(baa.getListCustomer(),HttpStatus.OK);
		
		
	}
	
	
	
	@RequestMapping(value="/addBank",method=RequestMethod.POST)
	public ResponseEntity<Bank> addBank1(@RequestBody Bank ban)
	{
		
		Bank ban2=bank1.createBank(ban);
		
		return new ResponseEntity<Bank>(ban2, HttpStatus.CREATED);
		
		
	}
	
	
	@RequestMapping(value="/viewBank/{big}",method=RequestMethod.GET)
	public ResponseEntity<Bank> viewBank1(@PathVariable Integer big)
	{
		Optional<Bank> ban3=bank1.getBankDetails(big);
		Bank ban4=ban3.get();
		return new ResponseEntity<Bank>(ban4, HttpStatus.OK);
	}
	
	
}
