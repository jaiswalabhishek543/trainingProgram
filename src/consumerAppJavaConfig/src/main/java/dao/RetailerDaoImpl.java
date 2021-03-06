package dao;

import java.util.List;

import javax.sql.DataSource;

import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;

import model.Customer;
import model.Goods;
import model.Supplier;

/*
 * @abhi
 */
public class RetailerDaoImpl implements RetailerDaoInterface {

	private DataSource dataSource;

	public void setDataSource(DataSource dataSource) {
		this.dataSource = dataSource;
	}

	/*
	 * @see dao.RetailerDaoInterface#viewGoods()
	 */
	@Override
	public List<Goods> viewGoods() {
		List<Goods> gud = null;
		try {
			final String sqlSelect = "select * from goods";
			final JdbcTemplate jdbcTemplate = new JdbcTemplate(dataSource);
			gud = jdbcTemplate.query(sqlSelect, new BeanPropertyRowMapper(Goods.class));

		}

		catch (DataAccessException e) {
			System.out.println("Exception occured- Sql exception" + e);
			return null;
		}

		return gud;

	}

	/*
	 * @see dao.RetailerDaoInterface#viewCustomer()
	 */
	@Override
	public List<Customer> viewCustomer() {
		List<Customer> customers = null;
		try {
			final String sqlSelect = "select * from customer";
			final JdbcTemplate jdbcTemplate = new JdbcTemplate(dataSource);
			customers = jdbcTemplate.query(sqlSelect, new BeanPropertyRowMapper(Customer.class));

		}

		catch (DataAccessException e) {
			System.out.println("Exception occured- Sql exception" + e);
			return null;
		}

		return customers;

	}

	/*
	 * @see dao.RetailerDaoInterface#viewSupplier()
	 */
	@Override
	public List<Supplier> viewSupplier() {

		List<Supplier> supply1 = null;
		try {
			final String sqlSelect = "select * from supplier";
			final JdbcTemplate jdbcTemplate = new JdbcTemplate(dataSource);
			supply1 = jdbcTemplate.query(sqlSelect, new BeanPropertyRowMapper(Supplier.class));

		}

		catch (DataAccessException e) {
			System.out.println("Exception occured- Sql exception" + e);
			return null;
		}

		return supply1;

	}

	/*
	 * @see dao.RetailerDaoInterface#addRetailer(java.lang.String, java.lang.String,
	 * java.lang.String)
	 */
	@Override
	public String addRetailer(String rId, String rName, String rAddr) {

		try {

			final JdbcTemplate jdbcTemplate = new JdbcTemplate(dataSource);

			final String str1 = "Insert into retailer (retailerId,retailerName,retailerAddress) values(?,?,?)";
			jdbcTemplate.update(str1, rId, rName, rAddr);

		} catch (Exception e) {
			System.out.println("Exception- Sql exception" + e + " ");
			return "Not done";
		}

		return "Retailer added";

	}

}
