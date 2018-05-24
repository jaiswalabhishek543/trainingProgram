package com.example.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.EnumClass;
import com.example.controller.ControllerToOtherServ;
import com.example.exception.MyException;
import com.example.model.Audit;
import com.example.model.Bank;
import com.example.model.Customer;
import com.example.repository.BankInterface;
import com.example.repository.CustomerDaoInterface;

/*
 * @abhishek
 */
@Service
public class CustomerServiceImpl implements CustomerServiceInterface {

	@Autowired
	private CustomerDaoInterface cust;
	@Autowired
	private BankInterface bankk;

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * com.example.service.CustomerServiceInterface#createCustomer(com.example.model
	 * .Customer)
	 */
	@Override
	public Customer createCustomer(Customer cust1) throws MyException {

		final Integer aab = cust1.getBankId();

		final Optional<Bank> liss = bankk.findById(aab);
		if (!liss.isPresent()) {
			throw new MyException(" Bank id is not present ");
		} else {
			final Customer cust2 = cust.save(cust1);
			return cust2;

		}
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * com.example.service.CustomerServiceInterface#getCustomerDetails(java.lang.
	 * Integer)
	 */
	@Override
	public Optional<Customer> getCustomerDetails(Integer id1) throws MyException {

		final Optional<Customer> lis1 = cust.findById(id1);
		if (lis1.isPresent()) {
			Customer cusot = lis1.get();
		} else {
			throw new MyException(" Id is not present ");
		}

		return lis1;
	}

	@Override
	public Customer updatePin(Integer intId, String userId, String pincode) throws MyException {
		Audit audObj = new Audit();

		Optional<Customer> custo = cust.findById(intId);
		if (custo.isPresent()) {
			audObj.setOldValue(custo.get());
			Customer cust5 = custo.get();
			
			audObj.setEventName(EnumClass.EventName.CUSTOMER.toString());
			audObj.setEventType(EnumClass.EventType.UPDATED.toString());

			cust5.setPin(pincode);
			cust5.setUserId(userId);
			Customer cust6 = cust.save(cust5);
			audObj.setNewValue(cust6);
			ControllerToOtherServ con = new ControllerToOtherServ();
			con.transferAuditDetails(audObj);

			return cust6;
		} else {
			throw new MyException(" Id not present");
		}

	}

}
