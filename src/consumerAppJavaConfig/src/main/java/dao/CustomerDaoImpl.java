package dao;

import javax.sql.DataSource;

import org.springframework.jdbc.core.JdbcTemplate;

/*
 * @abhi
 */
public class CustomerDaoImpl implements CustomerDao {

	private DataSource dataSource;

	public void setDataSource(final DataSource dataSource) {
		this.dataSource = dataSource;
	}

	/*
	 * @see dao.CustomerDao#addCustomer(java.lang.String, java.lang.String,
	 * java.lang.String, java.lang.String)
	 */
	@Override
	public String addCustomer(final String cId, final String cName, final String cAddress, final String payMode) {

		try {

			final JdbcTemplate jdbcTemplate = new JdbcTemplate(dataSource);

			final String str1 = "Insert into customer (customerId,customerName,customerAddress,paymentMode)values(?,?,?,?)";
			jdbcTemplate.update(str1, cId, cName, cAddress, payMode);

		} catch (Exception e) {
			System.out.println("Exception- Sql exception" + e);
			return "Not done";
		}

		return "Customer added";
	}

	/*
	 * @see dao.CustomerDao#removeCustomer(java.lang.String)
	 */
	@Override
	public String removeCustomer(String cId) {
		try {
			final JdbcTemplate jdbcTemplate = new JdbcTemplate(dataSource);
			String str1 = "Delete from customer where customerId=?";
			jdbcTemplate.update(str1, cId);

		} catch (Exception e) {
			System.out.println("Exception- Sql exception " + e + " ");
			return "Not done";
		}

		return "Customer removed";
	}

	/*
	 * @see dao.CustomerDao#updateCustomer(java.lang.String)
	 */
	@Override
	public String updateCustomer(String cId) {

		try {

			final JdbcTemplate jdbcTemplate = new JdbcTemplate(dataSource);
			String str1 = "Update customer set customerName=? where customerId=?";
			jdbcTemplate.update(str1, "sun", cId);

		} catch (Exception e) {
			System.out.println("Exception- Sql exception " + e + " ");
			return "Not done";
		}
		return "Customer updated";
	}

}
