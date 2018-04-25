package com.bankspring.spring2;

import java.util.ArrayList;
import java.util.List;

import org.apache.log4j.Logger;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import model.Address;
import model.Contact;
import model.Customer;
import model.Statement;

import service.Account;
import service.SavingAccount;
/*
 * 
 * @abhi
 */

public class Demo {
	
	/*
	 * Creating of object , initializing and printing values
	 * 
	 */
	public static void main(String[] args) {
	    
		
		final Logger printf=Logger.getLogger(Demo.class.getName());
        final ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        
        //Creating customer object
       final Customer cust1=(Customer) context.getBean("cust");
       
       //Printing first and last name
       printf.info("First name- "+cust1.getFirstname()+" Last name- "+cust1.getSurname());
		
       //Retreiving contact object and printing contact and address info
		final Contact contact1=cust1.getContobj();
		printf.info("Contact Details- "+contact1);
		
		
		List<Account> alist1=new ArrayList<>();
		alist1=cust1.getAccunlist();
		//Printing account info
		printf.info(alist1.toString());
		

		
		
		
		
	}
	
		
	

	
	
}
