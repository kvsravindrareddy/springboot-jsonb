package com.ravindra.data;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class Employee {
	private String empId;
	private String empName;
	private double salary;
	private Address address;
}
