package com.emids.springmvc.controller;

import java.util.ArrayList;
import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.validation.Validator;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.emids.springmvc.model.Employee;
import com.emids.springmvc.service.EmployeeService;

@Controller
@RequestMapping("/")
public class EmployeeController {
	

	@Autowired
	private EmployeeService empService;

	@RequestMapping(method = RequestMethod.GET)
	public String sayHello(ModelMap model) {
		model.addAttribute("greeting", "Employee Details");
		return "welcome";
	}

	@RequestMapping(value = "/empform", method = RequestMethod.GET)
	public String sayHelloAgain(ModelMap model) {
		model.addAttribute("employee", new Employee());
		return "empform";
	}

	@RequestMapping(value = "/save", method = RequestMethod.POST)
	public String saveEmployeeAction( @ModelAttribute("employee") Employee employee, BindingResult bindingResult,
			ModelMap model) {

		empService.save(employee);
		if (bindingResult.hasErrors()) {
			model.addAttribute("errormessage", "Registration failed due to bussiness logic");
			return "redirect:/empform";
		} else {
			model.addAttribute("successmessage", "Registration Done Successfully");
			return "redirect:/viewform";
		}
		
	}

	@RequestMapping(value = "/viewform", method = RequestMethod.GET)
	public String getAllEmployee(ModelMap model) {

		List<Employee> empList = empService.getAllEmployee();

		model.addAttribute("emplist", empList);
		return "viewform";
	}

	@RequestMapping(value = "/editemp/{id}")
	public String edit(@PathVariable int id, ModelMap model) {
		Employee employee = empService.getEmpById(id);
		model.addAttribute("employee", employee);
		return "editform";
	}

	@RequestMapping(value = "/editsave", method = RequestMethod.POST)
	public String editSaveEmployeeAction(@ModelAttribute("employee") Employee employee,
			BindingResult bindingResult, ModelMap model) {

		empService.updateEmployee(employee);

		if (bindingResult.hasErrors()) {
			model.addAttribute("errormessage", "Updatation failed due to bussiness logic");
			employee = empService.getEmpById(employee.getId());
			model.addAttribute("employee", employee);
			return "redirect:/editform";
		} else {
			model.addAttribute("successmessage", "Updation Done Successfully");
			return "redirect:/viewform";
		}
	}

	@RequestMapping(value = "/deleteemp/{id}")
	public String deleteEmployee(@PathVariable int id) {
		empService.deleteEmpById(id);

		return "redirect:/viewform";
	}

	@ModelAttribute("designations")
	public List<String> initializeDesignation() {

		List<String> designations = new ArrayList<String>();
		designations.add("Trainee Engineer");
		designations.add("Associate Software Engineer");
		designations.add("Software Engineer");
		designations.add("Senior Software Engineer");
		designations.add("Associate Tech Lead");
		designations.add("Tech lead");
		designations.add("Senior Tech lead");
		designations.add("Architect");
		return designations;
	}

	@ModelAttribute("departments")
	public List<String> initializeDepartment() {

		List<String> departments = new ArrayList<String>();
		departments.add("Practise");
		departments.add("ADMS");
		departments.add("QA");
		departments.add("L&D");
		departments.add("HR");
		departments.add("Recruitment");
		return departments;
	}

}