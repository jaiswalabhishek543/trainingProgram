package com.example.service;

import java.math.BigDecimal;
import java.util.Optional;

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
	@Autowired
	private BankInterface bnn;
	@Autowired
	private BankInterface bww;
	
	@Override
	public ATM createATM(ATM at1) throws MyException {
		
		Integer att2=at1.getBankId();
		Optional<Bank> bkk=bnn.findById(att2);
		if(bkk.isPresent())
		{
			ATM aam=atm1.save(at1);
			
			return aam;
		}
		else
		{
			throw new MyException(" Bank id does not exist ");
		}
		
	
	}

	@Override
	public ATM addMoneyFromBank(BigDecimal addit,Integer aId) throws MyException {
		Optional<ATM> ab1=atm1.findById(aId);
		if(ab1.isPresent())
		{
			ATM ab2=ab1.get();
			Integer num=ab2.getBankId();
			Optional<Bank> ab3=bnn.findById(num);
			if(ab3.isPresent())
			{
				Bank bab=ab3.get();
				if(addit.intValue()<=bab.getAmount().intValue())
				{
					Integer it1=addit.intValue()+ab2.getAmount().intValue();
					BigDecimal addit1=new BigDecimal(it1);
					ab2.setAmount(addit1);
					atm1.save(ab2);
				Integer bigg=bab.getAmount().intValue()-addit.intValue();
			         
			         BigDecimal bbb=new BigDecimal(bigg);
			         bab.setAmount(bbb);
			         bww.save(bab);
			         return ab2;
				}
				else
				{
					throw new MyException(" Requested amount is not more than present amount");
				}
			}
			
			else{
				throw new MyException(" ATM with this bank id not present ");
			}
			
			
			
			
		}
		else 
		{
			throw new MyException(" ATM with this id not present");
		}
		
		
	}

	@Override
	public ATM withdrawMoney(BigDecimal deduct) {
		// TODO Auto-generated method stub
		return null;
	}
	
	
	

}
