package com.example.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Table(name = "Ref_Atm_Denm")
@Data
public class RefATMDenm extends BaseEntity{

	public RefATMDenm(Integer denomination, Integer noOfDenomination, Integer aTMId) {
		this.denomination = denomination;
		this.noOfDenomination = noOfDenomination;
		ATMId = aTMId;
	}

	public RefATMDenm() {
	}

	@Id
	@Column(name = "denomination")
	private Integer denomination;

	@Column(name = "noOfDenomination")
	private Integer noOfDenomination;

	@Column(name = "ATMId")
	private Integer ATMId;
}
