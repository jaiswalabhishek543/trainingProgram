package com.example.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="supplier")
public class Supplier {
	
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="supplierId")
	private Integer supplierId;
	@Column(name="supplierName")
	private String supplierName;
	@Column(name="supplierAddress")
	private String supplierAddress;
	@Column(name="quantityOrder")
	private int quantityOrder;
	@Column(name="orderId")
	private String orderId;
	
	
	
	
	
	@Override
	public String toString() {
		return "Supplier [supplierId=" + supplierId + ", supplierName=" + supplierName + ", supplierAddress="
				+ supplierAddress + ", quantityOrder=" + quantityOrder + ", orderId=" + orderId + "]";
	}
	public Supplier(String supplierName, String supplierAddress, int quantityOrder, String orderId) {
		super();
		this.supplierName = supplierName;
		this.supplierAddress = supplierAddress;
		this.quantityOrder = quantityOrder;
		this.orderId = orderId;
	}
	public Integer getSupplierId() {
		return supplierId;
	}
	public void setSupplierId(Integer supplierId) {
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
