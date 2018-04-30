package service;

import java.util.List;

import dao.SupplierDaoImpl;

public class SupplierServiceImpl implements SupplierServiceInterface {

	
	private SupplierDaoImpl supply01;
	
	

	public void setSupply01(SupplierDaoImpl supply01) {
		this.supply01 = supply01;
	}

	@Override
	public String addSupplier(String sId, String sName, String sAddress, int qunat, String orderId, int amount1) {
		
		return supply01.addSupplier(sId, sName, sAddress, qunat, orderId, amount1);
	}

	@Override
	public String removeSupplier(String sId) {
		
		return supply01.removeSupplier(sId);
	}

	@Override
	public String updateSupplier(String sId) {
		
		return supply01.updateSupplier(sId);
	}

}
