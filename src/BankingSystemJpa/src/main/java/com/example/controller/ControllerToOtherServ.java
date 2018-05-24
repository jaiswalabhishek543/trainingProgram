package com.example.controller;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.example.model.Audit;

@RestController
public class ControllerToOtherServ {

	RestTemplate rest=new RestTemplate();
	
	public void transferAuditDetails(Audit audi)
	{
		
		String url="http://localhost:8888/addAudit";
		rest.postForObject(url, audi, Audit.class);
		
		
		
		
	}
	
	
	
	
}
