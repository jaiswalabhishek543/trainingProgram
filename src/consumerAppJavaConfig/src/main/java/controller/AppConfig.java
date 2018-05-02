package controller;

import javax.sql.DataSource;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

import dao.CustomerDaoImpl;
import dao.GoodsDao;
import dao.RetailerDaoImpl;
import dao.SupplierDaoImpl;
import service.CustomerServiceImpl;
import service.GoodsServiceImpl;
import service.RetailerServiceImpl;
import service.SupplierServiceImpl;

/*
 * @abhi
 */
@Configuration
public class AppConfig {

	@Bean
	public DataSource datasource() {
		DriverManagerDataSource datasource = new DriverManagerDataSource();
		final String URL = "jdbc:mysql://localhost/dbcustom";
		final String username = "root";
		final String password = "root";
		final String driver = "com.mysql.jdbc.Driver";

		datasource.setUrl(URL);
		datasource.setUsername(username);
		datasource.setPassword(password);
		datasource.setDriverClassName(driver);

		return datasource;

	}

	@Bean(name = "customerDao")
	public CustomerDaoImpl customerDao() {
		final CustomerDaoImpl customerDao = new CustomerDaoImpl();
		customerDao.setDataSource(datasource());
		return customerDao;

	}

	@Bean(name = "customerService")
	public CustomerServiceImpl customerSer() {
		final CustomerServiceImpl customerService = new CustomerServiceImpl();
		customerService.setCustomer01(customerDao());

		return customerService;

	}

	@Bean(name = "goodsDao1")
	public GoodsDao goodsDao() {
		final GoodsDao goodsDao1 = new GoodsDao();
		goodsDao1.setDataSource(datasource());
		return goodsDao1;

	}

	@Bean(name = "goodsDaoSer")
	public GoodsServiceImpl goodsSer() {
		final GoodsServiceImpl goodsDaoSer = new GoodsServiceImpl();
		goodsDaoSer.setGoods01(goodsDao());
		return goodsDaoSer;
	}

	@Bean(name = "supply")
	public SupplierDaoImpl supply1() {
		final SupplierDaoImpl supply = new SupplierDaoImpl();
		supply.setDataSource(datasource());
		return supply;

	}

	@Bean(name = "serv")
	public SupplierServiceImpl supply2() {
		final SupplierServiceImpl serv = new SupplierServiceImpl();
		serv.setSupply01(supply1());
		return serv;
	}

	@Bean(name = "reta")
	public RetailerDaoImpl retail1() {
		final RetailerDaoImpl reta = new RetailerDaoImpl();
		reta.setDataSource(datasource());
		return reta;
	}

	@Bean(name = "reta2")
	public RetailerServiceImpl retail2() {
		final RetailerServiceImpl reta2 = new RetailerServiceImpl();
		reta2.setRetailer01(retail1());
		return reta2;
	}

}
