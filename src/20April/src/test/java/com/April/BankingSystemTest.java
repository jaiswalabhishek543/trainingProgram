package com.April;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.Test;

import bankingsystem.Account;
import bankingsystem.Address;
import bankingsystem.Contact;
import bankingsystem.SavingAccount;
import bankingsystem.Statement;

public class BankingSystemTest {

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
	public void bankTestContact()
	{


		//Matching the arguments of constructor
		Contact con=new Contact(1234,5678,"ab@gmail.com",adr);
		assertEquals("test message", true,Contact.addContact(con));
	}

	//Checking for Account class
	@Test
	public void test5()
	{
		stateList1.add(sobj);
		Account acc1=new SavingAccount(6000,7,stateList1,"ab");
		Integer b=7;

		assertEquals("test message",acc1.getInterestPeriod(),b);

	}

	//Checking list is empty or not after adding object in it
	@Test
	public void test6()
	{
		stateList1.add(sobj);
		assertEquals("test message",false,stateList1.isEmpty());



	}



}
