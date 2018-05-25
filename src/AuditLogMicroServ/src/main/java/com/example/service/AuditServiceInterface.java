package com.example.service;

import java.util.List;

import com.example.exception.AuditLogException;
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
	Audit addAudit(Audit aud) throws AuditLogException;

	/*
	 * Implementing this method to view the list of all Audit object persisted in
	 * database
	 * 
	 */

	List<Audit> viewAll() throws AuditLogException;

	/*
	 * Implementing this method to retrieve the info on the basis of name
	 * 
	 */

	Audit findByName1(String name) throws AuditLogException;

	/*
	 * Implementing this method to delete the info on the basis of name
	 * 
	 */

	Long deleteByName1(String name) throws AuditLogException;

	/*
	 * Implementing this method to update the info on the basis of Event type
	 * 
	 */

	Audit updateByeventType1(String evntType) throws AuditLogException;
}
