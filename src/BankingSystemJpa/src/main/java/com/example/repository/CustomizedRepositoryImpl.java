package com.example.repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

public class CustomizedRepositoryImpl implements CustomizedRepository {
	@PersistenceContext
	private EntityManager entityManager;

	@Override
	public <T> void detachEntity(T entity) {
		entityManager.detach(entity);
	}

}
