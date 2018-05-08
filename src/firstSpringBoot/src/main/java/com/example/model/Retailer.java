package com.example.model;

/*
 * @abhi
 */
public class Retailer {
	/*
	 * Retailer class
	 */

	private String retailerName;
	private String retailerAddress;
	private String retailerId;

	public Retailer() {
	}

	

	public String getRetailerId() {
		return retailerId;
	}

	public void setRetailerId(final String retailerId) {
		this.retailerId = retailerId;
	}

	public String getRetailerName() {
		return retailerName;
	}

	public void setRetailerName(final String retailerName) {
		this.retailerName = retailerName;
	}

	public String getRetailerAddress() {
		return retailerAddress;
	}

	public void setRetailerAddress(final String retailerAddress) {
		this.retailerAddress = retailerAddress;
	}

}
