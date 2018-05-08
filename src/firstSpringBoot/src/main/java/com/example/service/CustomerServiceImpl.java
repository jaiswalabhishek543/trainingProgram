package com.example.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.repository.CustomerDao;
import com.example.repository.CustomerDaoImpl;

/*
 * @abhi
 */

@Service
public class CustomerServiceImpl implements CustomerServiceInterface {

	@Autowired
	private CustomerDao customer01;
	
	
/*	private CustomerDaoImpl customer01;

	public void setCustomer01(final CustomerDaoImpl customer01) {
		this.customer01 = customer01;
	}
*/

	/*
	 * @see service.CustomerServiceInterface#addCustomer(java.lang.String,
	 * java.lang.String, java.lang.String, java.lang.String)
	 */
	@Override
	public String addCustomer(final String cId, final String cName, final String cAddress, final String payMode) {

		return customer01.addCustomer(cId, cName, cAddress, payMode);
	}

	/*
	 * @see service.CustomerServiceInterface#removeCustomer(java.lang.String)
	 */
	@Override
	public String removeCustomer(final String cId) {

		return customer01.removeCustomer(cId);
	}

	/*
	 * @see service.CustomerServiceInterface#updateCustomer(java.lang.String)
	 */
	@Override
	public String updateCustomer(final String cId) {

		return customer01.updateCustomer(cId);
	}

}
