package com.example.service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.exceptions.MyException;
import com.example.model.Customer;
import com.example.repository.CustomerDaoInt;

@Service
public class CustomerServiceImpl implements CustomerServiceInterface {

	@Autowired
	private CustomerDaoInt cust;

	@Override
	public Customer addCustomer(Customer obj1) {
		// TODO Auto-generated method stub
		Customer obj = cust.save(obj1);
		return obj;
	}

	@Override
	public List<Customer> viewAllCustomer() {
		// TODO Auto-generated method stub

		List<Customer> cust2 = (List<Customer>) cust.findAll();
		return cust2;
	}

	@Override
	public Optional<Customer> delete(Integer id1) {
		// TODO Auto-generated method stub
		Optional<Customer> custo = cust.findById(id1);
		cust.deleteById(id1);

		return custo;
	}

	@Override
	public Customer update(Integer id2) throws MyException {
		// TODO Auto-generated method stub
		Optional<Customer> cust1 = cust.findById(id2);

		if (cust1.isPresent()) {

			Customer cust2 = cust1.get();
			cust2.setPaymentMode("Cash");
			cust.save(cust2);
			return cust2;
		}

		else {
			throw new MyException(" Id not found ");
		}

	}

	@Override
	public Customer del(Integer id2) throws MyException {
		// TODO Auto-generated method stub

		Customer cust16;
		Optional<Customer> cust5;
		cust5 = cust.findById(id2);

		if (cust5.isPresent()) {

			cust16 = cust5.get();

			cust.deleteById(id2);

			return cust16;
		} else {
			throw new MyException("Id not found");
		}
	}

	@Override
	public HashMap<Integer, String> del2(List<Integer> lisd) {
		// TODO Auto-generated method stub

		HashMap<Integer, String> map1 = new HashMap<>();
		for (Integer in1 : lisd) {
			Optional<Customer> cuom = cust.findById(in1);
			if (cuom.isPresent()) {
				Customer com1 = cuom.get();
				map1.put(com1.getCustomerId(), " Id number Deleted ");
				cust.delete(com1);

			} else {
				map1.put(in1, " Id not found in database ");

			}

		}

		return map1;
	}

	@Override
	public List<Customer> update2(List<Customer> lis2) throws MyException {
		// TODO Auto-generated method stub
		List<Customer> cuo8 = new ArrayList<>();
		for (Customer cuo : lis2) {
			Optional<Customer> cuo1 = cust.findById(cuo.getCustomerId());
			if (cuo1.isPresent()) {
				Customer cuo2 = cuo1.get();
				cuo2.setCustomerAddress(cuo.getCustomerAddress());
				cuo2.setCustomerId(cuo.getCustomerId());
				cuo2.setCustomerName(cuo.getCustomerName());
				cuo2.setPaymentMode(cuo.getPaymentMode());

				cust.save(cuo2);
				cuo8.add(cuo2);
			}

		}

		return cuo8;
	}

}
