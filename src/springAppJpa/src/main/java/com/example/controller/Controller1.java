package com.example.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.example.exceptions.MyException;
import com.example.model.Customer;
import com.example.model.Goods;
import com.example.service.CustomerServiceInterface;
import com.example.service.GoodsServiceInterface;
import com.example.service.RetailerServiceInterface;


@RestController
public class Controller1 {

	@Autowired
	private CustomerServiceInterface custServ;
	
	@Autowired
	private RetailerServiceInterface ret1;
	
	@Autowired
	private GoodsServiceInterface gusInt;
	
	
	Customer cust4=new Customer("Abhishek" ,"Delhi", "Cash");
	Customer cust5=new Customer("Abhi" ,"Del", "Card");
	Customer cust6=new Customer("Avinash" ,"Preet Vihar", "Card");
	Customer cust7=new Customer("Avi" ,"Nirman Vihar", "Card");
	
	@RequestMapping(value="/addcust",method=RequestMethod.POST)
	public Customer added() {
		
		custServ.addCustomer(cust7);
		return cust7;
		
	}
	
 
	@RequestMapping(value="/viewcust",method=RequestMethod.GET)
	public List<Customer> viewCustomer() {
		
		List<Customer> list1=custServ.viewAllCustomer();
		return list1;
		
	}

	
	@RequestMapping(value="/deletecust/{custId}",method=RequestMethod.GET)
	public Optional<Customer> delete(@PathVariable("custId") Integer custId)
	{
		return custServ.delete(custId);
		
	}
	
	
	@RequestMapping(value="/deletecust1/{custId1}")
	public ResponseEntity<Customer> delete4(@PathVariable("custId1") Integer cusId1) throws MyException
	{
		Customer cust10;
		try{
		cust10= custServ.del(cusId1);
		}
		catch(MyException f)
		{
			return new ResponseEntity<Customer>(HttpStatus.NOT_FOUND) ;
		}
		
		return new ResponseEntity<Customer>(cust10,HttpStatus.ACCEPTED) ;
	}
	
	
	
	
	@RequestMapping(value="/updatecust/{custI}",method=RequestMethod.GET)
	public Customer update(@PathVariable("custI") Integer custI)
	{
		return custServ.update(custI);
	}
	

	
	
	@RequestMapping(value="/viewallcust",method=RequestMethod.GET)
	public List<Customer> view12()
	{
		return ret1.viewcus();
	}

	@RequestMapping(value="/viewallgud",method=RequestMethod.GET)
	public List<Goods> view14()
	{
		return ret1.viewG();
	}



	
	
	Goods gud1=new Goods("Soap", 50, 400);
	Goods gud2=new Goods("Bottle", 40, 600);
	Goods gud3=new Goods("Detergent", 150, 200);
	Goods gud4=new Goods("Clothes", 500, 100);
	
	
	
	@RequestMapping(value="/addgoods",method=RequestMethod.POST)
	public Goods adding()
	{
		gusInt.addGoods(gud3);
		return gud3;
		
	}
	
	@RequestMapping(value="/viewgoods",method=RequestMethod.GET)
	public List<Goods> view1()
	{
		
		return gusInt.viewGud(); 
	}
	
	@RequestMapping(value="/deletegoods/{gudI}",method=RequestMethod.GET)
	public Optional<Goods> deleteGud(@PathVariable("gudI") Integer gudI)
	{
		return gusInt.removeGoods(gudI);
		
	}
	
	
	@RequestMapping(value="/updategoods/{gudd}",method=RequestMethod.GET)
	public Goods updateGood(@PathVariable("gudd") Integer gudd)
	{
		Goods gud3=gusInt.updateGoods(gudd);
		return gud3;
	}
	
	
	
	
}
