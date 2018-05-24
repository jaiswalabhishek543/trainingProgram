package com.example.repo;

import java.util.UUID;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.example.model.Audit;

/**
 * @author abhishek
 *
 */
public interface AuditInterfaceRepo extends MongoRepository<Audit, UUID> {

	/*
	 * Using method to fetch the object on basis of event name
	 */
	Audit findByeventName(String name);

	/*
	 * Using method to delete the object on basis of event name
	 */
	Long deleteByeventName(String name);

	/*
	 * Using method to fetch the object on basis of event type
	 */
	Audit findByeventType(String name2);
}
