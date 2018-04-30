package dao;

import java.sql.ResultSet;
import java.util.List;

import model.Customer;
import model.Goods;
import model.Supplier;

public interface RetailerDaoInterface {
	
	public String addRetailer(String rId,String rName,String rAddr);
	public List<Goods> viewGoods();
	public List<Customer> viewCustomer();
	public List<Supplier> viewSupplier();
	
	

}
