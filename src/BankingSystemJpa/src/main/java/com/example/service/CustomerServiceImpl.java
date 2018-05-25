package com.example.service;

import java.util.Optional;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.example.EnumClass;
import com.example.controller.ControllerToOtherServ;
import com.example.exception.MyException;
import com.example.model.Audit;
import com.example.model.Bank;
import com.example.model.Customer;
import com.example.repository.BankInterface;
import com.example.repository.CustomerRepo;

/*
 * @abhishek
 */
@Service
public class CustomerServiceImpl implements CustomerServiceInterface {

	/*@Autowired
	private CustomerDaoInterface customerDaoInterface;*/
	@Autowired
	private BankInterface bankk;
	@Autowired
	private CustomerRepo repo;

	Logger logg = LoggerFactory.getLogger(CustomerServiceImpl.class);

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
			final Customer cust2 = repo.save(cust1);
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

		final Optional<Customer> lis1 = repo.findById(id1);
		if (lis1.isPresent()) {
			Customer cusot = lis1.get();
		} else {
			throw new MyException(" Id is not present ");
		}

		return lis1;
	}

	@Override
	@Transactional
	public Customer updatePin(Integer intId, String userId, String pincode) throws MyException {
		Audit audObj = new Audit();

		Customer oldCust = repo.findOneCustomer(intId);
		Customer cust = new Customer(oldCust.getCustomerId(), oldCust.getName(), oldCust.getPin(), oldCust.getBankId(),
				oldCust.getListAccount(), oldCust.getListTransaction());

		Optional<Customer> originalCustomerOpt = repo.findById(intId);
		if (originalCustomerOpt.isPresent()) {
			Customer originalCustomer = originalCustomerOpt.get();

			audObj.setEventName(EnumClass.EventName.CUSTOMER.toString());
			audObj.setEventType(EnumClass.EventType.UPDATED.toString());

			originalCustomer.setPin(pincode);
			originalCustomer.setUserId(userId);
			audObj.setOldValue(cust);

			logg.info(oldCust.toString());
			
			Customer newCust = repo.save(originalCustomer);
			audObj.setNewValue(newCust);
			logg.info(newCust.toString());
			/*
			 * System.out.println("original customer  "+cust);
			 * System.out.println("updated customer  "+originalCustomer);
			 * System.out.println("Equals "+originalCustomer.equals(newCust));
			 */
			ControllerToOtherServ con = new ControllerToOtherServ();
			con.transferAuditDetails(audObj);

			return newCust;
		} else {
			throw new MyException(" Id not present");
		}

	}

}
