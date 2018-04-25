package service;

import java.util.List;

import org.apache.log4j.Logger;

import com.bankspring.spring2.Demo;

import model.Statement;
/*
 * @abhi
 * 
 */
public class FlexibleSavingAccount implements Account {
	/*
	 * Creating flexible saving account class that is extending Account class
	 * 
	 */
	
	final Logger printf=Logger.getLogger(Demo.class.getName());


	private double money;
	private double interestRate=1.8;
	private Integer interestPeriod;
	private List<Statement> statementList;
	private String typeAccount;

	public FlexibleSavingAccount(final double mon,final Integer time,final List<Statement> stateList,String typeaccn)
	{
		money=mon;
		interestPeriod=time;
		statementList=stateList;
		typeAccount="Flexible account";
	}

	public double getMoney() {
		return money;
	}

	

	public Integer getInterestPeriod() {
		return interestPeriod;
	}



	
	@Override
	public String toString() {
		return "FlexibleSavingAccount [typeAccount=" + typeAccount + ", getMoney()=" + getMoney()
				+ ", getInterestPeriod()=" + getInterestPeriod()
				+ "]";
	}

	public void getStatementList(final List<Statement> list) {
		// TODO Auto-generated method stub
		for(final Statement stm:list)
		{
			printf.info(stm);
		}
	}

}
