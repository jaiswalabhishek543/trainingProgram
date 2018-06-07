package com.example.model;

import java.io.Serializable;

import lombok.Data;

@Data
public class Employee implements Serializable {

	private String name;
	private String empId;

}
