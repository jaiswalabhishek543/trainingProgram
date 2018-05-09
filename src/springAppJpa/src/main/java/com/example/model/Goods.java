package com.example.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/*
 * @abhi
 */

@Entity
@Table(name="goods")
public class Goods {

	/*
	 * Goods class
	 */
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="goodsId")
	private Integer goodsId;
	@Column(name="goodsName")
	private String goodsName;
	@Column(name="goodsQuantity")
	private int goodsQuantity;
	
	public Goods(String goodsName, int goodsQuantity, double goodsPrice) {
		this.goodsName = goodsName;
		this.goodsQuantity = goodsQuantity;
		this.goodsPrice = goodsPrice;
	}

	@Column(name="goodsPrice")
	private double goodsPrice;


	public Integer getGoodsId() {
		return goodsId;
	}

	public void setGoodsId(final Integer goodsId) {
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

	@Override
	public String toString() {
		return "Goods [goodsId=" + goodsId + ", goodsName=" + goodsName + ", goodsQuantity=" + goodsQuantity
				+ ", goodsPrice=" + goodsPrice + "]";
	}

}
