package com.example.bankingSystemJpa;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.when;

import java.math.BigDecimal;
import java.util.Optional;

import org.hibernate.service.spi.InjectService;
import org.hibernate.validator.constraints.Currency;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

import com.example.exception.MyException;
import com.example.model.Account;
import com.example.model.Bank;
import com.example.model.Customer;
import com.example.repository.AccountDaoInterface;
import com.example.repository.BankInterface;
import com.example.repository.CustomerDaoInterface;
import com.example.service.AccountServiceImpl;
import com.example.service.BankServiceImpl;
import com.example.service.CustomerServiceImpl;
import com.example.service.DenominationServiceInterface;

@RunWith(MockitoJUnitRunner.class)
public class BankTestM {

	@Mock
	BankInterface bnkI;

	@InjectMocks
	BankServiceImpl bnkS;

	@Mock
	DenominationServiceInterface dsm;

	@Mock
	CustomerDaoInterface custRepo;

	@InjectMocks
	CustomerServiceImpl custServ;

	@Mock
	AccountDaoInterface accRepo;

	@InjectMocks
	AccountServiceImpl accServ;

	@Test
	public void test1() throws MyException {
		final Bank ban = new Bank(new BigDecimal(0));
		when(bnkI.save(Mockito.<Bank>any())).thenReturn(ban);
		final Bank resp = bnkS.createBank(ban);
		assertEquals(resp.getAmount(), new BigDecimal(0));

	}

	@Test
	public void test2() throws MyException {
		final Bank ban = new Bank(new BigDecimal(0));
		ban.setBankId(4);
		final Optional<Bank> op = Optional.of(ban);

		when(bnkI.findById(4)).thenReturn(op);
		final Optional<Bank> banL = bnkS.getBankDetails(ban.getBankId());
		assertEquals(op, banL);

	}

	@Test
	public void test3() throws MyException {

		final Customer cust = new Customer();
		cust.setCustomerId(2);
		cust.setBankId(1);
		cust.setName("Abhishek Jaiswal");
		cust.setPin("201011");
		final Bank ban = new Bank();
		ban.setAmount(BigDecimal.ZERO);
		ban.setBankId(1);

		final Optional<Bank> bbb = Optional.of(ban);

		when(bnkI.findById(1)).thenReturn(bbb);

		when(custRepo.save(Mockito.any())).thenReturn(cust);
		final Customer cust1 = custServ.createCustomer(cust);

		assertEquals(cust1.getBankId(), cust.getBankId());
	}

	@Test
	public void test4() throws MyException {
		final Customer cust = new Customer();
		cust.setCustomerId(2);
		cust.setBankId(1);
		cust.setName("Abhishek Jaiswal");
		cust.setPin("201011");
		Optional<Customer> cuss = Optional.of(cust);

		when(custRepo.findById(2)).thenReturn(cuss);
		Optional<Customer> cust2 = custServ.getCustomerDetails(2);
		assertEquals(cust2.get().getBankId(), cust.getBankId());
	}

	@Test(expected = MyException.class)
	public void test5() throws MyException {
		final Customer cust = new Customer();
		cust.setCustomerId(2);
		cust.setBankId(1);
		cust.setName("Abhishek Jaiswal");
		cust.setPin("201011");

		Optional<Customer> cuss = Optional.empty();
		when(custRepo.findById(2)).thenReturn(cuss);

		custServ.getCustomerDetails(2);

	}

	@Test(expected = MyException.class)
	public void test6() throws MyException {

		Account accou = new Account();
		accou.setAccountId(5);
		accou.setAmount(new BigDecimal(10000));
		accou.setBankId(1);
		accou.setCustomerId(2);
		Optional<Customer> opt2 = Optional.empty();

		when(custRepo.findById(2)).thenReturn(opt2);

		accServ.createAccount(accou);

	}

	@Test(expected = MyException.class)
	public void test8() throws MyException {
		Account accou = new Account();
		accou.setAccountId(5);
		accou.setAmount(new BigDecimal(10000));
		accou.setBankId(1);
		accou.setCustomerId(2);
		Optional<Bank> opt2 = Optional.empty();
		
		when(bnkI.findById(1)).thenReturn(opt2);
		accServ.createAccount(accou);
	}
	
	
	@Test
	public void test9() throws MyException
	{
		final Bank ban = new Bank(new BigDecimal(0));
		ban.setBankId(1);
		
		final Customer cust = new Customer();
		cust.setCustomerId(2);
		cust.setBankId(1);
		cust.setName("Abhishek Jaiswal");
		cust.setPin("201011");
		
		Account accou = new Account();
		accou.setAccountId(5);
		accou.setAmount(new BigDecimal(10000));
		accou.setBankId(1);
		accou.setCustomerId(2);
		
		final Optional<Bank> opt2=Optional.of(ban);
		final Optional<Customer> opt1=Optional.of(cust);
		
		
		when(bnkI.findById(Mockito.any())).thenReturn(opt2);
		when(custRepo.findById(Mockito.any())).thenReturn(opt1);
		
		when(accRepo.save(Mockito.any())).thenReturn(accou);
		System.out.println(accou);

		final Account acc1=accServ.createAccount(accou);
		System.out.println(acc1);
		assertEquals(accou.getAmount(), acc1.getAmount());
	
		
		
	}
	
	
}
