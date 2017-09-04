package com.emids.springmvc.model;

import org.springframework.validation.Errors;
import org.springframework.validation.ValidationUtils;
import org.springframework.validation.Validator;

import com.emids.springmvc.model.Employee;

public class DropDownBoxValidator implements Validator{

	@Override
	public boolean supports(Class clazz) {
	   //just validate the Customer instances
	   return Employee.class.isAssignableFrom(clazz);
	}

	@Override
	public void validate(Object target, Errors errors) {

	   Employee emp = (Employee)target;

	   ValidationUtils.rejectIfEmptyOrWhitespace(errors, "designation", "required.designation");

	   if("NONE".equals(emp.getDepartment())){
		errors.rejectValue("department", "required.department");
	   }
	}
}