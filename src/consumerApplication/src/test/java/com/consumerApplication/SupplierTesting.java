package com.consumerApplication;

import static org.junit.Assert.assertEquals;

import org.junit.BeforeClass;
import org.junit.Test;

import service.SupplierServiceImpl;

public class SupplierTesting {

	@BeforeClass
	public void before()
	{
		SupplierServiceImpl sup=new SupplierServiceImpl();
		
		String str1=sup.addSupplier("s7", "S1 Traders", "Lucknow", 100,"O12", 50000);
		String str2=sup.addSupplier("s15", "S2 Traders", "Ayodhya", 10,"O15", 40000);
		String str3=sup.addSupplier("s20", "S3 Traders", "Lucknow", 200,"O14", 30000);
		
	}
	
	@Test
	public void test1()
	{
		SupplierServiceImpl sup=new SupplierServiceImpl();
		assertEquals("Supplier Updated", sup.addSupplier("s21", "S4 Traders", "Kanpur", 400, "O20", 60000));
	}
	
	@Test
	public void test2()
	{
		SupplierServiceImpl sup=new SupplierServiceImpl();
		assertEquals("Supplier removed", sup.removeSupplier("s20"));
	}
	
	@Test
	public void test3()
	{
		SupplierServiceImpl sup=new SupplierServiceImpl();
		assertEquals("Supplier Updated", sup.updateSupplier("s21"));
	}
	
	@Test
	public void test4()
	{
		SupplierServiceImpl sup=new SupplierServiceImpl();
		//assertEquals("Not done", sup.addSupplier("s21", "S4 Traders", "Kanpur", 400, "O20", 60000));
	}
	
	@Test
	public void test5()
	{
		SupplierServiceImpl sup=new SupplierServiceImpl();
		//assertEquals("Not done", sup.removeSupplier("s20"));
	}
	
	@Test
	public void test6()
	{
		SupplierServiceImpl sup=new SupplierServiceImpl();
		//assertEquals(expected, actual);
	}
	
	
	
	
}
