package com.example.model;

import java.math.BigDecimal;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import lombok.Data;

/*
 * @abhishek
 * 
 */
@Table(name = "bank")
@Entity
@Data
public class Bank {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)

	@Column(name = "bankId")
	private Integer bankId;

	@Column(name = "amount")
	private BigDecimal amount;

	@OneToMany(cascade = CascadeType.ALL)
	@JoinColumn(name = "bankId", referencedColumnName = "bankId")
	private List<Customer> listCustomer;

	@OneToMany(cascade = CascadeType.ALL)
	@JoinColumn(name = "bankId", referencedColumnName = "bankId")
	private List<ATM> listATM;

	@OneToMany(cascade = CascadeType.ALL)
	@JoinColumn(name = "bankId", referencedColumnName = "bankId")
	private List<Account> listAccount;
 
	
	public Bank()
	{
		
	}

}
