package model;

import java.util.List;

public class Bank {
	
	private String bankName;
    List<Customer> custom;
	
	
	
	public Bank(final String bankName, final List<Customer> custom) {
		this.bankName = bankName;
		this.custom = custom;
	}

	public List<Customer> getCustom() {
		return custom;
	}

	public void setCustom(final List<Customer> custom) {
		this.custom = custom;
	}

	public String getBankName() {
		return bankName;
	}

	public void setBankName(final String bankName) {
		this.bankName = bankName;
	}
	
	
	
	
	

}
