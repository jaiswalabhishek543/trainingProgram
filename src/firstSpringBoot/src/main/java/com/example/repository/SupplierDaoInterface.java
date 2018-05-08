package com.example.repository;

import java.util.List;
/*
 * @abhi
 */
public interface SupplierDaoInterface {
	//Methods to be implemented
	public String addSupplier(String sId,String sName,String sAddress,int qunat,String orderId,int amount1);
	public String removeSupplier(String sId);
	public String updateSupplier(String sId);

}
