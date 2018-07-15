package com.atguigu.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.atguigu.bean.Employee;
import com.atguigu.service.EmployeeService;

@RestController
public class EmployeeController {
	@Autowired
	private EmployeeService employeeService;
	
	@GetMapping(value="getEmpById/{id}")
	public Employee getEmployee(@PathVariable("id") Integer id) {
		Employee emp = employeeService.getEmp(id);
		return emp;
	}
	
	@GetMapping(value="updateEmp")
	public Employee updateEmp(Employee employee) {
		Employee emp = employeeService.updateEmp(employee);
		return emp;
	}
	
	@GetMapping(value="deleteEmp/{id}")
	public String deleteEmp(@PathVariable("id") Integer id) {
		employeeService.deleteEmp(id);
		return "succss";
	}
}
