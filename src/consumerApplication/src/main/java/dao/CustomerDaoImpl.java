package dao;

import java.util.List;

import javax.sql.DataSource;

import org.springframework.jdbc.core.JdbcTemplate;

import controller.CreateConnection;

public class CustomerDaoImpl implements CustomerDao {

	//CreateConnection conObj;

	private DataSource dataSource;

	public void setDataSource(DataSource dataSource) 
	{
		this.dataSource = dataSource;
	}

	@Override
	public String addCustomer(String cId, String cName, String cAddress, String payMode) {

		try {

			JdbcTemplate jdbcTemplate = new JdbcTemplate(dataSource);


			String str1="Insert into customer (customerId,customerName,customerAddress,paymentMode)values(?,?,?,?)";
			jdbcTemplate.update(str1,cId,cName,cAddress,payMode);

		}
		catch(Exception e)
		{
			System.out.println("Exception- Sql exception"+e);
			return "Not done";
		}




		return "Customer added";
	}

	@Override
	public String removeCustomer(String cId) {
		try {
			JdbcTemplate jdbcTemplate = new JdbcTemplate(dataSource);
			String str1="Delete from customer where customerId=?";
			jdbcTemplate.update(str1,cId);

		}
		catch(Exception e)
		{
			System.out.println("Exception- Sql exception "+e+" ");
			return "Not done";
		}

		return "Customer removed";
	}

	@Override
	public String updateCustomer(String cId) {

		try {

			JdbcTemplate jdbcTemplate = new JdbcTemplate(dataSource);
			String str1="Update customer set customerName=? where customerId=?";
			jdbcTemplate.update(str1,"sun",cId);

		}
		catch(Exception e)
		{
			System.out.println("Exception- Sql exception "+e+" ");
			return "Not done";
		}
		return "Customer updated";
	}

}
