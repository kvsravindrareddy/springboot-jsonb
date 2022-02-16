package com.ravindra.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.Type;
import org.hibernate.annotations.TypeDef;

import com.ravindra.data.Address;
import com.vladmihalcea.hibernate.type.json.JsonBinaryType;

import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name="emp_new_tb")
@Setter
@Getter
@TypeDef(name = "jsonb", typeClass = JsonBinaryType.class)
public class EmployeeEntity implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 6988148420519480840L;
	@Id
	@GeneratedValue
	private Long id;
	private String empId;
	private String empName;
	private double salary;
	@Column(columnDefinition = "jsonb")
	@Type(type = "jsonb")
	private Address address;
}