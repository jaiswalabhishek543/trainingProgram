package com.example.model;

/*
 * @abhishek
 */
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Table(name = "RefMoney")
@Data
public class RefMoney {
	@Id
	@Column(name = "denomination")
	private Integer denomination;

}
