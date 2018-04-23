package bankingsystem;

import java.util.List;
/*
 * @abhi
 * 
 */
public class Customer {
	/*
	 * Creating customer class and initializing customer details
	 * 
	 */
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
