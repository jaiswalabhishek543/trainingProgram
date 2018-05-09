package com.example.repository;

import org.springframework.data.repository.CrudRepository;

import com.example.model.Goods;

public interface GoodsDaoInterface extends CrudRepository<Goods, Integer> {

}
