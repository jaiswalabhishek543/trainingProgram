package com.example.service;

/*
 * @abhishek
 */
import java.util.Optional;

import com.example.model.Bank;

public interface BankServiceInterface {

	Bank createBank(Bank ban1);

	Optional<Bank> getBankDetails(Integer id1);

	Bank getBankObj(Integer id0);

}
