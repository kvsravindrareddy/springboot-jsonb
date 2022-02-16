package com.ravindra.transformation;

import org.mapstruct.Mapper;

import com.ravindra.data.Employee;
import com.ravindra.entity.EmployeeEntity;

@Mapper
public interface EmployeeTransform {
	EmployeeEntity empToEntity(Employee employee);
	
	Employee empEntityToEmp(EmployeeEntity employeeEntity);
}