package dao;

import javax.sql.DataSource;

import org.springframework.jdbc.core.JdbcTemplate;

import controller.CreateConnection;
import service.GoodsServiceInterface;

public class GoodsDao implements GoodsServiceInterface {

	CreateConnection conObj;
		@Override
	public  String addGoods(String gId, String gName, int gQuant, double gPrice) {
		try {
			DataSource datas=conObj.connec();
			JdbcTemplate jdbcTemplate = new JdbcTemplate(datas);
			String str1="Insert into goods (goodsId,goodsName,goodsQuantity,goodsPrice)values(gId,gName,gQuant,gPrice)";
			jdbcTemplate.update(str1);
		}
		catch(Exception e)
		{
			System.out.println("Exception- Sql exception");
		}
		
		return "Goods added";
	}

	@Override
	public String removeGoods(String gId) {
		
		//Remove from goods where(goodsId=gId) 
		return "Removed";
	}

	@Override
	public String orderGoods(String gId) {
		
		return null;
	}

	@Override
	public String updateGoods(String gId) {
		
		//
		return null;
	}

}
