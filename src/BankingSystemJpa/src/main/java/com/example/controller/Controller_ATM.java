package com.example.controller;

import java.math.BigDecimal;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.example.exception.MyException;
import com.example.model.ATM;
import com.example.service.ATMServiceInterface;

@RestController
public class Controller_ATM {

	@Autowired
	private ATMServiceInterface atm1;
	
	@RequestMapping(value="/addATM",method=RequestMethod.POST)
	public ResponseEntity<String> createATM(@RequestBody ATM atm2) throws MyException
	{
		try{
			ATM a11=atm1.createATM(atm2);
			return new ResponseEntity<String>(" ATM with id "+a11.getATMId()+" created",HttpStatus.CREATED);
			

		}
		catch(MyException e)
		{
			return new ResponseEntity<String>(e.toString(),HttpStatus.OK);
		}
		
		
	}
	
	@RequestMapping(value="/addMoneyFromBank/{bb5}/{int5}",method=RequestMethod.GET)
	public ResponseEntity<String> addMoneyBank(@PathVariable BigDecimal bb5,@PathVariable Integer int5) throws MyException
	{
		
		try{
			ATM att4=atm1.addMoneyFromBank(bb5, int5);
			return new ResponseEntity<String>(att4.toString(),HttpStatus.OK);
		}
		catch(MyException e)
		{
		return new ResponseEntity<String>(e.toString(),HttpStatus.BAD_REQUEST);
			
		}
		
		
	}
	
}
