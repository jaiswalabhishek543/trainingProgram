package model;

/*
 * @abhi
 */
public class Goods {

	private String goodsId;
	private String goodsName;
	private int goodsQuantity;
	private double goodsPrice;

	public String getGoodsId() {
		return goodsId;
	}

	public void setGoodsId(final String goodsId) {
		this.goodsId = goodsId;
	}

	public String getGoodsName() {
		return goodsName;
	}

	public void setGoodsName(final String goodsName) {
		this.goodsName = goodsName;
	}

	public int getGoodsQuantity() {
		return goodsQuantity;
	}

	public void setGoodsQuantity(final int goodsQuantity) {
		this.goodsQuantity = goodsQuantity;
	}

	public double getGoodsPrice() {
		return goodsPrice;
	}

	public void setGoodsPrice(final double goodsPrice) {
		this.goodsPrice = goodsPrice;
	}

	/*
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Goods [goodsId=" + goodsId + ", goodsName=" + goodsName + ", goodsQuantity=" + goodsQuantity
				+ ", goodsPrice=" + goodsPrice + "]";
	}

}
