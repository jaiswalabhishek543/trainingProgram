package repository;

import java.util.List;

import model.Statement;

public interface AccountDao {
	
	List getStatementList(Statement stlist);
}
