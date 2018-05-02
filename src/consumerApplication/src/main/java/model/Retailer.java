package model;

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

	public Retailer(final String retailerName, final String retailerAddress, final String retailerId) {
		this.retailerName = retailerName;
		this.retailerAddress = retailerAddress;
		this.retailerId = retailerId;
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
