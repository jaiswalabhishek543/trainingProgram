package com.example.service;

import java.math.BigDecimal;
import java.util.Optional;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.exception.MyException;
import com.example.model.ATM;
import com.example.model.Account;
import com.example.model.Bank;
import com.example.repository.ATMDaoInterface;
import com.example.repository.AccountDaoInterface;
import com.example.repository.BankInterface;
import com.example.repository.CustomerDaoInterface;

/*
 * @abhishek
 */
@Service
public class AccountServiceImpl implements AccountServiceInterface {

	@Autowired
	private CustomerDaoInterface custom;
	@Autowired
	private BankInterface bank1;
	@Autowired
	private AccountDaoInterface acc1;
	@Autowired
	private TransactionServiceInterface trasac;
	@Autowired
	private ATMServiceInterface atmS;
	@Autowired
	private ATMDaoInterface atmD;

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * com.example.service.AccountServiceInterface#createAccount(com.example.model.
	 * Account)
	 */
	@Override
	public Account createAccount(Account acc) throws MyException {
		final Integer cust11 = acc.getCustomerId();
		final Integer bank11 = acc.getBankId();
		if (custom.findById(cust11).isPresent() && bank1.findById(bank11).isPresent()) {
			if (custom.findById(cust11).get().getBankId() == bank1.findById(bank11).get().getBankId()) {
				final Account acc2 = acc1.save(acc);
				return acc2;
			} else {
				throw new MyException(" Customer's bankId does not match the given bankId ");
			}
		} else {
			throw new MyException(" Id is not right ");
		}

	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.example.service.AccountServiceInterface#depositMoney(java.math.
	 * BigDecimal, java.lang.Integer)
	 */
	@Override
	@Transactional
	public Account depositMoney(BigDecimal amunt2, Integer acId) throws MyException {

		if (acc1.findById(acId).isPresent()) {

			// Call method to initialize denomination

			final Account accOb = acc1.findById(acId).get();
			final Integer int6 = accOb.getBankId();
			final Bank bankOb = bank1.findById(int6).get();
			bankOb.setAmount(bankOb.getAmount().add(amunt2));
			bank1.save(bankOb);
			accOb.setAmount(accOb.getAmount().add(amunt2));
			acc1.save(accOb);

			trasac.createTransaction(accOb, " Credit ");

			return accOb;

		} else {
			throw new MyException(" Account Id is not present");
		}

	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.example.service.AccountServiceInterface#withdrawMoney(java.math.
	 * BigDecimal, java.lang.Integer, java.lang.Integer, java.lang.Integer)
	 */
	@Override
	@Transactional
	public Account withdrawMoney(final BigDecimal amunt2, final Integer acId, final Integer flag, final Integer atmId)
			throws MyException {
		/*
		 * When withdrawing money fro bank
		 */
		if (flag == 0) {

			final Optional<Account> aac1 = acc1.findById(acId);
			if (aac1.isPresent()) {
				final Account aac2 = aac1.get();
				final Bank bankobj = bank1.findById(aac2.getBankId()).get();
				if (bankobj.getAmount().compareTo(amunt2) == 1 && aac2.getAmount().compareTo(amunt2) == 1) {

					final BigDecimal int1 = bankobj.getAmount().subtract(amunt2);
					bankobj.setAmount(int1);
					bank1.save(bankobj);
					aac2.setAmount(aac2.getAmount().subtract(amunt2));
					acc1.save(aac2);
					trasac.createTransaction(aac2, " Debit ");
					return aac2;
				} else {

					throw new MyException(" Requested amount is not present ");
				}

			} else {
				throw new MyException(" Account Id is not found ");
			}

		}
		/*
		 * When withdrawing money from ATM
		 */
		else if (flag == 1) {
			final Optional<Account> aac1 = acc1.findById(acId);
			if (aac1.isPresent()) {
				final Account aac2 = aac1.get();
				final Optional<ATM> atm5 = atmD.findById(atmId);
				if (atm5.isPresent()) {

					final ATM atm6 = atm5.get();
					if (atm6.getAmount().compareTo(amunt2) == 1 && aac2.getAmount().compareTo(amunt2) == 1) {

						final BigDecimal int02 = aac2.getAmount().subtract(amunt2);
						final BigDecimal int03 = atm6.getAmount().subtract(amunt2);
						atm6.setAmount(int03);
						aac2.setAmount(int02);

						atmD.save(atm6);
						acc1.save(aac2);

						trasac.createTransaction(aac2, " Debit ");
						return aac2;

					} else {
						throw new MyException(" Requested amount is not present ");
					}

				} else {
					throw new MyException(" ATM Id is not found ");

				}

			} else {
				throw new MyException(" Account Id is not found ");
			}

		} else {
			throw new MyException(" Enter write value to select to take money from Bank and ATM ");

		}

	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.example.service.AccountServiceInterface#getAccountDetails(java.lang.
	 * Integer)
	 */
	@Override
	public Account getAccountDetails(Integer id7) throws MyException {
		final Optional<Account> acc4 = acc1.findById(id7);
		if (acc4.isPresent()) {
			final Account acc5 = acc4.get();
			return acc5;
		} else {
			throw new MyException(" Id not found ");
		}

	}

}
