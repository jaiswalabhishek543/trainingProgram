package com.example.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

/*
 * @abhishek
 */
@Entity
@Table(name = "Bank_Denm")
@Data
public class Bank_Denm {

	@Id
	@Column(name = "bankId")
	private Integer bankId;

	@Column(name = "denomination")
	private Integer denomination;

	@Column(name = "noOfDenomination")
	private Integer noOfDenomination;

}
