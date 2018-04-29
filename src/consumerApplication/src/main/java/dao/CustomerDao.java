package dao;

import java.util.List;

public interface CustomerDao {

	public String addCustomer(String cId,String cName,String cAddress,String payMode,List<String> list5);
	public String removeCustomer(String cId);
	public String updateCustomer(String cId);
	
	
	
}
