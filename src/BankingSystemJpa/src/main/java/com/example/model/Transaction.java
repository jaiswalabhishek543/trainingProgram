package com.example.model;

import java.math.BigDecimal;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.springframework.stereotype.Component;

import lombok.Data;

/*
 * @abhishek
 */
@Entity
@Table(name = "transaction")
@Data
@Component
public class Transaction {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "transactionId")
	private Integer transactionId;

	@Column(name = "customerId")
	private Integer customerId;

	@Column(name = "accountId")
	private Integer accountId;

	@Column(name = "amount")
	private BigDecimal amount;

	@Column(name = "transactionType")
	private String transactionType;

}
