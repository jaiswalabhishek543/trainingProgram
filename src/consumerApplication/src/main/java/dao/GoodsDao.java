package dao;

import javax.sql.DataSource;

import org.springframework.jdbc.core.JdbcTemplate;

/*
 * @abhi	
 */
public class GoodsDao implements GoodsDaoInterface {

	private DataSource dataSource;

	public void setDataSource(DataSource dataSource) {
		this.dataSource = dataSource;
	}

	/*
	 * 
	 * @see dao.GoodsDaoInterface#addGoods(java.lang.String, java.lang.String, int,
	 * double)
	 */

	@Override
	public String addGoods(String gId, String gName, int gQuant, double gPrice) {

		try {
			String sqlInsert = "Insert into goods (goodsId,goodsName,goodsQuantity,goodsPrice) values (?,?,?,?)";
			JdbcTemplate jdbcTemplate = new JdbcTemplate(dataSource);
			jdbcTemplate.update(sqlInsert, gId, gName, gQuant, gPrice);
		}

		catch (Exception e) {
			System.out.println("Exception- Sql exception" + e);
			return "Not done";
		}

		return "Goods added";
	}

	/*
	 * @see dao.GoodsDaoInterface#removeGoods(java.lang.String)
	 */
	@Override
	public String removeGoods(String gId) {

		try {

			JdbcTemplate jdbcTemplate = new JdbcTemplate(dataSource);
			String str1 = "Delete from goods where goodsId=?";
			jdbcTemplate.update(str1, gId);
		} catch (Exception e) {
			System.out.println("Exception- Sql exception");
			return "Not done";
		}

		return "Removed";
	}

	/*@Override
	public String orderGoods(String gId) {

		return null;
	}
*/
	/*
	 * 
	 * @see dao.GoodsDaoInterface#updateGoods(java.lang.String)
	 */
	@Override
	public String updateGoods(String gId) {
		try {

			JdbcTemplate jdbcTemplate = new JdbcTemplate(dataSource);
			String str1 = "Update goods set goodsQuantity=? where goodsId=?";
			jdbcTemplate.update(str1, 100, gId);
		} catch (Exception e) {
			System.out.println("Exception- Sql exception " + e + " ");
			return "Not done";
		}

		return "Updated goods";
	}

}
