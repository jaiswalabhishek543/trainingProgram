package com.example.model;

import java.math.BigDecimal;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

/*
 * @abhishek
 */
@Entity
@Table(name = "ATM")
@Data
public class ATM {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "ATMId")
	private Integer ATMId;

	@Column(name = "amount")
	private BigDecimal amount;

	@Column(name = "bankId")
	private Integer bankId;

}
