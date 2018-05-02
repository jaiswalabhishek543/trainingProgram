package service;

/*
 * @abhi
 */
public interface GoodsServiceInterface {

	// Methods to be implemented
	public String addGoods(String gId, String gName, int gQuant, double gPrice);

	public String removeGoods(String gId);

	public String orderGoods(String gId);

	public String updateGoods(String gId);

}
