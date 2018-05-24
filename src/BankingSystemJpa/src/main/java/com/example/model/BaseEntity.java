package com.example.model;

import javax.persistence.Column;
import javax.persistence.MappedSuperclass;

import org.springframework.data.annotation.Id;

import lombok.Data;

@MappedSuperclass
@Data
public class BaseEntity {

	@Column(name="userId")
	String userId;
}
