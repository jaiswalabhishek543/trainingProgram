package com.example.bankingSystemJpa;

import static org.junit.Assert.assertEquals;

import java.math.BigDecimal;

import org.junit.Test;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.HttpClientErrorException;
import org.springframework.web.client.RestTemplate;

import com.example.model.Account;
import com.example.model.Bank;
import com.example.model.Customer;

public class BankTesting {

	@Test
	public void test1() {
		RestTemplate restTemplate = new RestTemplate();
		final BigDecimal big = new BigDecimal(0);
		final Bank bank1 = new Bank();
		bank1.setAmount(big);
		String uri = "http://localhost:8080/addBank";
		final Bank ban = restTemplate.postForObject(uri, bank1, Bank.class);
		assertEquals(big.intValue(), ban.getAmount().intValue());
	}

	@Test(expected = HttpClientErrorException.class)
	public void test2() {
		RestTemplate restTemplate = new RestTemplate();
		Customer cust = new Customer();
		cust.setBankId(1);
		cust.setName("Abhi");
		cust.setPin("12239");
		String uri = "http://localhost:8080/addCust";
		restTemplate.postForObject(uri, cust, String.class);

	}

	@Test
	public void test3() {
		final RestTemplate restTemplate = new RestTemplate();
		final Bank bank2 = new Bank();
		final BigDecimal bigA = new BigDecimal(0);
		bank2.setAmount(bigA);
		final String uri = "http://localhost:8080/addBank";
		final Bank ban = restTemplate.postForObject(uri, bank2, Bank.class);

		final String uri1 = "http://localhost:8080/addCust";
		final Customer cust = new Customer();
		cust.setBankId(ban.getBankId());
		cust.setName("Abhishek Jaiswal");
		cust.setPin("201012");
		final Customer cust4 = restTemplate.postForObject(uri1, cust, Customer.class);

		final Account acc = new Account();
		final BigDecimal bigA1 = new BigDecimal(10000);
		acc.setBankId(ban.getBankId());
		acc.setAmount(bigA1);
		acc.setCustomerId(cust4.getCustomerId());
		final String uri2 = "http://localhost:8080/createAcc";
		final Account acc4 = restTemplate.postForObject(uri2, acc, Account.class);
		final Integer int2 = acc4.getAccountId();

		final String uri4 = "http://localhost:8080/depoMoney/2000/" + int2;
		final ResponseEntity<Account> acco = restTemplate.getForEntity(uri4, Account.class);
		final Account acc01 = acco.getBody();
		assertEquals(12000, acc01.getAmount().intValue());

	}

}
