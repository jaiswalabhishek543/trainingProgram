package bankingsystem;

import java.util.List;
/*
 * @abhi
 * 
 */
public class FlexibleSavingAccount extends Account {
	/*
	 * Creating flexible saving account class that is extending Account class
	 * 
	 */
	private String typeAccount;
	public FlexibleSavingAccount(double mon,Integer time,List<Statement> statementList,String typeaccn)
	{
		super(mon,time,statementList);
		typeAccount="Flexible Saving Account";
		
	}
	@Override
	public String toString() {
		return "FlexibleSavingAccount [typeAccount=" + typeAccount + ", getMoney()=" + getMoney()
				+ ", getInterestPeriod()=" + getInterestPeriod()
				+ "]";
	}

}
