package com.example.service;

/*
 * @abhishek
 */
import java.math.BigDecimal;
import java.util.Optional;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.exception.MyException;
import com.example.model.ATM;
import com.example.model.Bank;
import com.example.repository.ATMDaoInterface;
import com.example.repository.BankInterface;

@Service
public class ATMServiceImpl implements ATMServiceInterface {

	@Autowired
	private ATMDaoInterface atm1;
	/*
	 * @Autowired private BankInterface bnn;
	 */
	@Autowired
	private BankInterface bww;
	@Autowired
	private BankServiceInterface bankServ;
	@Autowired
	private RefATMDenmServiceInterface refS;
	@Autowired
	private DenominationServiceInterface denom;

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.example.service.ATMServiceInterface#createATM(com.example.model.ATM)
	 */
	@Override
	public ATM createATM(ATM at1) throws MyException {

		final Integer att2 = at1.getBankId();
		final Optional<Bank> bkk = bww.findById(att2);
		if (at1.getAmount().compareTo(BigDecimal.ZERO) == 0) {
			if (bkk.isPresent()) {
				final ATM aam = atm1.save(at1);

				refS.iniRefTable(att2);
				return aam;
			} else {
				throw new MyException(" Bank id does not exist ");
			}
		} else {
			throw new MyException(" Amount should be zero at time of creating atm ");
		}
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.example.service.ATMServiceInterface#addMoneyFromBank(java.math.
	 * BigDecimal, java.lang.Integer)
	 */
	
	@Override
	@Transactional
	public ATM addMoneyFromBank(BigDecimal addit, Integer aId) throws MyException {
		Optional<ATM> ab1 = atm1.findById(aId);
		if (ab1.isPresent()) {
			final ATM ab2 = ab1.get();
			final Integer num = ab2.getBankId();
			final Optional<Bank> ab3 = bww.findById(num);
			if (ab3.isPresent()) {
				final Bank bab = ab3.get();
				if (addit.compareTo(bab.getAmount()) == -1) {
					final BigDecimal it1 = addit.add(ab2.getAmount());
					ab2.setAmount(it1);
					atm1.save(ab2);
					final BigDecimal bigg = bab.getAmount().subtract(addit);

					bab.setAmount(bigg);
					bww.save(bab);
					//bankServ.savinBankObj(bab);

					denom.denom3(addit, num, aId);
					return ab2;
				} else {
					throw new MyException(" Requested amount is  more than present amount");
				}
			}

			else {
				throw new MyException(" ATM with this bank id not present ");
			}

		} else {
			throw new MyException(" ATM with this id not present");
		}

	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * com.example.service.ATMServiceInterface#savingAtmObj(com.example.model.ATM)
	 */
	@Override
	public void savingAtmObj(ATM obj2) {

		atm1.save(obj2);
	}

}
