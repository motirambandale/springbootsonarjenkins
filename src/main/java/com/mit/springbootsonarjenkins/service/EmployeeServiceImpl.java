package com.mit.springbootsonarjenkins.service;

import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;

import com.mit.springbootsonarjenkins.entity.Employee;

@Service
public class EmployeeServiceImpl implements EmployeeService {

	@Override
	public List<Employee> getAllEmployees() {
	
		List<Employee> employees=Arrays.asList(new Employee(1, "Amol", 32344),new Employee(2, "Amit", 54333));
		return employees;
	}

}
