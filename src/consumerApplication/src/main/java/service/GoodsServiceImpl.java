package service;

import dao.GoodsDao;

public class GoodsServiceImpl implements GoodsServiceInterface {

	
	GoodsDao goodsObj;

	@Override
	public String addGoods(String gId, String gName, int gQuant, double gPrice) {
	
		return goodsObj.addGoods(gId, gName, gQuant, gPrice);
	}

	@Override
	public String removeGoods(String gId) {
		
		return goodsObj.removeGoods(gId);
	}

	@Override
	public String orderGoods(String gId) {
	
		return goodsObj.orderGoods(gId);
	}

	@Override
	public String updateGoods(String gId) {
		
		return goodsObj.updateGoods(gId);
	}

}
