package bankingsystem;

import java.util.List;

public class Account extends Bank {
	
	
	private double money;
	private double interestRate=1.8;
	private Integer interestPeriod;
	private List<Statement> statementList;
	
	public Account(final double mon,final Integer time,final List<Statement> stateList)
	{
		money=mon;
		interestPeriod=time;
		statementList=stateList;
		
	}

	public double getMoney() {
		return money;
	}

	

	public Integer getInterestPeriod() {
		return interestPeriod;
	}


	public List getStatementList() {
		return statementList;
	}

	
	
	
	
		
	

}
