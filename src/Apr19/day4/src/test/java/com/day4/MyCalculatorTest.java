package com.day4;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

import org.junit.Test;

import training.MyCalculator;
/*
 * 
 * @author Abhishek
 * 
 */
public class MyCalculatorTest {
	/*
	 * Writing test case for MyCalculatorTest program
	 * 
	 */
	final MyCalculator my1=new MyCalculator();
	//Test case 1
	@Test
	public void calculatorTest1() throws Exception
	{

		
		assertEquals("test case", 243, my1.power1(3,5));


	}

	//Test case 2
	@Test
	public void calculatorTest2() throws Exception
	{

		
		assertNotEquals("test case", 143, my1.power1(3,6));


	}

	//Test case 3
	@Test(expected=Exception.class)
	public void calculatorTest3() throws Exception
	{

		
		assertNotEquals("test case", 1, my1.power1(-1,6));


	}
	
	//Test case 4
	@Test
	public void calculatorTest4() throws Exception
	{

		
		assertNotEquals("test case", 11, my1.power1(11,1));


	}



}
