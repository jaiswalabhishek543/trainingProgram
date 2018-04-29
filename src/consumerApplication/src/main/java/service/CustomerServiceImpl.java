package service;

import java.util.List;

import dao.CustomerDaoImpl;

public class CustomerServiceImpl implements CustomerServiceInterface {

	
	CustomerDaoImpl cust1;
	@Override
	public String addCustomer(String cId, String cName, String cAddress, String payMode, List<String> list5) {
		
		return cust1.addCustomer(cId, cName, cAddress, payMode, list5);
	}

	@Override
	public String removeCustomer(String cId) {
		
		return cust1.removeCustomer(cId);
	}

	@Override
	public String updateCustomer(String cId) {
		
		return cust1.updateCustomer(cId);
	}

}
