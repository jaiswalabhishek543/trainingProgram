package com.example.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.GeneratorType;

import lombok.Data;



@Entity
@Table(name = "customer")
public class Customer {
	
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	
	@Column(name = "customerId")
	private Integer customerId;
	@Column(name = "customerName")
	private String customerName;
	@Column(name = "customerAddress")
	private String customerAddress;
	@Column(name = "paymentMode")
	private String paymentMode;
	
	public Customer()
	{
		
	}
	
	public Customer(String customerName, String customerAddress, String paymentMode) {
		this.customerId = customerId;
		this.customerName = customerName;
		this.customerAddress = customerAddress;
		this.paymentMode = paymentMode;
	}




	public Integer getCustomerId() {
		return customerId;
	}
	public void setCustomerId(Integer customerId) {
		this.customerId = customerId;
	}
	public String getCustomerName() {
		return customerName;
	}
	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}
	public String getCustomerAddress() {
		return customerAddress;
	}
	public void setCustomerAddress(String customerAddress) {
		this.customerAddress = customerAddress;
	}
	public String getPaymentMode() {
		return paymentMode;
	}
	public void setPaymentMode(String paymentMode) {
		this.paymentMode = paymentMode;
	}

	@Override
	public String toString() {
		return "Customer [customerId=" + customerId + ", customerName=" + customerName + ", customerAddress="
				+ customerAddress + ", paymentMode=" + paymentMode + "]";
	}
	
	
	
	
	
	

}
