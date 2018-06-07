package com.example.service;

import org.springframework.stereotype.Component;

import com.example.model.Employee;

@Component
public class Receiver {


	public void receiveMessage(Employee message) {

		System.out.println("Received <-------------" + message + ">");
		
	}

	

}
