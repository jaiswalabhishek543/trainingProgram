package model;

import java.util.List;


import service.AccountService;

public class Customer {
	
	private String firstname;
	private String surname;
	private Contact contobj;
	private List<Account> accunlist;
	private Integer customerId;
	
	
	public Customer(String firstname, String surname, Contact contobj, List<Account> accunlist, Integer customerId) {
		this.firstname = firstname;
		this.surname = surname;
		this.contobj = contobj;
		this.accunlist = accunlist;
		this.customerId = customerId;
	}
	
	public String getFirstname() {
		return firstname;
	}
	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}
	public String getSurname() {
		return surname;
	}
	public void setSurname(String surname) {
		this.surname = surname;
	}
	public Contact getContobj() {
		return contobj;
	}
	public void setContobj(Contact contobj) {
		this.contobj = contobj;
	}
	public List<Account> getAccunlist() {
		return accunlist;
	}
	public void setAccunlist(List<Account> accunlist) {
		this.accunlist = accunlist;
	}
	public Integer getCustomerId() {
		return customerId;
	}
	public void setCustomerId(Integer customerId) {
		this.customerId = customerId;
	}


}
