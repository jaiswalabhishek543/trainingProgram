package bankingsystem;

import java.util.List;
/*
 * @abhi
 * 
 */
public class SavingAccount extends Account {
	/*
	 * Creating saving account class that is extending Account class
	 * 
	 */
	
	private String typeAccount;
	public SavingAccount(double mon,Integer time,List<Statement> statementList,String typeaccn)
	{
		super(mon,time,statementList);
		typeAccount="Saving Account";
		
	}
	@Override
	public String toString() {
		return "SavingAccount [typeAccount=" + typeAccount + ", getMoney()=" + getMoney() + ", getInterestPeriod()="
				+ getInterestPeriod() + ", getStatementList()=" + getStatementList() 
				;
	}
	

	
	

}
