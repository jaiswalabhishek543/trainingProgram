package controller;

import java.sql.SQLException;

import org.springframework.jdbc.datasource.SimpleDriverDataSource;

public class CreateConnection {

	
	public  static SimpleDriverDataSource connec() throws SQLException
	{
		SimpleDriverDataSource dataSource = new SimpleDriverDataSource();
        dataSource.setDriver(new com.mysql.jdbc.Driver());
        dataSource.setUrl("jdbc:mysql://localhost/Db_Custom");
        dataSource.setUsername("root");
        dataSource.setPassword("");
        System.out.println("done with connection");
		return dataSource;
		
		
	}
}
