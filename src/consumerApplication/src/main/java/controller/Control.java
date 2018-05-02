package controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import dao.CustomerDaoImpl;
import model.Customer;
import model.Goods;
import model.Supplier;
import service.CustomerServiceImpl;
import service.GoodsServiceImpl;
import service.RetailerServiceImpl;
import service.SupplierServiceImpl;
/*
 * @abhi
 * 
 */
public class Control {

	//Getting objects of classes
	
	ApplicationContext app=new ClassPathXmlApplicationContext("applicationContext.xml");
	CustomerServiceImpl custom=(CustomerServiceImpl) app.getBean("custom1");
	GoodsServiceImpl gud=(GoodsServiceImpl) app.getBean("gud3");
	RetailerServiceImpl ret=(RetailerServiceImpl) app.getBean("retail1");
	SupplierServiceImpl sup=(SupplierServiceImpl) app.getBean("supply1");

	//Customer class methods using for getting calls from Testing class
	public String addCustomer(final String cId,final String cName,final String cAddress,final String payMode) {

		return custom.addCustomer(cId, cName, cAddress, payMode);
	}


	public String removeCustomer(final String cId) {

		return custom.removeCustomer(cId);
	}


	public String updateCustomer(final String cId) {

		return custom.updateCustomer(cId);
	}

	
	//Goods class methods using for getting calls from Testing class
	public String addGoods(final String gId,final String gName,final int gQuant,final double gPrice) {

		return gud.addGoods(gId, gName, gQuant, gPrice);
	}


	public String removeGoods(final String gId) {

		return gud.removeGoods(gId);
	}





	public String updateGoods(final String gId) {

		return gud.updateGoods(gId);
	}

	//Retailer class methods using for getting calls from Testing class
	public List<Goods> viewGoods() {

		return ret.viewGoods();
	}


	public List<Customer> viewCustomer() {

		return ret.viewCustomer();
	}


	public List<Supplier> viewSupplier() {

		return ret.viewSupplier();
	}

	public String addRetailer(final String rId,final String rName,final String rAddr) {

		return ret.addRetailer(rId, rName, rAddr);
	}

	
	//Supply class methods using for getting calls from Testing class
	
	public String addSupplier(final String sId, final String sName,final  String sAddress,final int qunat,final String orderId,final int amount1) {

		return sup.addSupplier(sId, sName, sAddress, qunat, orderId, amount1);
	}

	
	public String removeSupplier(final String sId) {

		return sup.removeSupplier(sId);
	}


	public String updateSupplier(final String sId) {

		return sup.updateSupplier(sId);
	}







}
