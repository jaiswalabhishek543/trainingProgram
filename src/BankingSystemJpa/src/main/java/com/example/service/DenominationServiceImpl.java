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
import com.example.repository.DenominationRepo;

@Service
public class DenominationServiceImpl implements DenominationServiceInterface {

	@Autowired
	private DenominationRepo denomR;

	@Autowired
	private RefATMDenmServiceInterface refAtmS;

	@Autowired
	private RefServiceInterface refSer;

	/*
	 * @Autowired private RefMoney refMo;
	 * 
	 * 
	 * @Autowired private RefServiceInterface refSer;
	 */
	Random rand = new Random();

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * com.example.service.DenominationServiceInterface#denom(java.math.BigDecimal,
	 * java.lang.Integer)
	 */

	@Transactional
	public void denom(BigDecimal num1, Integer bId) throws MyException {

		if (num1.remainder(BigDecimal.ONE).compareTo(BigDecimal.ZERO) == 0) {

			final List<RefMoney> listRef = refSer.returnAll();

			Integer max = listRef.size();
			Integer min = 0;
			Integer num = num1.intValue();

			if (num > 0) {

				while (num != 0) {
					final Integer a = min + (int) (Math.random() * ((max - min)));

					final RefMoney denRef = listRef.get(a);
					final Integer chck = denRef.getDenomination();

					if (num >= 100) {

						if (num >= chck) {
							Integer n1 = num / chck;
							num = num % chck;
							Optional<Denomination> den = denomR.findById(chck);
							Denomination denObj = den.get();
							denObj.setNoOfDenomination(denObj.getNoOfDenomination() + n1);
							denomR.save(denObj);

						} else {
							throw new MyException(" Not a valid amount");
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

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * com.example.service.DenominationServiceInterface#denom2(java.math.BigDecimal,
	 * java.lang.Integer)
	 */
	@Transactional
	public void denom2(BigDecimal num1, Integer bId) throws MyException {

		if (num1.remainder(BigDecimal.ONE).compareTo(BigDecimal.ZERO) == 0) {

			List<RefMoney> listRef = refSer.returnAll();

			Integer max = listRef.size();

			Integer min = 0;
			System.out.println(listRef);

			Integer num = num1.intValue();

			if (num > 0) {

				while (num != 0) {

					if (num >= 100) {

						final Integer a = min + (int) (Math.random() * ((max - min)));
						final RefMoney denRef = listRef.get(a);
						final Integer chck = denRef.getDenomination();
						if (num >= chck) {

							
							final Integer n1 = num / chck;
							num = num % chck;
							final Optional<Denomination> den = denomR.findById(chck);
							final Denomination denObj = den.get();

							if (denObj.getNoOfDenomination() >= n1) {

								denObj.setNoOfDenomination(denObj.getNoOfDenomination() - n1);
								Denomination denny = denomR.save(denObj);

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

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * com.example.service.DenominationServiceInterface#createBankDenm(java.lang.
	 * Integer)
	 */
	public void createBankDenm(Integer banId) throws MyException {
		List<RefMoney> listRef = refSer.returnAll();

		Integer i = 0;
		Integer j = listRef.size();
		while (j > i) {

			final Denomination denom1 = new Denomination(listRef.get(i).getDenomination(), banId, 0);
			denomR.save(denom1);
			i++;

		}

	}

	@Transactional
	@Override
	public void denom3(BigDecimal num1, Integer bankId6, Integer atmId7) throws MyException {

		if (num1.remainder(BigDecimal.ONE).compareTo(BigDecimal.ZERO) == 0) {

			List<RefMoney> listRef = refSer.returnAll();

			Integer max = listRef.size();
			Integer min = 0;

			Integer num = num1.intValue();

			if (num > 0) {

				while (num != 0) {
					final Integer a = min + (int) (Math.random() * ((max - min)));

					final RefMoney denRef = listRef.get(a);
					final Integer chck = denRef.getDenomination();
					if (num >= 100) {

						if (num >= chck) {

							final Integer n1 = num / chck;

							final Optional<Denomination> den = denomR.findById(chck);
							final Denomination denObj = den.get();
							num = num % chck;
							if (denObj.getNoOfDenomination() >= n1) {
								denObj.setNoOfDenomination(denObj.getNoOfDenomination() - n1);

								refAtmS.iniDenom(chck, n1, atmId7);
								denomR.save(denObj);
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
	public void addCurrency(Integer bnkId, Integer denom7) {
		final Denomination denom1 = new Denomination(denom7, bnkId, 0);
		denomR.save(denom1);

	}

}
