package com.employee.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.employee.model.Employee;
import com.employee.service.EmployeeService;

@RestController
public class EmployeeController {

	@Autowired
	private EmployeeService empservice;
	
	@GetMapping("/")
	public List<Employee> getEmployees(){
		return this.empservice.getEmployeeData();
	}
	
	@GetMapping("/error")
	public String handleError() {
		return "An error occurred";
	}
}
