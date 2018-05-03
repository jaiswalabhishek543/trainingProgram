package com.bankspring.consumerAppJavaConfig;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotEquals;

import org.junit.Test;

import controller.Control;

/*
 * @abhi
 */
public class TestingApp {

	// Creating object of Control class
	Control con = new Control();

	/*
	 * First 3 test cases based on Customer's methods
	 */
	@Test
	public void test1() {
		
		assertNotEquals("Customer added", con.addCustomer("c40", "Chotu", "Begal", "Cash"));

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
	public void test16() {
		assertEquals("Test case","Customer added", con.addCustomer("c19", "Vaibhav", "Delhi", "Card"));
	}

	@Test
	public void test17() {
		assertEquals("Test case","Customer removed", con.removeCustomer("c19"));
	}

	/*
	 * Test cases based on Goods's methods
	 */

	@Test
	public void test4() {

		assertNotEquals("Goods added", con.addGoods("g14", "pin", 10, 2));

	}

	@Test
	public void test5() {

		assertEquals("Test case","Removed", con.removeGoods("g5"));

	}

	@Test
	public void test6() {

		assertEquals("Test case","Updated goods", con.updateGoods("g14"));

	}

	@Test
	public void test18() {
		assertEquals("Test case","Goods added", con.addGoods("g17", "Candy", 40, 5));
	}

	@Test
	public void test19() {
		assertEquals("Test case","Removed", con.removeGoods("g17"));
	}

	/*
	 * Test cases based on retailer's methods
	 */
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
	public void test15() {
		assertNotEquals("Retailer added", con.addRetailer("r9", "Radhe", "Ramnagar"));
	}

	/*
	 * Test cases based on Supplier'S methods
	 */
	@Test
	public void test10() {

		assertNotEquals("Supplier Updated", con.addSupplier("s21", "S4 Traders", "Kanpur", 400, "O20", 60000));
	}

	@Test
	public void test11() {
		assertEquals("Test case","Supplier removed", con.removeSupplier("s20"));
	}

	@Test
	public void test12() {

		assertEquals("Test case","Supplier Updated", con.updateSupplier("s21"));
	}

}
