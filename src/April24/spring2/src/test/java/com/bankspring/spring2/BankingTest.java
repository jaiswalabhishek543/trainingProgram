package com.bankspring.spring2;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.Test;

import model.Address;
import model.Contact;
import model.Statement;


public class BankingTest {

	//Initializing the object of address class
	Address adr=new Address("str","48C","123456","del");
	Statement sobj=new Statement("Hello");
	List<Statement> stateList1 = new ArrayList<>();


	//Matching the return value of initialized object of class Address
	@Test
	public void returnTypeTest1()
	{
		assertEquals("test 1",adr.getHouseNumber(),"48C");

	}

	//Matching the return value of initialized object of class Address
	@Test
	public void returnTypeTest2()
	{
		assertNotEquals("test message", adr.getCity(),"gzb");

	}

	//Matching the return value of initialized object of class Address
	@Test
	public void returnTypeTest3()
	{
		assertNotEquals("test message", adr.getStreet(),"48");

	}




	@Test
	public void test4()
	{
		stateList1.add(sobj);
		assertEquals("test message",false,stateList1.isEmpty());



	}
	
	
	
	
	
	
	
	
	
	
	
	
}
