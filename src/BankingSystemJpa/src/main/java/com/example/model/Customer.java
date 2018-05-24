package com.example.model;
/*
 * @abhishek
 * 
 */

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

@Table(name = "customer")
@Entity
@Data
public class Customer extends BaseEntity{

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "customerId")
	private Integer customerId;

	@Column(name = "name")
	private String name;

	@Column(name = "pin")
	private String pin;

	@Column(name = "bankId")
	private Integer bankId;

	@OneToMany(cascade = CascadeType.ALL)
	@JoinColumn(name = "customerId", referencedColumnName = "customerId")
	private List<Account> listAccount;

	@OneToMany(cascade = CascadeType.ALL)
	@JoinColumn(name = "customerId", referencedColumnName = "customerId")
	private List<Transaction> listTransaction;

}
