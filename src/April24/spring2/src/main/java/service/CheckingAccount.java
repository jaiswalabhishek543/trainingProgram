package service;

import java.util.List;

import org.apache.log4j.Logger;

import com.bankspring.spring2.Demo;

import model.Statement;

public class CheckingAccount {

	
	double money;
	double interestRate=1.8;
	int interestPeriod;
	List<Statement> statementList;
	private String typeAccount;
	final Logger printf=Logger.getLogger(Demo.class.getName());

	public CheckingAccount(final double mon,final int time,final List<Statement> stateList,String typeaccn)
	{
		money=mon;
		interestPeriod=time;
		statementList=stateList;
		typeAccount="Checking Account";
	}

	public double getMoney() {
		return money;
	}

	

	public Integer getInterestPeriod() {
		return interestPeriod;
	}


	@Override
	public String toString() {
		return "SavingAccount [typeAccount=" + typeAccount + ", getMoney()=" + getMoney() + ", getInterestPeriod()="
				+ getInterestPeriod()
				;
	}

	public void getStatementList(final List<Statement> list) {
		// TODO Auto-generated method stub
		for(final Statement stm:list)
		{
			printf.info(stm);
		}
	}
	

	
	
}
