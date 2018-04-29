package service;

import java.util.List;

import dao.SupplierDaoImpl;

public class SupplierServiceImpl implements SupplierServiceInterface {

	
	SupplierDaoImpl suppl1;
	@Override
	public String addSupplier(String sId, String sName, String sAddress, int qunat, String orderId, int amount1,
			List<String> list6) {
		
		return suppl1.addSupplier(sId, sName, sAddress, qunat, orderId, amount1, list6);
	}

	@Override
	public String removeSupplier(String sId) {
		
		return suppl1.removeSupplier(sId);
	}

	@Override
	public String updateSupplier(String sId) {
		
		return suppl1.updateSupplier(sId);
	}

}
