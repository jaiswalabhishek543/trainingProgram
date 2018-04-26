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
	
	
	
	
	
	public Account(String accountNo, int interestRate, double money, int interestPeriod, List<Statement> statementList,
			String typeOfAccount) {
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
	public void setAccountNo(String accountNo) {
		this.accountNo = accountNo;
	}
	public int getInterestRate() {
		return interestRate;
	}
	public void setInterestRate(int interestRate) {
		this.interestRate = interestRate;
	}
	public double getMoney() {
		return money;
	}
	public void setMoney(double money) {
		this.money = money;
	}
	public int getInterestPeriod() {
		return interestPeriod;
	}
	public void setInterestPeriod(int interestPeriod) {
		this.interestPeriod = interestPeriod;
	}
	public List<Statement> getStatementList() {
		return statementList;
	}
	public void setStatementList(List<Statement> statementList) {
		this.statementList = statementList;
	}
	public String getTypeOfAccount() {
		return typeOfAccount;
	}
	public void setTypeOfAccount(String typeOfAccount) {
		this.typeOfAccount = typeOfAccount;
	}
	
	

	
	
	
}
