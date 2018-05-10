package com.example.service;

import java.util.List;
import java.util.Optional;

import com.example.model.Goods;

public interface GoodsServiceInterface {
	
	
	
	// Methods to be implemented
	public Goods addGoods(Goods gud);
	public Optional<Goods> removeGoods(Integer gId);
	public Goods updateGoods(Integer gId);
	public List<Goods> viewGud();

}
