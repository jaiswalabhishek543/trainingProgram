package com.example.service;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.Random;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.exception.MyException;
import com.example.model.Denomination;
import com.example.model.RefMoney;
import com.example.model.Ref_ATM_Denm;
import com.example.repository.RefATMDenmRepo;

@Service
public class RefATMDenmServiceImpl implements RefATMDenmServiceInterface {

	@Autowired
	private RefATMDenmRepo refRepo;

	@Autowired
	private RefServiceInterface refSer;

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
	public void iniRefTable(final Integer atmID1) throws MyException {

		List<RefMoney> listRef = refSer.returnAll();

		Integer i = 0;
		Integer j = listRef.size();
		while (j > i) {

			final Ref_ATM_Denm obj1 = new Ref_ATM_Denm(listRef.get(i).getDenomination(), 0, atmID1);
			refRepo.save(obj1);
			i++;

		}

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
			final List<RefMoney> listRef = refSer.returnAll();

			Integer max = listRef.size();
			Integer min = 0;

			/*
			 * arry1.add(2000); arry1.add(500); arry1.add(200); arry1.add(100);
			 */

			if (num > 0) {

				while (num != 0) {
					final Integer a = min + (int) (Math.random() * ((max - min)));

					final RefMoney denRef = listRef.get(a);
					final Integer chck = denRef.getDenomination();

					if (num >= 100) {

						if (num >= chck) {
							final Integer n1 = num / chck;
							num = num % chck;
							final Optional<Ref_ATM_Denm> den = refRepo.findById(chck);
							final Ref_ATM_Denm denObj = den.get();
							if (denObj.getNoOfDenomination() >= n1) {
								denObj.setNoOfDenomination(denObj.getNoOfDenomination() - n1);
								refRepo.save(denObj);
							} else {
								num = (n1 * chck) + num;
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

	@Override
	public void addCurrency(Integer atmId5, Integer denom4) {

		final Ref_ATM_Denm obj1 = new Ref_ATM_Denm(denom4, 0, atmId5);
		refRepo.save(obj1);
		
	}

}
