package com.example.bankingSystemJpa;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.when;

import java.math.BigDecimal;

import org.junit.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;

import com.example.exception.MyException;
import com.example.model.Bank;
import com.example.repository.BankInterface;
import com.example.service.BankServiceImpl;

public class BankTestM {

	@Mock
	BankInterface bnkI;

	@InjectMocks
	BankServiceImpl bnkS;

	@Test
	public void test1() throws MyException {
		Bank ban = new Bank();
		ban.setAmount(new BigDecimal(20000));
		when(bnkI.save(Mockito.<Bank>any())).thenReturn(ban);
		assertEquals(bnkS.createBank(ban).getAmount(), new BigDecimal(20000));

	}

}
