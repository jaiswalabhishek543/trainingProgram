package model;

import java.util.List;

public class Supplier {
	
	private String supplierId;
	private String supplierName;
	private String supplierAddress;
	private int quantityOrder;
	private String orderId;
	private Integer amount;
	private List<String> list6;
	
	public List<String> getList6() {
		return list6;
	}
	public void setList6(List<String> list6) {
		this.list6 = list6;
	}
	public Integer getAmount() {
		return amount;
	}
	public void setAmount(Integer amount) {
		this.amount = amount;
	}
	private List<String> list2;  //Goods Id
	
	
	public List<String> getList2() {
		return list2;
	}
	public void setList2(List<String> list2) {
		this.list2 = list2;
	}
	public String getSupplierId() {
		return supplierId;
	}
	public void setSupplierId(String supplierId) {
		this.supplierId = supplierId;
	}
	public String getSupplierName() {
		return supplierName;
	}
	public void setSupplierName(String supplierName) {
		this.supplierName = supplierName;
	}
	public String getSupplierAddress() {
		return supplierAddress;
	}
	public void setSupplierAddress(String supplierAddress) {
		this.supplierAddress = supplierAddress;
	}
	public int getQuantityOrder() {
		return quantityOrder;
	}
	public void setQuantityOrder(int quantityOrder) {
		this.quantityOrder = quantityOrder;
	}
	public String getOrderId() {
		return orderId;
	}
	public void setOrderId(String orderId) {
		this.orderId = orderId;
	}
	
	
	

}
