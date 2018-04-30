package service;

import java.util.List;

public interface CustomerServiceInterface {
	
	public String addCustomer(String cId,String cName,String cAddress,String payMode);
	public String removeCustomer(String cId);
	public String updateCustomer(String cId);

}
