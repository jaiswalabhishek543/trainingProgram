package service;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import dao.GoodsDao;

public class GoodsServiceImpl implements GoodsServiceInterface {

	private GoodsDao goods01;
	
		
		

	public void setGoods01(GoodsDao goods01) {
		this.goods01 = goods01;
	}

	@Override
	public String addGoods(String gId, String gName, int gQuant, double gPrice) {
	
		return goods01.addGoods(gId, gName, gQuant, gPrice);
	}

	@Override
	public String removeGoods(String gId) {
		
		return goods01.removeGoods(gId);
	}

	@Override
	public String orderGoods(String gId) {
	
		return goods01.orderGoods(gId);
	}

	@Override
	public String updateGoods(String gId) {
		
		return goods01.updateGoods(gId);
	}

}
