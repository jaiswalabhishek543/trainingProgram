package com.example.service;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Optional;
import java.util.Random;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.exception.MyException;
import com.example.model.Denomination;
import com.example.repository.DenominationRepo;

@Service
public class DenominationServiceImpl implements DenominationServiceInterface {

	@Autowired
	private DenominationRepo denomR;

	ArrayList<Integer> arry1 = new ArrayList<>();
	Random rand = new Random();

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * com.example.service.DenominationServiceInterface#denom(java.math.BigDecimal,
	 * java.lang.Integer)
	 */

	public void denom(BigDecimal num1, Integer bId) throws MyException {

		if (num1.remainder(BigDecimal.ONE).compareTo(BigDecimal.ZERO) == 0) {

			Integer num = num1.intValue();
			arry1.add(2000);
			arry1.add(500);
			arry1.add(200);
			arry1.add(100);

			if (num > 0) {

				while (num != 0) {
					final Integer a = 0 + (int) (Math.random() * ((4 - 0)));

					final Integer chck = arry1.get(a);

					if (num > 100) {

						if (num > chck) {
							final Integer n1 = num / chck;
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

	public void denom2(BigDecimal num1, Integer bId) throws MyException {

		if (num1.remainder(BigDecimal.ONE).compareTo(BigDecimal.ZERO) == 0) {

			Integer num = num1.intValue();
			arry1.add(2000);
			arry1.add(500);
			arry1.add(200);
			arry1.add(100);

			if (num > 0) {

				while (num != 0) {
					final Integer a = 0 + (int) (Math.random() * ((4 - 0)));

					final Integer chck = arry1.get(a);

					if (num > 100) {

						if (num > chck) {

							final Integer n1 = num / chck;
							num = num % chck;
							final Optional<Denomination> den = denomR.findById(chck);
							final Denomination denObj = den.get();
							if (denObj.getNoOfDenomination() >= n1) {
								denObj.setNoOfDenomination(denObj.getNoOfDenomination() - n1);
								denomR.save(denObj);
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

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * com.example.service.DenominationServiceInterface#createBankDenm(java.lang.
	 * Integer)
	 */
	public void createBankDenm(Integer banId) {
		final Denomination denom1 = new Denomination(2000, banId, 0);
		final Denomination denom2 = new Denomination(400, banId, 0);
		final Denomination denom3 = new Denomination(200, banId, 0);
		final Denomination denom4 = new Denomination(100, banId, 0);

		denomR.save(denom1);
		denomR.save(denom2);
		denomR.save(denom3);
		denomR.save(denom4);

	}

}
