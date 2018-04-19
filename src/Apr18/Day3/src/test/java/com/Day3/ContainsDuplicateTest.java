package com.Day3;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

import training.ContainsDuplicate;

public class ContainsDuplicateTest {
	@Test
	public void isContain()
	{
		
		ContainsDuplicate dup=new ContainsDuplicate(); 
		
		String[] arr2 = new String[] {"Apple", "Banana", "Orange", "Grapes"};
		String[] arr3 = new String[] {"Apple", "Banana", "Orange", "Grapes", "Orange"};
		Integer[] arr4 = new Integer[]{ 1,2,3,4,5,6,7,8,9,10 }; 
		Integer[] arr5 = new Integer[]{ 1,2,1,3,4,5,6,7,8,9,10 }; 

		 assertNotEquals("test message", true, dup.duplicateInString(arr2));
		 assertEquals("test message", true, dup.duplicateInString(arr3));
		 assertNotEquals("test message", true, dup.duplicateInInteger(arr4));
		 assertEquals("test message", true, dup.duplicateInInteger(arr5));

		
		
	}
	
	
	
	
	

}
