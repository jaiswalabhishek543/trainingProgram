package com.example.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.example.exception.MyException;
import com.example.model.Audit;
import com.example.service.CustomerServiceInterface;

@RestController
public class ControllerForEureka {

	
	@Autowired
	private RestTemplate restTemplate;
	
	@Autowired
	private CustomerServiceInterface customerServiceInterface; 
	
	@RequestMapping(value="/updatingPincode/{customerId}/{userId}/{pinCode}",method=RequestMethod.GET)
	public ResponseEntity<?> updatingPinNo(@PathVariable Integer customerId,@PathVariable String userId,@PathVariable String pinCode)
	{
		try{
		/*Audit auObj=*/ return customerServiceInterface.updatePin(customerId, userId, pinCode);
		//String uri="http://AuditLogMicroServ/addAudit";
		//return restTemplate.postForEntity(uri,auObj, Audit.class);
		
		
		}
		catch(MyException e)
		{
			return new ResponseEntity<String>(e.toString(),HttpStatus.BAD_REQUEST);
		}
	}
	
	
	
}
