package service;

import model.Customer;

public interface AccountService {

	
	public void deposit(Customer cust1,String accountNo,double val1);
	public void withdraw(Customer cust2,String accountNo,double val2);
	public void deleteAccount(Customer cust3,String accountNo);
	public void update(Customer cut4,String accountNo,int num);
	
}
