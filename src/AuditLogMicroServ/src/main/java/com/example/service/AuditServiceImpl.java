package com.example.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.model.Audit;
import com.example.repo.AuditInterfaceRepo;

/**
 * @author trainee
 *
 */
@Service
public class AuditServiceImpl implements AuditServiceInterface {

	@Autowired
	private AuditInterfaceRepo auditRepo;

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * com.example.service.AuditServiceInterface#addAudit(com.example.model.Audit)
	 */
	@Override
	public Audit addAudit(Audit aud) {

		return auditRepo.save(aud);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.example.service.AuditServiceInterface#viewAll()
	 */
	@Override
	public List<Audit> viewAll() {

		return auditRepo.findAll();
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.example.service.AuditServiceInterface#findByName1(java.lang.String)
	 */
	@Override
	public Audit findByName1(String name) {

		return auditRepo.findByeventName(name);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * com.example.service.AuditServiceInterface#deleteByName1(java.lang.String)
	 */
	@Override
	public Long deleteByName1(String name) {

		return auditRepo.deleteByeventName(name);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.example.service.AuditServiceInterface#updateByeventType1(java.lang.
	 * String)
	 */
	@Override
	public Audit updateByeventType1(String evntType) {

		Audit audi2 = auditRepo.findByeventType(evntType);
		audi2.setEventType("Nothing");
		auditRepo.save(audi2);

		return audi2;
	}

}
