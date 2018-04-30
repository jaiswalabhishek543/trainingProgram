package model;

import java.util.List;

public class Retailer {

	private String retailerName;
	private String retailerAddress;
	private String retailerId;

	public Retailer(String retailerName, String retailerAddress, String retailerId) {
		this.retailerName = retailerName;
		this.retailerAddress = retailerAddress;
		this.retailerId = retailerId;
	}

	public String getRetailerId() {
		return retailerId;
	}

	public void setRetailerId(String retailerId) {
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
