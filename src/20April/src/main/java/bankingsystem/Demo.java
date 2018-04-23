package bankingsystem;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
/*
 * 
 * @abhi
 */

public class Demo {
	
	/*
	 * Creating of object , initializing and printing values
	 * 
	 */
	public static void main(String[] args) {
	    
		final Statement sobj1=new Statement("Statement is printing");
		
		//Initializing address and contact details of customer one
		final Address addr1=new Address("vas","12A","201012","Gzb");
		final Contact cont1=new Contact(12345,0123,"abc@gmail.com",addr1);
		
		
        
		//Initializing address and contact details of customer two
		final Address addr2=new Address("das","13c","201100","del");
		final Contact cont2=new Contact(123,0456,"a@gmail.com",addr2);

		
		final List<Statement> stateList = new ArrayList<>();
		stateList.add(sobj1);
		
        //Initializing account details of customer one and two respectively
		final Account acc1=new SavingAccount(10000,5,stateList,"xyz");
		final Account acc2=new SavingAccount(50000,7,stateList,"acd");

		List<Account> accuntlist=new ArrayList();
		accuntlist.add(acc1);
		accuntlist.add(acc2);
		
		final Customer cust1=new Customer("Abhi","Jais",cont1,accuntlist);
		final Customer cust2=new Customer("Abhi2","Jais2",cont2,accuntlist);
        
		//Printing details of customer two
		System.out.println(acc2.toString());
		System.out.println(cust2.toString());

		
		
		
	}
	
		
	

	
	
}
