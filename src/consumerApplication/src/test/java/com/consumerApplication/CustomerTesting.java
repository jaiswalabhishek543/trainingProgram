package com.consumerApplication;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.jupiter.api.Test;

import dao.CustomerDaoImpl;
import model.Customer;
import service.CustomerServiceImpl;

public class CustomerTesting {
	
	@BeforeClass 
	public void befre()
	{
		
		
		CustomerServiceImpl custSer=new CustomerServiceImpl();
		String str1=custSer.addCustomer("c7", "C", "Delhi", "Cash");
		String str2=custSer.addCustomer("c8", "D", "China", "Card");
		String str3=custSer.addCustomer("c9", "E", "Pune", "Card");
		
	}
	
	
	@Test
	public void test1()
	{
		CustomerServiceImpl custSer=new CustomerServiceImpl();
	
		assertEquals("Customer added",custSer.addCustomer("c5", "Chotu", "Begal", "Cash"));
		
	}
	
	
	@Test
	public void test2()
	{
		CustomerServiceImpl custSer=new CustomerServiceImpl();
		assertEquals("Customer removed",custSer.removeCustomer("c7"));
		
	}
	
	@Test
	public void test3()
	{
		CustomerServiceImpl custSer=new CustomerServiceImpl();
		assertEquals("Customer updated",custSer.updateCustomer("c5"));
	}
	
	@Test
	public void test4()
	{
		CustomerServiceImpl custSer=new CustomerServiceImpl();
		//assertEquals("Not done",custSer.updateCustomer("c100"));
		
	}
	
	@Test
	public void test5()
	{
		CustomerServiceImpl custSer=new CustomerServiceImpl();
		//assertEquals("Not done",custSer.addCustomer("c5", "A", "Japan", "Card"));
		
	}
	
	@Test
	public void test6()
	{
		CustomerServiceImpl custSer=new CustomerServiceImpl();
		//assertEquals("Not done",custSer.removeCustomer("c100"));
		
	}
	
	
	
	
	
	
	

}
