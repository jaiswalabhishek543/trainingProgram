package service;

import java.util.List;

import model.Statement;

public class CustomerServiceImpl implements CustomerService {

	public void getStatementList(List<Statement> statementlist) {
	
		for(Statement stm: statementlist)
		{
			System.out.println(stm);
		}
		
	}

}
