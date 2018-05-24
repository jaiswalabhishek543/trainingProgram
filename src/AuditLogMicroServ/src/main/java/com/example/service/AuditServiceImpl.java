package com.example.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.model.Audit;
import com.example.repo.AuditInterfaceRepo;

@Service
public class AuditServiceImpl implements AuditServiceInterface {

	@Autowired
	private AuditInterfaceRepo auditRepo;

	@Override
	public Audit addAudit(Audit aud) {

		return auditRepo.save(aud);
	}

	@Override
	public List<Audit> viewAll() {

		return auditRepo.findAll();
	}

	@Override
	public Audit findByName1(String name) {

		return auditRepo.findByeventName(name);
	}

	@Override
	public Long deleteByName1(String name) {

		return auditRepo.deleteByeventName(name);
	}

	@Override
	public Audit updateByeventType1(String evntType) {

		Audit audi2 = auditRepo.findByeventType(evntType);
		audi2.setEventType("Nothing");
		auditRepo.save(audi2);

		return audi2;
	}

}
