package service;

import java.util.List;

import dao.RetailerDaoImpl;
import model.Customer;
import model.Goods;
import model.Supplier;

/*
 * @abhi
 */
public class RetailerServiceImpl implements RetailerServiceInterface {

	private RetailerDaoImpl retailer01;

	public void setRetailer01(final RetailerDaoImpl retailer01) {
		this.retailer01 = retailer01;
	}

	/*
	 * @see service.RetailerServiceInterface#viewGoods()
	 */
	@Override
	public List<Goods> viewGoods() {

		return retailer01.viewGoods();
	}

	/*
	 * @see service.RetailerServiceInterface#viewCustomer()
	 */
	@Override
	public List<Customer> viewCustomer() {

		return retailer01.viewCustomer();
	}

	/*
	 * @see service.RetailerServiceInterface#viewSupplier()
	 */
	@Override
	public List<Supplier> viewSupplier() {

		return retailer01.viewSupplier();
	}

	/*
	 * @see service.RetailerServiceInterface#addRetailer(java.lang.String,
	 * java.lang.String, java.lang.String)
	 */
	@Override
	public String addRetailer(final String rId, final String rName, String rAddr) {

		return retailer01.addRetailer(rId, rName, rAddr);
	}

}
