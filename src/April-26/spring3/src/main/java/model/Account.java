package model;

import java.util.List;
/*
 * @abhi
 * 
 */

public class Account {

	
	private String accountNo;
	private int interestRate;
	private double money;
	private int interestPeriod;
	private List<Statement> statementList;
	private String typeOfAccount;
	
	
	
	
	
	public Account(final String accountNo,final int interestRate,final double money,final int interestPeriod,final List<Statement> statementList,
			final String typeOfAccount) {
		this.accountNo = accountNo;
		this.interestRate = interestRate;
		this.money = money;
		this.interestPeriod = interestPeriod;
		this.statementList = statementList;
		this.typeOfAccount = typeOfAccount;
	}
	
	
	public String getAccountNo() {
		return accountNo;
	}
	public void setAccountNo(final String accountNo) {
		this.accountNo = accountNo;
	}
	public int getInterestRate() {
		return interestRate;
	}
	public void setInterestRate(final int interestRate) {
		this.interestRate = interestRate;
	}
	public double getMoney() {
		return money;
	}
	public void setMoney(final double money) {
		this.money = money;
	}
	public int getInterestPeriod() {
		return interestPeriod;
	}
	public void setInterestPeriod(final int interestPeriod) {
		this.interestPeriod = interestPeriod;
	}
	public List<Statement> getStatementList() {
		return statementList;
	}
	public void setStatementList(final List<Statement> statementList) {
		this.statementList = statementList;
	}
	public String getTypeOfAccount() {
		return typeOfAccount;
	}
	public void setTypeOfAccount(final String typeOfAccount) {
		this.typeOfAccount = typeOfAccount;
	}
	
	

	
	
	
}
