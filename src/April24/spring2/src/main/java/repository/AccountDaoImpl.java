package repository;

import java.util.ArrayList;
import java.util.List;

import model.Statement;

public class AccountDaoImpl implements AccountDao {
	
	List<Statement> list1=new ArrayList<Statement>();
	
	@Override
	public List getStatementList(Statement stlist) {
		// TODO Auto-generated method stub
		list1.add(stlist);
		return list1;
	}

}
