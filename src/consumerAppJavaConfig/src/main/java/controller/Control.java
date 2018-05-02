package controller;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import model.Customer;
import model.Goods;
import model.Supplier;
import service.CustomerServiceImpl;
import service.GoodsServiceImpl;
import service.RetailerServiceImpl;
import service.SupplierServiceImpl;

public class Control {

	// Instantiating objects
	ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
	CustomerServiceImpl custom = (CustomerServiceImpl) context.getBean(CustomerServiceImpl.class, "customerService");
	GoodsServiceImpl gud = (GoodsServiceImpl) context.getBean(GoodsServiceImpl.class, "goodsDaoSer");
	SupplierServiceImpl sup = (SupplierServiceImpl) context.getBean(SupplierServiceImpl.class, "serv");
	RetailerServiceImpl ret = (RetailerServiceImpl) context.getBean(RetailerServiceImpl.class, "reta2");

	/*
	 * Customer class calling methods from Testing class
	 */
	public String addCustomer(final String cId, final String cName, final String cAddress, final String payMode) {

		return custom.addCustomer(cId, cName, cAddress, payMode);
	}

	public String removeCustomer(final String cId) {

		return custom.removeCustomer(cId);
	}

	public String updateCustomer(final String cId) {

		return custom.updateCustomer(cId);
	}

	/*
	 * Goods class calling methods from Testing class
	 */
	public String addGoods(final String gId, final String gName, final int gQuant, final double gPrice) {

		return gud.addGoods(gId, gName, gQuant, gPrice);
	}

	public String removeGoods(final String gId) {

		return gud.removeGoods(gId);
	}

	public String updateGoods(final String gId) {

		return gud.updateGoods(gId);
	}

	/*
	 * Retailer class calling methods from Testing class
	 */
	public List<Goods> viewGoods() {

		return ret.viewGoods();
	}

	public List<Customer> viewCustomer() {

		return ret.viewCustomer();
	}

	public List<Supplier> viewSupplier() {

		return ret.viewSupplier();
	}

	public String addRetailer(final String rId, final String rName, final String rAddr) {

		return ret.addRetailer(rId, rName, rAddr);
	}

	/*
	 * 
	 * Supply class calling methods from Testing class
	 */

	public String addSupplier(final String sId, final String sName, final String sAddress, final int qunat,
			final String orderId, final int amount1) {

		return sup.addSupplier(sId, sName, sAddress, qunat, orderId, amount1);
	}

	public String removeSupplier(final String sId) {

		return sup.removeSupplier(sId);
	}

	public String updateSupplier(final String sId) {

		return sup.updateSupplier(sId);
	}

}
