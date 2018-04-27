package controller;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import model.Bank;
import model.Customer;

public class Demo {
	
	
	
	public void method1(List<Customer> list7)
	{
		//ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

		Bank ban=(Bank) context.getBean("bank1");
		
		ban.setCustom(list7);
		
		
		
	}

}
