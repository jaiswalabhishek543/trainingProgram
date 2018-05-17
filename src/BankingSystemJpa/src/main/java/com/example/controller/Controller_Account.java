package com.example.controller;

import java.math.BigDecimal;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.example.exception.MyException;
import com.example.model.Account;
import com.example.service.AccountServiceInterface;

/*
 * @abhishek
 * 
 */
@RestController
public class Controller_Account {

	@Autowired
	private AccountServiceInterface accun1;

	@RequestMapping(value = "/createAcc", method = RequestMethod.POST)
	public ResponseEntity<String> createAccunt(@RequestBody final Account acc1) {
		try {
			final Account acc2 = accun1.createAccount(acc1);
			return new ResponseEntity<String>("Account with id: " + acc2.getAccountId() + " craeted",
					HttpStatus.CREATED);
		} catch (MyException e) {
			return new ResponseEntity<String>(e.toString(), HttpStatus.BAD_REQUEST);
		}

	}

	@RequestMapping(value = "/getAccDetail/{accID5}", method = RequestMethod.GET)
	public ResponseEntity<String> getAccDetails(@PathVariable final Integer accID5) {
		try {
			final Account acc7 = accun1.getAccountDetails(accID5);
			return new ResponseEntity<String>(acc7.toString(), HttpStatus.OK);
		} catch (MyException e) {
			return new ResponseEntity<String>(e.toString(), HttpStatus.BAD_REQUEST);
		}

	}

	@RequestMapping(value = "/wdrawMoney/{amunt}/{aid}/{int9}/{atmId2}", method = RequestMethod.GET)
	public ResponseEntity<String> withdrawMon(@PathVariable BigDecimal amunt, @PathVariable Integer aid,
			@PathVariable final Integer int9, @PathVariable Integer atmId2) {
		try {
			final Account acc10 = accun1.withdrawMoney(amunt, aid, int9, atmId2);
			return new ResponseEntity<String>(" Amount left in account is " + acc10.getAmount(), HttpStatus.OK);
		} catch (MyException e) {
			return new ResponseEntity<String>(e.toString(), HttpStatus.BAD_REQUEST);
		}

	}

	@RequestMapping(value = "/depoMoney/{amou}/{aid1}")
	public ResponseEntity<String> deposMony(@PathVariable BigDecimal amou, @PathVariable Integer aid1) {
		try {
			final Account aacc = accun1.depositMoney(amou, aid1);
			return new ResponseEntity<String>(aacc.getAmount() + " added into account id " + aacc.getAccountId(),
					HttpStatus.OK);
		} catch (MyException e) {
			return new ResponseEntity<String>(" Money not deposited ", HttpStatus.BAD_REQUEST);
		}

	}

}
