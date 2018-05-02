package dao;

import javax.sql.DataSource;

import org.springframework.jdbc.core.JdbcTemplate;

/*
 * @abhi
 */
public class SupplierDaoImpl implements SupplierDaoInterface {

	private DataSource dataSource;

	public void setDataSource(final DataSource dataSource) {
		this.dataSource = dataSource;
	}

	/*
	 * @see dao.SupplierDaoInterface#addSupplier(java.lang.String, java.lang.String,
	 * java.lang.String, int, java.lang.String, int)
	 */
	@Override
	public String addSupplier(final String sId, final String sName, final String sAddress, final int qunat,
			final String orderId, final int amount1) {

		try {

			final JdbcTemplate jdbcTemplate = new JdbcTemplate(dataSource);

			final String str1 = "Insert into supplier (supplierId,supplierName,supplierAddress,quantityOrder,orderId,amount)values(?,?,?,?,?,?)";
			jdbcTemplate.update(str1, sId, sName, sAddress, qunat, orderId, amount1);

		} catch (Exception e) {
			System.out.println("Exception- Sql exception " + e + " ");
			return "Not done";
		}

		return "Supplier Updated";
	}

	/*
	 * @see dao.SupplierDaoInterface#removeSupplier(java.lang.String)
	 */
	@Override
	public String removeSupplier(String sId) {

		try {
			final JdbcTemplate jdbcTemplate = new JdbcTemplate(dataSource);
			final String str1 = "Delete from supplier where supplierId=?";
			jdbcTemplate.update(str1, sId);

		} catch (Exception e) {
			System.out.println("Exception- Sql exception " + e + " ");
			return "Not done";
		}

		return "Supplier removed";
	}

	/*
	 * @see dao.SupplierDaoInterface#updateSupplier(java.lang.String)
	 */
	@Override
	public String updateSupplier(String sId) {
		try {

			final JdbcTemplate jdbcTemplate = new JdbcTemplate(dataSource);
			final String str1 = "Update supplier set supplierName=? where supplierId=?";
			jdbcTemplate.update(str1, "Abhish", sId);

		} catch (Exception e) {
			System.out.println("Exception- Sql exception " + e + " ");
			return "Not done";
		}

		return "Supplier Updated";
	}

}
