package model;

import java.util.List;


public class Customer {
	
	String firstname;
	String surname;
	Contact contobj;
	List<Account> accunlist;

	public Customer(String fName,String sname,Contact cobj,List<Account> alist)

	{
		firstname=fName;
		surname=sname;
		contobj=cobj;
		accunlist=alist;

	}
	
	

	@Override
	public String toString() {
		return "Customer [firstname=" + firstname + ", surname=" + surname + ", contobj=" + contobj + ", accunlist="
				+ accunlist + "]";
	}



	public String getFirstname() {
		return firstname;
	}

	public String getSurname() {
		return surname;
	}

	public Contact getContobj() {
		return contobj;
	}



	public List<Account> getAccunlist() {
		return accunlist;
	}


	
	

}
