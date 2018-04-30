package dao;

import java.util.List;

import javax.sql.DataSource;

import org.springframework.jdbc.core.JdbcTemplate;

import controller.CreateConnection;

public class SupplierDaoImpl implements SupplierDaoInterface {

	CreateConnection conObj;


	private DataSource dataSource;

	public void setDataSource(DataSource dataSource) 
	{
		this.dataSource = dataSource;
	}




	@Override
	public String addSupplier(String sId, String sName, String sAddress, int qunat, String orderId, int amount1) {

		try {

			JdbcTemplate jdbcTemplate = new JdbcTemplate(dataSource);

			String str1="Insert into supplier (supplierId,supplierName,supplierAddress,quantityOrder,orderId,amount)values(?,?,?,?,?,?)";
			jdbcTemplate.update(str1,sId,sName,sAddress,qunat,orderId,amount1);

		}
		catch(Exception e)
		{
			System.out.println("Exception- Sql exception "+e+" ");
			return "Not done";
		}



		return "Supplier Updated";
	}

	@Override
	public String removeSupplier(String sId) {

		try {
			JdbcTemplate jdbcTemplate = new JdbcTemplate(dataSource);
			String str1="Delete from supplier where supplierId=?";
			jdbcTemplate.update(str1,sId);

		}
		catch(Exception e)
		{
			System.out.println("Exception- Sql exception "+e+" ");
			return "Not done";
		}

		return "Supplier removed";
	}

	@Override
	public String updateSupplier(String sId) {
		try {

			JdbcTemplate jdbcTemplate = new JdbcTemplate(dataSource);
			String str1="Update supplier set supplierrName=? where supplierId=?";
			jdbcTemplate.update(str1,"Abhish",sId);

		}
		catch(Exception e)
		{
			System.out.println("Exception- Sql exception "+e+" ");
			return "Not done";
		}


		return "Supplier Updated";
	}

}
