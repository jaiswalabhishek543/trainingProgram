package com.example.service;

import java.util.List;

import com.example.model.Account;
import com.example.model.Transaction;

/*
 * @abhishek
 */
public interface TransactionServiceInterface {

	void createTransaction(Account obj, String str);

	List<Transaction> TransactionReport();

}
