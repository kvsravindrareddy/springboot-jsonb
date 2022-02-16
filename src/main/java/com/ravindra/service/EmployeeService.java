package com.ravindra.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ravindra.data.Employee;
import com.ravindra.entity.EmployeeEntity;
import com.ravindra.repo.EmployeeRepo;
import com.ravindra.transformation.EmployeeTransform;

@Service
public class EmployeeService {
	
	@Autowired
	private EmployeeRepo employeeRepo;

	@Autowired
	private EmployeeTransform employeeTransform;
	
	public Employee createEmp(Employee employee) {
		EmployeeEntity employeeEntity = employeeRepo.save(employeeTransform.empToEntity(employee));
		return employeeTransform.empEntityToEmp(employeeEntity);
	}

	public Employee findByEmployeeId(String empId) {
		Optional<EmployeeEntity> empOpt = employeeRepo.findByEmpId(empId);
		Employee employee = null;
		if(empOpt.isPresent())
		{
			employee = employeeTransform.empEntityToEmp(empOpt.get());
		}
		return employee;
	}

}
