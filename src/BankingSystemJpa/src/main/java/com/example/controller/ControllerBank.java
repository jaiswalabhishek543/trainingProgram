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

import com.example.model.Bank;
import com.example.model.Customer;
import com.example.service.BankServiceInterface;

/*
 * @abhishek
 */
@RestController
public class ControllerBank {

	@Autowired
	private BankServiceInterface bank1;

	@RequestMapping(value = "/viewCustList/{bId}", method = RequestMethod.GET)
	public ResponseEntity<List<Customer>> listBank(@PathVariable final Integer bId) {

		final Bank baa = bank1.getBankObj(bId);

		return new ResponseEntity<List<Customer>>(baa.getListCustomer(), HttpStatus.OK);

	}

	@RequestMapping(value = "/addBank", method = RequestMethod.POST)
	public ResponseEntity<Bank> addBank1(@RequestBody final Bank ban) {

		final Bank ban2 = bank1.createBank(ban);

		return new ResponseEntity<Bank>(ban2, HttpStatus.CREATED);

	}

	@RequestMapping(value = "/viewBank/{big}", method = RequestMethod.GET)
	public ResponseEntity<Bank> viewBank1(@PathVariable final Integer big) {
		final Optional<Bank> ban3 = bank1.getBankDetails(big);
		final Bank ban4 = ban3.get();
		return new ResponseEntity<Bank>(ban4, HttpStatus.OK);
	}

}
