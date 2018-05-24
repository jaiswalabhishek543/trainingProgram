package com.example.repo;

import java.util.UUID;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.example.model.Audit;

public interface AuditInterfaceRepo extends MongoRepository<Audit, UUID> {

	Audit findByeventName(String name);
	Long deleteByeventName(String name);
	Audit findByeventType(String name2);
}
