package com.Day3;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

import org.junit.Test;

import training.Reverse;

public class ReverseTest {
	
	@Test
	public void testReverse()
	{
		Reverse rev1=new Reverse();
		assertEquals("i have two books ",rev1.isReverse("i evah owt skoob"));
		assertNotEquals("my name is abhi",rev1.isReverse("ihba si eman ym"));
	}
	

}
