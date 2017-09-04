package com.emids.springmvc.service;

import java.util.List;

import com.emids.springmvc.model.Employee;

public interface EmployeeService {

	void save(Employee employee);

	List<Employee> getAllEmployee();

	Employee getEmpById(int id);

	void updateEmployee(Employee employee);

	void deleteEmpById(int id);
	
}
