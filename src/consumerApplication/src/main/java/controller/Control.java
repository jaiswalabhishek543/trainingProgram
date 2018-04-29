package controller;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import model.Goods;
import service.GoodsServiceImpl;

public class Control {
	
	public static void main(String args[])
	{
		
		ApplicationContext app=new ClassPathXmlApplicationContext("applicationContext.xml");
		
		Goods gud2=(Goods) app.getBean("gud1");
		
		
		
		GoodsServiceImpl gud3;
		//gud3.addGoods("g1", "abc", 10, 100);
		
		
		
	}
	

}
