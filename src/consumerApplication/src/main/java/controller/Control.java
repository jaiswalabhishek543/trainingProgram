package controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import dao.CustomerDaoImpl;
import model.Customer;
import model.Goods;
import model.Supplier;
import service.CustomerServiceImpl;
import service.GoodsServiceImpl;
import service.RetailerServiceImpl;

public class Control {
	
	public static void main(String args[])
	{
		
		ApplicationContext app=new ClassPathXmlApplicationContext("applicationContext.xml");
		
		/*
		GoodsServiceImpl gud4=(GoodsServiceImpl) app.getBean("gud3");
		String str1=gud4.addGoods("g3", "Pavan", 11, 1100);
	    System.out.println(str1);
		*/
		
		/*
		CustomerServiceImpl custom=(CustomerServiceImpl) app.getBean("custom1");
		String str2=custom.addCustomer("c3", "Pappu", "sec 10, Airoli", "Card");
		System.out.println(str2);
		*/
		
		/*
		RetailerServiceImpl ret=(RetailerServiceImpl) app.getBean("retail1");
		String str3=ret.addRetailer("r1", "Raju", "Mumbai");
		System.out.println(str3);
		*/
		
		
		/*
		RetailerServiceImpl ret=(RetailerServiceImpl) app.getBean("retail1");
		List<Customer> custList=ret.viewCustomer();
		
		for(Customer cust:custList)
		{
			System.out.println(cust);
		}
		
		*/
		
		
		/*
		RetailerServiceImpl ret=(RetailerServiceImpl) app.getBean("retail1");
		List<Supplier> supplierList=ret.viewSupplier();
		
		for(Supplier sup:supplierList)
		{
			System.out.println(sup);
		}
		
		*/
		
		
		RetailerServiceImpl ret=(RetailerServiceImpl) app.getBean("retail1");
		List<Goods> gud6=ret.viewGoods();
		
		for(Goods gud2:gud6)
		{
			System.out.println(gud2);
		}
		
		
		
		
		
		
		
		
		
		
		
	}
	

}
