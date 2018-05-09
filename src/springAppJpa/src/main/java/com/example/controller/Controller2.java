package com.example.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.model.Goods;
import com.example.service.GoodsServiceInterface;

@RequestMapping(value="/addgoods")
public class Controller2 {
	
	@Autowired
	private GoodsServiceInterface gusInt;
	
	
	Goods gud1=new Goods("Soap", 50, 400);
	Goods gud2=new Goods("Bottle", 40, 600);
	Goods gud3=new Goods("Detergent", 150, 200);
	Goods gud4=new Goods("Clothes", 500, 100);
	
	
	
	
	public Goods adding()
	{
		gusInt.addGoods(gud1);
		return gud1;
		
	}
	
	
	
	
}
