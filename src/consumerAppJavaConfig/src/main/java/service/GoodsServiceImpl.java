package service;

import dao.GoodsDao;

/*
 * @abhi
 */
public class GoodsServiceImpl implements GoodsServiceInterface {

	private GoodsDao goods01;

	public void setGoods01(final GoodsDao goods01) {
		this.goods01 = goods01;
	}

	/*
	 * @see service.GoodsServiceInterface#addGoods(java.lang.String,
	 * java.lang.String, int, double)
	 */
	@Override
	public String addGoods(final String gId, final String gName, final int gQuant, final double gPrice) {

		return goods01.addGoods(gId, gName, gQuant, gPrice);
	}

	/*
	 * @see service.GoodsServiceInterface#removeGoods(java.lang.String)
	 */
	@Override
	public String removeGoods(final String gId) {

		return goods01.removeGoods(gId);
	}

	/*
	 * @see service.GoodsServiceInterface#orderGoods(java.lang.String)
	 */
	@Override
	public String orderGoods(final String gId) {

		return goods01.orderGoods(gId);
	}

	/*
	 * @see service.GoodsServiceInterface#updateGoods(java.lang.String)
	 */
	@Override
	public String updateGoods(final String gId) {

		return goods01.updateGoods(gId);
	}

}
