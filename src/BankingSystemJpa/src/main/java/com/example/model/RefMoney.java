package com.example.model;

/*
 * @abhishek
 */
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import org.springframework.context.annotation.Configuration;

import lombok.Data;

@Entity
@Table(name = "RefMoney")
@Data
public class RefMoney extends BaseEntity {
	@Id
	@Column(name = "denomination")
	private Integer denomination;

}
