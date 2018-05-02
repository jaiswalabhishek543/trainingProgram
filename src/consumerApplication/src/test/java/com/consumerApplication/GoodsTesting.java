package com.consumerApplication;

import static org.junit.Assert.assertEquals;

import org.junit.BeforeClass;
import org.junit.Test;

import service.GoodsServiceImpl;

public class GoodsTesting {
	
	@BeforeClass
	public void before()
	{
		GoodsServiceImpl gud=new GoodsServiceImpl();
		String str1=gud.addGoods("g5", "Detergent", 20, 100);
		String str2=gud.addGoods("g11", "Egg", 10, 1000);
		String str3=gud.addGoods("g12", "Bread", 15, 40);
	}
	
	
	
	@Test
	public void test1()
	{
		GoodsServiceImpl gud=new GoodsServiceImpl();
		
		assertEquals("Goods added", gud.addGoods("g14", "pin", 10,2));
		
	}
	
	
	@Test
	public void test2()
	{
		GoodsServiceImpl gud=new GoodsServiceImpl();
		assertEquals("Removed", gud.removeGoods("g5"));
		
	}
	
	
	@Test
	public void test3()
	{
		GoodsServiceImpl gud=new GoodsServiceImpl();
		assertEquals("Updated goods", gud.updateGoods("g14"));
		
	}
	
	
	@Test
	public void test4()
	{
		
		GoodsServiceImpl gud=new GoodsServiceImpl();
		//assertEquals("Not done", gud.addGoods("g14", "pin", 10,2));
	}
	
	@Test
	public void test5()
	{
		GoodsServiceImpl gud=new GoodsServiceImpl();
		//assertEquals("Not done", gud.removeGoods("g01"));
		
	}
	
	@Test
	public void test6()
	{
		
		GoodsServiceImpl gud=new GoodsServiceImpl();
		//assertEquals("Not done",gud.updateGoods("g140"));
	}
	
	
	
	
	
	

}
