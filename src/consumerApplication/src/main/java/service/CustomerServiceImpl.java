package service;

import java.util.List;

import dao.CustomerDaoImpl;

public class CustomerServiceImpl implements CustomerServiceInterface {

	
	private CustomerDaoImpl customer01;
	
	public void setCustomer01(CustomerDaoImpl customer01) {
		this.customer01 = customer01;
	}

	@Override
	public String addCustomer(String cId, String cName, String cAddress, String payMode) {
		
		return customer01.addCustomer(cId, cName, cAddress, payMode);
	}

	@Override
	public String removeCustomer(String cId) {
		
		return customer01.removeCustomer(cId);
	}

	@Override
	public String updateCustomer(String cId) {
		
		return customer01.updateCustomer(cId);
	}

}
