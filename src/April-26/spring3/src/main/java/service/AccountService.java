package service;

import model.Customer;

public interface AccountService {

	
	void deposit(Customer cust1,String accountNo,double val1);
	void withdraw(Customer cust2,String accountNo,double val2);
	void deleteAccount(Customer cust3,String accountNo);
	void update(Customer cut4,String accountNo,int num);
	
}
