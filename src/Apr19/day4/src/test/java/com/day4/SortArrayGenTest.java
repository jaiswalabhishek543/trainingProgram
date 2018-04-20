package com.day4;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

import org.junit.Test;

import training.SortArrayGeneric;
/*
 * 
 * @author Abhishek
 * 
 */
public class SortArrayGenTest {
	/*
	 * Writing test case for SortArrayGeneric program
	 * 
	 */
	
	//Test case 1
	@Test
	public void testSort()
	{
		final SortArrayGeneric sag=new SortArrayGeneric();

		final String[] arr2 = new String[] {"Apple", "Banana", "Orange", "Grapes"};
		final Integer ab1=arr2.length;

		assertEquals("check length", ab1, sag.printArray(arr2));

	}
	//Test case 2
	@Test
	public void testSort1()
	{
		final SortArrayGeneric sag1=new SortArrayGeneric();


		final Integer[] arr4 = new Integer[]{ 1,2,3,4,5,6,7,8,9,10 }; 
		final Integer ab2=arr4.length;

		final Integer ab3=0;


		assertEquals("check length", ab2, sag1.printArray(arr4));

	}
	//Test case 3
	@Test
	public void testSort2()
	{
		final SortArrayGeneric sag=new SortArrayGeneric();


		final Integer[] arr4 = new Integer[]{ 1,2,3,4,5,6,7,8,9,10 }; 
		final Integer ab3=0;

		assertNotEquals("check length", ab3, sag.printArray(arr4));

	}




}
