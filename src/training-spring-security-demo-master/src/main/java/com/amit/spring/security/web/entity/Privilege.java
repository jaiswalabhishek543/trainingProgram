package com.amit.spring.security.web.entity;

import java.util.Collection;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

import lombok.Data;

@Data
@Entity
public class Privilege {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "privilege_id")
	private Integer id;

	private String name;
	
	public Privilege(String name)
	{
		this.name=name;
	}
	
	public Privilege() {
		// TODO Auto-generated constructor stub
	}

	@ManyToMany(mappedBy = "privileges")
	private Collection<Role> roles;

}
