package com.emids.springmvc.dao;

import java.util.List;

import com.emids.springmvc.model.Employee;

public interface EmployeeDao {

	void save(Employee employee);

	List<Employee> getAllEmployee();

	Employee getEmpById(int id);

	void update(Employee employee);

	void deleteEmpById(int id);

}
