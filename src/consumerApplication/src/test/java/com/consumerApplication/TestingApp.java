package com.consumerApplication;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotEquals;

import org.junit.FixMethodOrder;
import org.junit.jupiter.api.Test;
import org.junit.runners.MethodSorters;

import controller.Control;

/*
 * @abhi
 */
@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class TestingApp {

	/*
	 * Creating object of Control class
	 */
	Control con = new Control();

	@Test
	public void test1() {
		final String str4 = new String("Customer added");
		assertNotEquals(str4, con.addCustomer("c40", "Chotu", "Begal", "Cash"));

	}

	@Test
	public void test2() {

		assertEquals("Test case","Customer removed", con.removeCustomer("c7"));

	}

	@Test
	public void test3() {
		assertEquals("Test case","Customer updated", con.updateCustomer("c5"));
	}

	@Test
	public void test4() {

		assertNotEquals("Goods added", con.addGoods("g14", "pin", 10, 2));

	}

	@Test
	public void test5() {

		assertEquals("Test Case","Removed", con.removeGoods("g5"));

	}

	@Test
	public void test6() {

		assertEquals("Test Case","Updated goods", con.updateGoods("g14"));

	}

	@Test
	public void test7() {

		assertFalse((con.viewCustomer()).isEmpty());

	}

	@Test
	public void test8() {

		assertFalse((con.viewSupplier()).isEmpty());

	}

	@Test
	public void test9() {

		assertFalse((con.viewGoods()).isEmpty());

	}

	@Test
	public void test10() {

		assertNotEquals("Test Case","Supplier Updated", con.addSupplier("s21", "S4 Traders", "Kanpur", 400, "O20", 60000));
	}

	@Test
	public void test11() {
		assertEquals("Test Case","Supplier removed", con.removeSupplier("s20"));
	}

	@Test
	public void test12() {

		assertEquals("Test Case","Supplier Updated", con.updateSupplier("s21"));
	}

	@Test
	public void test() {

		assertNotEquals("Test Case","Retailer added", con.addRetailer("r1", "Rama", "Panji"));

	}

	@Test
	public void test14() {
		assertNotEquals("Test Case","Retailer added", con.addRetailer("r9", "Radhe", "Ramnagar"));
	}

	@Test
	public void test15() {
		assertEquals("Test Case","Customer added", con.addCustomer("c19", "Vaibhav", "Delhi", "Card"));
	}

	@Test
	public void test16() {
		assertEquals("Test Case","Customer removed", con.removeCustomer("c19"));
	}
	
	@Test
	public void test17() {
		assertEquals("Test Case","Goods added", con.addGoods("g17", "Candy",40, 5));
	}

	@Test
	public void test18() {
		assertEquals("Test Case","Removed", con.removeGoods("g17"));
	}

	@Test
	public void test19()
	{
	   assertNotEquals("Test Case","Retailer added", con.addRetailer("r7", "Ray", "Bengal"));	
	}
	
}
