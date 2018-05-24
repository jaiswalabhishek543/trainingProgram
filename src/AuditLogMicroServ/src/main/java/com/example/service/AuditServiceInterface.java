package com.example.service;

import java.util.List;

import com.example.model.Audit;


/**
 * @author abhishek
 *
 */
public interface AuditServiceInterface {

	/*
	 * Implementing this method to persist Audit object in database
	 * 
	 */
	Audit addAudit(Audit aud);

	/*
	 * Implementing this method to view the list of all Audit object persisted in
	 * database
	 * 
	 */

	List<Audit> viewAll();

	/*
	 * Implementing this method to retrieve the info on the basis of name
	 * 
	 */

	Audit findByName1(String name);

	/*
	 * Implementing this method to delete the info on the basis of name
	 * 
	 */

	Long deleteByName1(String name);

	/*
	 * Implementing this method to update the info on the basis of Event type
	 * 
	 */

	Audit updateByeventType1(String evntType);
}
