package com.example.controller;

/*
 * @abhishek
 */
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.example.exception.MyException;
import com.example.model.Customer;
import com.example.service.CustomerServiceInterface;

@RestController
public class Controller_Cust {

	@Autowired
	private CustomerServiceInterface custom;

	@RequestMapping(value = "/addCust", method = RequestMethod.POST)
	public ResponseEntity<String> addCust(@RequestBody Customer cust4) {

		try {
			final Customer cust00 = custom.createCustomer(cust4);
			return new ResponseEntity<String>("Customer with id  " + cust00.getCustomerId() + " is created",
					HttpStatus.CREATED);

		} catch (MyException e) {
			return new ResponseEntity<String>(e.toString(), HttpStatus.BAD_REQUEST);

		}

	}

	@RequestMapping(value = "/viewCust/{id2}", method = RequestMethod.GET)
	public ResponseEntity<Customer> viewCust1(@PathVariable Integer id2) {
		try {
			final Optional<Customer> cust7 = custom.getCustomerDetails(id2);
			final Customer cust8 = cust7.get();
			return new ResponseEntity<Customer>(cust8, HttpStatus.FOUND);
		} catch (MyException e) {

			return new ResponseEntity<Customer>(HttpStatus.NOT_FOUND);
		}

	}

}
