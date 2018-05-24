package com.example.service;

import java.util.List;

import com.example.model.Audit;

public interface AuditServiceInterface {

	Audit addAudit(Audit aud);

	List<Audit> viewAll();

	Audit findByName1(String name);

	Long deleteByName1(String name);

	Audit updateByeventType1(String evntType);
}
