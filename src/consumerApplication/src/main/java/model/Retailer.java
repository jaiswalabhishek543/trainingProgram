package model;

import java.util.List;

public class Retailer {

	private String retailerName;
	private String retailerAddress;
	private List<String> list3;  //Goods Id
	
	
	public List<String> getList3() {
		return list3;
	}
	public void setList3(List<String> list3) {
		this.list3 = list3;
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
