package com.example.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

import lombok.Data;

@Entity
@Table(name = "Bank_Denm")
@Data
// @Scope("prototype")
public class Denomination extends BaseEntity {

	@Id
	@Column(name = "denomination")
	private Integer denomination;

	@NotNull
	@Column(name = "bankId")
	private Integer bankId;

	@Column(name = "noOfDenomination")
	private Integer noOfDenomination;

	public Denomination(Integer denomination, @NotNull Integer bankId, Integer noOfDenomination) {
		this.denomination = denomination;
		this.bankId = bankId;
		this.noOfDenomination = noOfDenomination;
	}

	public Denomination()
	{
		
	}
	
}
