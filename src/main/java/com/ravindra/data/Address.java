package com.ravindra.data;

import java.io.Serializable;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class Address implements Serializable {
	private static final long serialVersionUID = -6931912742305419409L;
	private String street;
	private String state;
	private String city;
	private String country;
	private String zipCode;
}