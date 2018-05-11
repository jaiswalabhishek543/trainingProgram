package com.example.controller;

import java.util.ArrayList;
import java.util.HashMap;
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

	Customer cust4 = new Customer("Abhishek", "Delhi", "Cash");
	Customer cust5 = new Customer("Abhi", "Del", "Card");
	Customer cust6 = new Customer("Avinash", "Preet Vihar", "Card");
	Customer cust7 = new Customer("Avi", "Nirman Vihar", "Card");

	Customer cust14 = new Customer("Ab", "Delhi", "Cash");
	Customer cust15 = new Customer("A", "Del", "Card");

	List<Customer> list01 = new ArrayList<>();
	List<Integer> list02 = new ArrayList<>();

	@RequestMapping(value = "/addcust", method = RequestMethod.POST)
	public Customer added() {

		Customer cust11 = custServ.addCustomer(cust4);
		return cust11;

	}

	@RequestMapping(value = "/addlistcust", method = RequestMethod.POST)
	public ResponseEntity<List<Customer>> addList() {
		list01.add(cust14);
		list01.add(cust15);

		List<Customer> listCus = new ArrayList<Customer>();
		for (Customer obj1 : list01) {

			Customer abc = custServ.addCustomer(obj1);
			listCus.add(abc);
		}

		return new ResponseEntity<List<Customer>>(listCus, HttpStatus.ACCEPTED);
	}

	@RequestMapping(value = "/viewcust", method = RequestMethod.GET)
	public List<Customer> viewCustomer() {

		List<Customer> list1 = custServ.viewAllCustomer();
		return list1;

	}

	@RequestMapping(value = "/deletecust/{custId}", method = RequestMethod.GET)
	public Optional<Customer> delete(@PathVariable("custId") Integer custId) {
		return custServ.delete(custId);

	}

	// Deleting with exceptional handling
	@RequestMapping(value = "/deletecust1/{custId1}")
	public ResponseEntity<String> delete4(@PathVariable("custId1") Integer cusId1) throws MyException {

		try {
			custServ.del(cusId1);
		} catch (MyException f) {
			return new ResponseEntity<String>(f.toString(), HttpStatus.NOT_FOUND);
		}

		return new ResponseEntity<String>("Object deleted with id " + cusId1, HttpStatus.OK);
	}

	@RequestMapping(value = "/deletelistcust", method = RequestMethod.DELETE)
	public ResponseEntity<HashMap<Integer, String>> delcustlis() {

		list02.add(13);
		list02.add(14);

		return new ResponseEntity<HashMap<Integer, String>>(custServ.del2(list02), HttpStatus.OK);

	}

	@RequestMapping(value = "/updatecust/{custI}", method = RequestMethod.PUT)
	public ResponseEntity<String> update(@PathVariable("custI") Integer custI) {
		try {
			Customer cstom = custServ.update(custI);
			return new ResponseEntity<String>(cstom.getCustomerId() + " Id updated " + cstom.getPaymentMode(),
					HttpStatus.OK);
		} catch (MyException g) {
			return new ResponseEntity<String>(g.toString(), HttpStatus.NOT_FOUND);
		}

	}

	@RequestMapping(value = "/updatebulk", method = RequestMethod.PUT)
	public ResponseEntity<List<Customer>> bulkupdate(@RequestBody List<Customer> listCus) throws MyException {

		List<Customer> comm = custServ.update2(listCus);
		return new ResponseEntity<List<Customer>>(listCus, HttpStatus.OK);

	}

	/*
	 * Retailer
	 */

	@RequestMapping(value = "/viewallcust", method = RequestMethod.GET)
	public List<Customer> view12() {
		return ret1.viewcus();
	}

	@RequestMapping(value = "/viewallgud", method = RequestMethod.GET)
	public List<Goods> view14() {
		return ret1.viewG();
	}

	/*
	 * Goods
	 */

	Goods gud1 = new Goods("Soap", 50, 400);
	Goods gud2 = new Goods("Bottle", 40, 600);
	Goods gud3 = new Goods("Detergent", 150, 200);
	Goods gud4 = new Goods("Clothes", 500, 100);

	@RequestMapping(value = "/addgoods", method = RequestMethod.POST)
	public Goods adding() {
		gusInt.addGoods(gud3);
		return gud3;

	}

	@RequestMapping(value = "/viewgoods", method = RequestMethod.GET)
	public List<Goods> view1() {

		return gusInt.viewGud();
	}

	@RequestMapping(value = "/deletegoods/{gudI}", method = RequestMethod.GET)
	public Optional<Goods> deleteGud(@PathVariable("gudI") Integer gudI) {
		return gusInt.removeGoods(gudI);

	}

	@RequestMapping(value = "/updategoods/{gudd}", method = RequestMethod.GET)
	public Goods updateGood(@PathVariable("gudd") Integer gudd) {
		Goods gud3 = gusInt.updateGoods(gudd);
		return gud3;
	}

}
