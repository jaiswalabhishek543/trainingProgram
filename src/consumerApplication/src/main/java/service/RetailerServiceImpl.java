package service;

import java.sql.ResultSet;
import java.util.List;

import dao.RetailerDaoImpl;
import model.Customer;
import model.Goods;
import model.Supplier;

public class RetailerServiceImpl implements RetailerServiceInterface {

	private RetailerDaoImpl retailer01;
	
	public void setRetailer01(RetailerDaoImpl retailer01) {
		this.retailer01 = retailer01;
	}

	@Override
	public List<Goods> viewGoods() {
		
		return retailer01.viewGoods();
	}

	@Override
	public List<Customer> viewCustomer() {

		return retailer01.viewCustomer();
	}

	@Override
	public List<Supplier> viewSupplier() {

		return retailer01.viewSupplier();
	}

	@Override
	public String addRetailer(String rId, String rName, String rAddr) {
		
		return retailer01.addRetailer(rId, rName, rAddr);
	}

	
	


}
