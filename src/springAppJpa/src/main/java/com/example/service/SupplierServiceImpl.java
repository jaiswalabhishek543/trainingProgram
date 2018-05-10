package com.example.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.model.Supplier;
import com.example.repository.SupplierDaoInterface;

@Service
public class SupplierServiceImpl implements SupplierServiceInterface {

	@Autowired
	private SupplierDaoInterface supp;
	
	@Override
	public Supplier addSupplier(Supplier obj) {
		// TODO Auto-generated method stub
		supp.save(obj);
		return obj;
	}

	@Override
	public List<Supplier> viewAllSupplier() {
		// TODO Auto-generated method stub
		List<Supplier> sup1=(List<Supplier>) supp.findAll();
		return sup1;
	}

	@Override
	public Optional<Supplier> delete(Integer id1) {
		// TODO Auto-generated method stub
		
		Optional<Supplier> sup4=supp.findById(id1);
		supp.deleteById(id1);
		return sup4;
	}

	@Override
	public Supplier update(Integer id2) {
		// TODO Auto-generated method stub
		Optional<Supplier> sup4=supp.findById(id2);
		Supplier sup5=sup4.get();
		sup5.setSupplierAddress("Lucknow");
		return sup5;
	}
	
	

}
