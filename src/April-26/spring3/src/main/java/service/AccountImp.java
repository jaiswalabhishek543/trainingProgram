package service;

import java.util.Iterator;
import java.util.List;

import model.Account;
import model.Contact;
import model.Customer;
import model.Statement;
/*
 * @abhi
 * 
 */
public class AccountImp implements AccountService {
/*
 * Implementing AccountService class
 */
	
	Account accunt4;
    Contact contact1;
    
    //For deposit
	@Override
	public void deposit(Customer cust1, String accountNo, double val1) {
		// TODO Auto-generated method stub
		List<Account> list1=cust1.getAccunlist();


		for(Account acc1:list1)
		{

			if(acc1.getAccountNo().equals(accountNo))
			{
				double amount=acc1.getMoney()+val1;
				acc1.setMoney(amount);

			}
		}




	}

	//For withdrawl
	@Override
	public void withdraw(Customer cust2, String accountNo, double val2) {
		// TODO Auto-generated method stub

		List<Account> list1=cust2.getAccunlist();


		for(Account acc1:list1)
		{

			if(acc1.getAccountNo().equals(accountNo))
			{    
				if(acc1.getMoney()>=val2)
				{
				double amount=acc1.getMoney()-val2;
				acc1.setMoney(amount);
				}
				else
				{
				  double amount1=acc1.getMoney();	
				  acc1.setMoney(amount1);
				}
			}
		}

		//Statement st = new Statement();
		


	}

	
	//For deleting account 
	@Override
	public void deleteAccount(Customer cust3, String accountNo) {
	
		List<Account> list5=cust3.getAccunlist();
		
		Iterator itr=list5.iterator();
		
		while(itr.hasNext())
		{
			accunt4=(Account) itr.next();
			if(accunt4.getAccountNo().equals(accountNo))
			{
				
				itr.remove();
				break;
			}
			
			
		}
		
		
		
		
		
	}

	//For updating mobile number
	@Override
	public void update(Customer cust4, String accountNo,int moNo) {
		
		Contact cont=cust4.getContobj();
		cont.setMobileNumber(moNo);
		
		
		
		
		
	}
	
	
	
	
	
	

}
