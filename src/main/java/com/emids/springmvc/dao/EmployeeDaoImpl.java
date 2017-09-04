package com.emids.springmvc.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.emids.springmvc.model.Employee;
import com.emids.springmvc.util.HibernateUtil;

@Repository("employeeDao")
public class EmployeeDaoImpl implements EmployeeDao{

	@Autowired
	private HibernateUtil hibernateUtil;
	
	@Override
	public void save(Employee employee) {
		// TODO Auto-generated method stub
		hibernateUtil.create(employee);	
	}
	
	@Override
	public List<Employee> getAllEmployee() {
		// TODO Auto-generated method stub
		return hibernateUtil.getAllEmployee();	
	}
	
	@Override
	public Employee getEmpById(int id) {
		// TODO Auto-generated method stub
		return hibernateUtil.getEmpById(id);	
	}
	
	@Override
	public void update(Employee employee) {
		// TODO Auto-generated method stub
		hibernateUtil.update(employee);	
	}
	
	@Override
	public void deleteEmpById(int id) {
		// TODO Auto-generated method stub
		 hibernateUtil.deleteEmpById(id);	
	}
	
}
