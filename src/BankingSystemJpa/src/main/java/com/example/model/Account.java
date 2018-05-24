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
 */
@Entity
@Table(name = "account")
@Data
public class Account extends BaseEntity{
	public Account() {

	}

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "accountId")
	private Integer accountId;

	@Column(name = "customerId")
	private Integer customerId;

	@Column(name = "amount")
	private BigDecimal amount;

	@Column(name = "bankId")
	private Integer bankId;

	@OneToMany(cascade = CascadeType.ALL)
	@JoinColumn(name = "accountId", referencedColumnName = "accountId")
	private List<Transaction> listTransaction;

}
