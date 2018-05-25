package com.example.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.exception.AuditLogException;
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
	public Audit addAudit(final Audit aud) throws AuditLogException {

		if (aud.getEventName() == null || aud.getEventType() == null) {
			throw new AuditLogException(" Do not leave value as null");

		} else {
			return auditRepo.save(aud);

		}
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.example.service.AuditServiceInterface#viewAll()
	 */
	@Override
	public List<Audit> viewAll() throws AuditLogException {

		if (!auditRepo.findAll().isEmpty()) {

			return auditRepo.findAll();
		} else {
			throw new AuditLogException(" List is empty");
		}
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.example.service.AuditServiceInterface#findByName1(java.lang.String)
	 */
	@Override
	public Audit findByName1(String name) throws AuditLogException {

		if (auditRepo.findByeventName(name) != null) {

			return auditRepo.findByeventName(name);

		} else {
			throw new AuditLogException(" Name is not present ");
		}

	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * com.example.service.AuditServiceInterface#deleteByName1(java.lang.String)
	 */
	@Override
	public Long deleteByName1(String name) throws AuditLogException {

		if (auditRepo.findByeventName(name) != null) {

			return auditRepo.deleteByeventName(name);

		} else {
			throw new AuditLogException(" Name is not present ");
		}
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.example.service.AuditServiceInterface#updateByeventType1(java.lang.
	 * String)
	 */
	@Override
	public Audit updateByeventType1(String evntType) throws AuditLogException {

		if (auditRepo.findByeventType(evntType) != null) {
			final Audit audi2 = auditRepo.findByeventType(evntType);
			audi2.setEventType("Nothing");
			auditRepo.save(audi2);
			return audi2;
		} else {
			throw new AuditLogException("Event type is not present");
		}
	}

}
