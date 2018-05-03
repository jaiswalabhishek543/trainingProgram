package dao;

import javax.sql.DataSource;

import org.springframework.jdbc.core.JdbcTemplate;

/*
 * @abhi
 * 
 */

public class CustomerDaoImpl implements CustomerDao {

	
	private DataSource dataSource;
	
	//Instantiating datasource
	public void setDataSource(DataSource dataSource) 
	{
		this.dataSource = dataSource;
	}
	
	//Implementing addCustomer method to add details
	@Override
	public String addCustomer(String cId, String cName, String cAddress, String payMode) {

		try {

			final JdbcTemplate jdbcTemplate = new JdbcTemplate(dataSource);


			final String str1="Insert into customer (customerId,customerName,customerAddress,paymentMode)values(?,?,?,?)";
			jdbcTemplate.update(str1,cId,cName,cAddress,payMode);

		}
		catch(Exception e)
		{
			System.out.println("Exception- Sql exception"+e);
			return "Not done";
		}




		return "Customer added";
	}
	
	//Implementing removeCustomer method to remove details
	@Override
	public String removeCustomer(String cId) {
		try {
			final JdbcTemplate jdbcTemplate = new JdbcTemplate(dataSource);
			final String str1="Delete from customer where customerId=?";
			jdbcTemplate.update(str1,cId);

		}
		catch(Exception e)
		{
			System.out.println("Exception- Sql exception "+e+" ");
			return "Not done";
		}

		return "Customer removed";
	}
	
	//Implementing updateCustomer method to update details
	@Override
	public String updateCustomer(final String cId) {

		try {

			final JdbcTemplate jdbcTemplate = new JdbcTemplate(dataSource);
			final String str1="Update customer set customerName=? where customerId=?";
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
