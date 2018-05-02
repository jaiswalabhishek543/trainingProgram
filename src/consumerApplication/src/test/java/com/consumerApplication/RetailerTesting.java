package com.consumerApplication;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.BeforeClass;
import org.junit.Test;

import service.RetailerServiceImpl;

public class RetailerTesting {

	@BeforeClass
	public void before()
	{
		RetailerServiceImpl ret=new RetailerServiceImpl();
		String str1=ret.addRetailer("r11", "Raj", "Delhi");
		String str2=ret.addRetailer("r12", "Raju", "Mumbai");
		
	}
	
	@Test
	public void test1()
	{
		RetailerServiceImpl ret=new RetailerServiceImpl();
		assertFalse(ret.viewCustomer().isEmpty());
		
	}
	
	@Test
	public void test2()
	{
		RetailerServiceImpl ret=new RetailerServiceImpl();
		assertFalse(ret.viewSupplier().isEmpty());
		
	}
	
	@Test
	public void test3()
	{
		RetailerServiceImpl ret=new RetailerServiceImpl();
		assertFalse(ret.viewGoods().isEmpty());
		
	}
	
	
}
