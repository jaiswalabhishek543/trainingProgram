package dao;

import java.util.List;

import model.Customer;
import model.Goods;
import model.Supplier;

/*
 * @abhi
 */
public interface RetailerDaoInterface {
	// Methods to be implemented
	public String addRetailer(String rId, String rName, String rAddr);

	public List<Goods> viewGoods();

	public List<Customer> viewCustomer();

	public List<Supplier> viewSupplier();

}
