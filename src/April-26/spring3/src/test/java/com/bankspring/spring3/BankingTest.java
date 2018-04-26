package com.bankspring.spring3;

import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.Test;

import model.Account;
import model.Address;
import model.Contact;
import model.Customer;
import model.Statement;
import service.AccountImp;
import service.AccountService;

public class BankingTest {
	
	AccountService accObj=new AccountImp();
	
	
	//Testing for deposit
	@Test
	public void check1()
	{
		final Address addr=new Address("abc","def","ghi","hkl");
		final Contact cont=new Contact(1234,5678,"ab@gmail.com",addr);
		final Statement stat=new Statement("Saving account created");
		final List<Statement> list2=new ArrayList<>();
		final Account acc=new Account("007",11,4000,5,list2,"Saving");
		final List<Account> list3=new ArrayList<>();
		list3.add(acc);
		final Customer cust1=new Customer("Abhi","Jais",cont,list3,1);
		
		
		
		
		
		accObj.deposit(cust1, "007", 1000);
		assertEquals("test case", 5000, acc.getMoney(),3);
		
		
		
	}
	
	//Testing for updating mobile number
	@Test
	public void check2()
	{
		final Address addr=new Address("abc","def","ghi","hkl");
		final Contact cont=new Contact(1234,5678,"ab@gmail.com",addr);
		final Statement stat=new Statement("Saving account created");
		final List<Statement> list2=new ArrayList<>();
		final Account acc=new Account("007",11,4000,5,list2,"Saving");
		final List<Account> list3=new ArrayList<>();
		list3.add(acc);
		final Customer cust1=new Customer("Abhi","Jais",cont,list3,1);
            
			accObj.update(cust1, "007", 000001);
			assertEquals(000001, cont.getMobileNumber());;

		
	}
	
	
	
	

}
