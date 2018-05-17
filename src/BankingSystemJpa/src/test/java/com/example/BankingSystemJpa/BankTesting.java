package com.example.bankingSystemJpa;

import static org.junit.Assert.assertEquals;

import java.math.BigDecimal;

import org.junit.After;
import org.junit.Test;
import org.springframework.web.client.RestTemplate;

import com.example.model.Bank;
import com.example.model.Customer;

public class BankTesting {


	@Test
	public void test1() {
	RestTemplate restTemplate=new RestTemplate();
		final BigDecimal big=new BigDecimal(0);
		final Bank bank1=new Bank();
		bank1.setBankId(1);
		bank1.setAmount(big);
		String uri="http://localhost:8080/addBank";
		final Bank ban=restTemplate.postForObject(uri, bank1, Bank.class);
		assertEquals(big.intValue(), ban.getAmount().intValue());
	}
	
	
	
	@Test
	public void test2()
	{
		RestTemplate restTemplate=new RestTemplate();
		Customer cust=new Customer();
		cust.setBankId(1);
		cust.setName("Abhi");
		cust.setPin("12239");
		String uri="http://localhost:8080/addCust";
		Customer cust2=restTemplate.patchForObject(uri, cust, Customer.class);
		assertEquals("Abhi", cust2.getName());
	
	}
	@After
	public void after1()
	{
		
		
	}

}
