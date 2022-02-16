package com.ravindra.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.ravindra.data.Employee;
import com.ravindra.service.EmployeeService;

@RestController
public class EmpController {
	
	@Autowired
	private EmployeeService employeeService;
	
	@PostMapping("/emp")
	public Employee createEmp(@RequestBody Employee employee)
	{
		return employeeService.createEmp(employee);
	}
	
	@GetMapping("/emp")
	public Employee findByEmployeeId(@RequestParam("empId") String empId)
	{
		return employeeService.findByEmployeeId(empId);
	}
}