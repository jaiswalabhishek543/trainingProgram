package com.example.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.model.Customer;
import com.example.model.Goods;
import com.example.repository.GoodsDaoInterface;

@Service
public class GoodsServiceImpl implements GoodsServiceInterface {

	@Autowired
	private GoodsDaoInterface guds;
	
	@Override
	public Goods addGoods(Goods gud) {
		// TODO Auto-generated method stub
		guds.save(gud);
		return gud;
	}

	@Override
	public Optional<Goods> removeGoods(Integer gId) {
		// TODO Auto-generated method stub
		Optional<Goods> gud2=guds.findById(gId);
		guds.deleteById(gId);
		
		return gud2;
	}

	@Override
	public Goods updateGoods(Integer gId) {
		// TODO Auto-generated method stub
		
		Optional<Goods> gud3=guds.findById(gId);
		Goods gud4=gud3.get();
		gud4.setGoodsPrice(1000);
	
		return gud4;
	}

	@Override
	public List<Goods> viewGud() {
		// TODO Auto-generated method stub
		
		List<Goods> gud5=(List<Goods>) guds.findAll();
		return gud5;
	}

	
	
	
	

}
