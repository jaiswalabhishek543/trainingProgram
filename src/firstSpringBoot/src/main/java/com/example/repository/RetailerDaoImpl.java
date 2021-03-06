package com.example.repository;

import java.sql.ResultSet;
import java.util.List;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.example.model.Customer;
import com.example.model.Goods;
import com.example.model.Supplier;
import com.example.service.RetailerServiceInterface;

/*
 * @abhi
 */
@Repository
public class RetailerDaoImpl implements RetailerDaoInterface {


	@Autowired
	private DataSource dataSource;
	
	
	/*private DataSource dataSource;

	public void setDataSource(DataSource dataSource) {
		this.dataSource = dataSource;
	}
*/
	
	
	/*
	 * 
	 * @see dao.RetailerDaoInterface#viewGoods()
	 */
	@Override
	public List<Goods> viewGoods() {
		List<Goods> gud = null;
		try {
			String sqlSelect = "select * from goods";
			JdbcTemplate jdbcTemplate = new JdbcTemplate(dataSource);
			gud = jdbcTemplate.query(sqlSelect, new BeanPropertyRowMapper(Goods.class));

		}

		catch (DataAccessException e) {
			System.out.println("Exception occured- Sql exception" + e);
			return null;
		}

		return gud;

	}

	/*
	 * 
	 * @see dao.RetailerDaoInterface#viewCustomer()
	 */
	@Override
	public List<Customer> viewCustomer() {
		List<Customer> customers = null;
		try {
			String sqlSelect = "select * from customer";
			JdbcTemplate jdbcTemplate = new JdbcTemplate(dataSource);
			customers = jdbcTemplate.query(sqlSelect, new BeanPropertyRowMapper(Customer.class));

		}

		catch (DataAccessException e) {
			System.out.println("Exception occured- Sql exception" + e);
			return null;
		}

		return customers;

	}

	/*
	 * 
	 * @see dao.RetailerDaoInterface#viewSupplier()
	 */
	@Override
	public List<Supplier> viewSupplier() {

		List<Supplier> supply1 = null;
		try {
			String sqlSelect = "select * from supplier";
			JdbcTemplate jdbcTemplate = new JdbcTemplate(dataSource);
			supply1 = jdbcTemplate.query(sqlSelect, new BeanPropertyRowMapper(Supplier.class));

		}

		catch (DataAccessException e) {
			System.out.println("Exception occured- Sql exception" + e);
			return null;
		}

		return supply1;

	}

	/*
	 * 
	 * @see dao.RetailerDaoInterface#addRetailer(java.lang.String, java.lang.String,
	 * java.lang.String)
	 */
	@Override
	public String addRetailer(String rId, String rName, String rAddr) {

		try {

			JdbcTemplate jdbcTemplate = new JdbcTemplate(dataSource);

			String str1 = "Insert into retailer (retailerId,retailerName,retailerAddress) values(?,?,?)";
			jdbcTemplate.update(str1, rId, rName, rAddr);

		} catch (Exception e) {
			System.out.println("Exception- Sql exception" + e + " ");
			return "Not done";
		}

		return "Retailer added";

	}

}
