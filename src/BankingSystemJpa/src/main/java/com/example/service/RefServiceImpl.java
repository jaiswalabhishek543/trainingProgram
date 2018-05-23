package com.example.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.exception.MyException;
import com.example.model.RefMoney;
import com.example.repository.RefMoneyRepo;

@Service
public class RefServiceImpl implements RefServiceInterface {

	@Autowired
	private RefMoneyRepo refR;
	
	@Autowired
	private RefATMDenmServiceInterface refAtmSer;

	@Override
	public String addDenomination(Integer deno1) throws MyException {

		if (!refR.findById(deno1).isPresent()) {
			final RefMoney refM = new RefMoney();
			refM.setDenomination(deno1);
			refR.save(refM);
			return "Denomination added";
		} else {
			throw new MyException("Denomination already present in table");
		}
	}

	@Override
	public List<RefMoney> returnAll() throws MyException {
		
		final List<RefMoney> ref1=refR.findAll();
		if(ref1.isEmpty())
		{
			throw new MyException("Denomination not present");
		}
		else
		{
			return ref1;
		}
		
	}

	
	@Override
	public void addNewDenomination(Integer bkId, Integer atmid, Integer denom) throws MyException {

		if(!refR.findById(denom).isPresent())
		{
			
			refAtmSer.addCurrency(atmid, denom);
		}
		else
		{
			throw new MyException(" Denomination is already preseent");
		}
	}

}
