package com.amit.spring.security.web.entity;

import java.util.Collection;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Table(name = "role")
@Data
public class Role {
	public Role(String role,Collection<Privilege> privileges) {
		this.role = role;
		this.privileges=privileges;
	}

	public Role() {
		super();
	}

	
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "role_id")
	private Integer id;

	private String role;

	@ManyToMany(cascade=CascadeType.ALL , fetch=FetchType.EAGER)
	@JoinTable(name = "roles_privileges", joinColumns = @JoinColumn(name = "role_id", referencedColumnName = "role_id"), inverseJoinColumns = @JoinColumn(name = "privilege_id", referencedColumnName = "privilege_id"))
	private Collection<Privilege> privileges;

}
