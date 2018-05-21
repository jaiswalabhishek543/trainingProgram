package com.example.service;

import java.util.List;

import com.example.exception.MyException;
import com.example.model.RefMoney;

public interface RefServiceInterface {

	
	String addDenomination(Integer deno1) throws MyException;
	List<RefMoney> returnAll() throws MyException;
}
