package com.example.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

import com.example.exception.MyException;
import com.example.model.Account;
import com.example.model.Transaction;
import com.example.repository.TransactionDaoInterface;

/*
 * @abhishek
 */
@Service
public class TransactionServiceImpl implements TransactionServiceInterface {

	@Autowired
	private TransactionDaoInterface transD;

	@Autowired
	private Transaction transM;

	@Override
	@Transactional
	public void createTransaction(final Account obj, final String str) {
		transM.setAccountId(obj.getAccountId());
		transM.setCustomerId(obj.getCustomerId());
		transM.setAmount(obj.getAmount());
		transM.setTransactionType(str);
		transD.save(transM);

	}

	@Override
	public List<Transaction> TransactionReport() throws MyException {

		final List<Transaction> list1 = transD.findAll();
		if(list1.isEmpty())
		{
		throw new MyException(" Trabsaction list is empty ");	
		}
		else
		return list1;
	}

}
