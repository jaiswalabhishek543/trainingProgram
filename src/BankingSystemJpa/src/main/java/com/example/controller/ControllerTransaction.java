package com.example.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.example.exception.MyException;
import com.example.model.Transaction;
import com.example.service.TransactionServiceInterface;

/*
 * @abhishek
 */
@RestController
public class ControllerTransaction {

	@Autowired
	private TransactionServiceInterface trans;

	@RequestMapping(value = "/transReport", method = RequestMethod.GET)
	public ResponseEntity<String> viewTransReport() {
		try {
			final List<Transaction> list1 = trans.TransactionReport();
			return new ResponseEntity<String>(list1.toString(), HttpStatus.OK);
		} catch (MyException e) {
			return new ResponseEntity<String>(e.toString(), HttpStatus.NOT_FOUND);
		}

	}

}
