package service;

import java.util.ArrayList;
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
	public void deposit(final Customer cust1,final String accountNo,final double val1) {
		// TODO Auto-generated method stub
		final List<Account> list1=cust1.getAccunlist();


		for(final Account acc1:list1)
		{

			if(acc1.getAccountNo().equals(accountNo))
			{
				final double amount=acc1.getMoney()+val1;
				acc1.setMoney(amount);
				final Statement st = new Statement("Amount deposited");
				final List<Statement> list8=new ArrayList<>();
				list8.add(st);
				acc1.getStatementList().addAll(list8);
			}
		}




	}

	//For withdrawl
	@Override
	public void withdraw(final Customer cust2,final String accountNo,final double val2) {
		// TODO Auto-generated method stub

		final List<Account> list1=cust2.getAccunlist();


		for(final Account acc1:list1)
		{

			if(acc1.getAccountNo().equals(accountNo))
			{    
				if(acc1.getMoney()>=val2)
				{
					final double amount=acc1.getMoney()-val2;
					acc1.setMoney(amount);
					Statement st = new Statement("Amount debited");
					List<Statement> list8=new ArrayList<>();
					list8.add(st);
					acc1.getStatementList().addAll(list8);
				}
				else
				{
					final double amount1=acc1.getMoney();	
					acc1.setMoney(amount1);
				}
			}
		}

		
        


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
