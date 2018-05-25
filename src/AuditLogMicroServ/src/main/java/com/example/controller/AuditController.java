package com.example.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.example.exception.AuditLogException;
import com.example.model.Audit;
import com.example.service.AuditServiceInterface;

@RestController
public class AuditController {

	@Autowired
	private AuditServiceInterface auditServ;

	@RequestMapping(value = "/addAudit", method = RequestMethod.POST)
	public ResponseEntity<?> addAudit1(@RequestBody Audit aud2) {
		try {
			final Audit aud3 = auditServ.addAudit(aud2);
			return new ResponseEntity<Audit>(aud3, HttpStatus.CREATED);
		} catch (AuditLogException a) {
			return new ResponseEntity<String>(a.toString(), HttpStatus.BAD_REQUEST);
		}
	}

	@RequestMapping(value = "/viewAll", method = RequestMethod.GET)
	public ResponseEntity<?> addAudit2() {

		try {
			final List<Audit> audi = auditServ.viewAll();
			return new ResponseEntity<List<Audit>>(audi, HttpStatus.OK);
		} catch (AuditLogException a) {
			return new ResponseEntity<String>(a.toString(), HttpStatus.BAD_REQUEST);
		}
	}

	@RequestMapping(value = "/viewByName/{name1}", method = RequestMethod.GET)
	public ResponseEntity<?> viewByName1(@PathVariable String name1) {

		try {
			final Audit audi = auditServ.findByName1(name1);
			return new ResponseEntity<Audit>(audi, HttpStatus.OK);
		} catch (AuditLogException a) {
			return new ResponseEntity<String>(a.toString(), HttpStatus.BAD_REQUEST);
		}
	}

	@RequestMapping(value = "/deleteByName/{name1}", method = RequestMethod.GET)
	public ResponseEntity<?> deleteByName2(@PathVariable String name1) {

		try {
			final Long audi = auditServ.deleteByName1(name1);
			return new ResponseEntity<Long>(audi, HttpStatus.OK);
		} catch (AuditLogException a) {
			return new ResponseEntity<String>(a.toString(), HttpStatus.BAD_REQUEST);
		}
	}

	/**
	 * @param nam
	 * @return
	 */
	@RequestMapping(value = "/updateByeventType/{nam}", method = RequestMethod.GET)
	public ResponseEntity<?> updateByeventType1(@PathVariable String nam) {

		try {
			final Audit audi = auditServ.updateByeventType1(nam);
			return new ResponseEntity<Audit>(audi, HttpStatus.OK);
		} catch (AuditLogException a) {
			return new ResponseEntity<String>(a.toString(), HttpStatus.BAD_REQUEST);
		}
	}

}
