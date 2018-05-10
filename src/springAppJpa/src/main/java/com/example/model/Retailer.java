package com.example.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="retailer")
public class Retailer {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="retailerId")
	private Integer retailerId;
	@Column(name="retailerName")
	private String retailerName;
	@Column(name="retailerAddress")
	private String retailerAddress;
	
	
	
	public Retailer()
	{
		
	}
	public Retailer(String retailerName, String retailerAddress) {
		this.retailerName = retailerName;
		this.retailerAddress = retailerAddress;
	}
	@Override
	public String toString() {
		return "Retailer [retailerId=" + retailerId + ", retailerName=" + retailerName + ", retailerAddress="
				+ retailerAddress + "]";
	}
	public Integer getRetailerId() {
		return retailerId;
	}
	public void setRetailerId(Integer retailerId) {
		this.retailerId = retailerId;
	}
	public String getRetailerName() {
		return retailerName;
	}
	public void setRetailerName(String retailerName) {
		this.retailerName = retailerName;
	}
	public String getRetailerAddress() {
		return retailerAddress;
	}
	public void setRetailerAddress(String retailerAddress) {
		this.retailerAddress = retailerAddress;
	}
	
	
	
	
	
	

}
