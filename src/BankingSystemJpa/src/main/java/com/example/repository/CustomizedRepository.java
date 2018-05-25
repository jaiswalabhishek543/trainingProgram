package com.example.repository;

public interface CustomizedRepository {
	<T> void detachEntity(T customer);
}
