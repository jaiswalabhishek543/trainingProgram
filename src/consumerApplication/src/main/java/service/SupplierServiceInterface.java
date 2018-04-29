package service;

import java.util.List;

public interface SupplierServiceInterface {
	
	public String addSupplier(String sId,String sName,String sAddress,int qunat,String orderId,int amount1,List<String> list6);
	public String removeSupplier(String sId);
	public String updateSupplier(String sId);

}
