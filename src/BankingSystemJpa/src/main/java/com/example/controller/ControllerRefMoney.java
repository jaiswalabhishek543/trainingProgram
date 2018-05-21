package com.example.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.example.exception.MyException;
import com.example.service.RefServiceInterface;

@RestController
public class ControllerRefMoney {

	@Autowired
	private RefServiceInterface refS;

	@RequestMapping(value = "/addRefMoney/{int9}", method = RequestMethod.POST)
	public ResponseEntity<?> addRef(@PathVariable Integer int9) {
		try {
			refS.addDenomination(int9);
			return new ResponseEntity<String>("Added", HttpStatus.OK);
		} catch (MyException e) {
			return new ResponseEntity<String>(e.toString(), HttpStatus.BAD_REQUEST);

		}
		

	}

}
