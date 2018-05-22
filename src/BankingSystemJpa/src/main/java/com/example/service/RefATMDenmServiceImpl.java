package com.example.service;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Optional;
import java.util.Random;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.exception.MyException;
import com.example.model.Ref_ATM_Denm;
import com.example.repository.RefATMDenmRepo;

@Service
public class RefATMDenmServiceImpl implements RefATMDenmServiceInterface {

	@Autowired
	private RefATMDenmRepo refRepo;

	ArrayList<Integer> arry1 = new ArrayList<>();
	Random rand = new Random();

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * com.example.service.RefATMDenmServiceInterface#iniRefTable(java.lang.Integer)
	 */
	@Transactional
	@Override
	public void iniRefTable(final Integer atmID1) {

		final Ref_ATM_Denm obj1 = new Ref_ATM_Denm(2000, 0, atmID1);
		final Ref_ATM_Denm obj2 = new Ref_ATM_Denm(500, 0, atmID1);
		final Ref_ATM_Denm obj3 = new Ref_ATM_Denm(200, 0, atmID1);
		final Ref_ATM_Denm obj4 = new Ref_ATM_Denm(100, 0, atmID1);

		refRepo.save(obj1);
		refRepo.save(obj2);
		refRepo.save(obj3);
		refRepo.save(obj4);

	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * com.example.service.RefATMDenmServiceInterface#iniDenom(java.lang.Integer,
	 * java.lang.Integer, java.lang.Integer)
	 */
	@Transactional
	@Override
	public void iniDenom(final Integer currency, final Integer noOfCurrency, final Integer atmId9) {

		System.out.println("----------------iniDenom--------------");
		
		final Ref_ATM_Denm ref4 = refRepo.findById(currency).get();
		ref4.setNoOfDenomination(ref4.getNoOfDenomination() + noOfCurrency);
		refRepo.save(ref4);

	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * com.example.service.RefATMDenmServiceInterface#withdrawFromAtm(java.math.
	 * BigDecimal, java.lang.Integer)
	 */
	
	@Transactional
	@Override
	public void withdrawFromAtm(final BigDecimal amount, final Integer atmId11) throws MyException {

		if (amount.remainder(BigDecimal.ONE).compareTo(BigDecimal.ZERO) == 0) {

			Integer num = amount.intValue();
			arry1.add(2000);
			arry1.add(500);
			arry1.add(200);
			arry1.add(100);

			if (num > 0) {

				while (num != 0) {
					final Integer a = 0 + (int) (Math.random() * ((4 - 0)));

					final Integer chck = arry1.get(a);

					if (num >= 100) {

						if (num >= chck) {
System.out.println(" ------------------wthdrawl atm---------------");
							final Integer n1 = num / chck;
							num = num % chck;
							final Optional<Ref_ATM_Denm> den = refRepo.findById(chck);
							final Ref_ATM_Denm denObj = den.get();
							if (denObj.getNoOfDenomination() >= n1) {
								denObj.setNoOfDenomination(denObj.getNoOfDenomination() - n1);
								refRepo.save(denObj);
							} else {
								num = num * chck;
							}
						}

					} else {
						throw new MyException(" Not a valid amount");
					}

				}

			} else {
				throw new MyException(" Amount can not be negative value ");
			}

		} else {

			throw new MyException(" It is not integer amount ");

		}

		
	}

}
