package com.consumerApplication;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotEquals;

import org.junit.jupiter.api.Test;

import controller.Control;
/*
 * @abhi
 */
public class TestingApp {

	Control con = new Control();

	@Test
	public void test1() {
		final String str4 = new String("Customer added");
		assertNotEquals(str4, con.addCustomer("c40", "Chotu", "Begal", "Cash"));

	}

	@Test
	public void test2() {

		assertEquals("Customer removed", con.removeCustomer("c7"));

	}

	@Test
	public void test3() {
		assertEquals("Customer updated", con.updateCustomer("c5"));
	}

	@Test
	public void test4() {

		assertNotEquals("Goods added", con.addGoods("g14", "pin", 10, 2));

	}

	@Test
	public void test5() {

		assertEquals("Removed", con.removeGoods("g5"));

	}

	@Test
	public void test6() {

		assertEquals("Updated goods", con.updateGoods("g14"));

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

		assertNotEquals("Supplier Updated", con.addSupplier("s21", "S4 Traders", "Kanpur", 400, "O20", 60000));
	}

	@Test
	public void test11() {
		assertEquals("Supplier removed", con.removeSupplier("s20"));
	}

	@Test
	public void test12() {

		assertEquals("Supplier Updated", con.updateSupplier("s21"));
	}

	@Test
	public void test() {

		assertNotEquals("Retailer added", con.addRetailer("r1", "Rama", "Panji"));

	}
	
	
	@Test
	public void test15()
	{
		assertNotEquals("Retailer added", con.addRetailer("r9", "Radhe", "Ramnagar"));
	}
	

}
