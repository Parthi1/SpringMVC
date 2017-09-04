package com.emids.springmvc.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.emids.springmvc.dao.EmployeeDao;
import com.emids.springmvc.model.Employee;

@Service("employeeService")
@Transactional
public class EmployeeServiceImpl implements EmployeeService {

	@Autowired
	private EmployeeDao empDao;
	
	@Override
	public void save(Employee employee) {
		// TODO Auto-generated method stub
		
		empDao.save(employee);
		
	}
	
	@Override
	public List<Employee> getAllEmployee() {
		// TODO Auto-generated method stub
		
		return empDao.getAllEmployee();
		
	}
	
	@Override
	public Employee getEmpById(int id) {
		// TODO Auto-generated method stub
		
		return empDao.getEmpById(id);
		
	}
	
	@Override
	public void updateEmployee(Employee employee) {
		// TODO Auto-generated method stub
		Employee entity = empDao.getEmpById(employee.getId());
		 if(entity!=null){
		 entity.setFirstname(employee.getFirstname());
		 entity.setLastname(employee.getLastname());
		 entity.setEmail(employee.getEmail());
		 entity.setAge(employee.getAge());
		 entity.setBirthday(employee.getBirthday());
		 entity.setDesignation(employee.getDesignation());
		 entity.setDepartment(employee.getDepartment());
		 empDao.update(employee);

		 }
		
		empDao.update(employee);
	}
	
	@Override
	public void deleteEmpById(int id) {
		// TODO Auto-generated method stub
		
		 empDao.deleteEmpById(id);
		
	}
}
