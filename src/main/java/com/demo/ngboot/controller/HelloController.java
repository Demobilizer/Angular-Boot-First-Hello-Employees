package com.demo.ngboot.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.demo.ngboot.model.Employee;

@CrossOrigin(origins = "*")
@RestController
public class HelloController {

	private List<Employee> employees = createList();

	@RequestMapping(value = "/employees", method = RequestMethod.GET, produces = "application/json")
	public List<Employee> firstPage() {
		System.out.println("coming...");
		System.out.println("employees-----"+employees.toString());
		return employees;
	}
	
	private static List<Employee> createList() {
		List<Employee> tempEmployees = new ArrayList<>();
		Employee emp1 = new Employee();
		emp1.setEmpName("emp1");
		emp1.setEmailId("manager@email.com");
		emp1.setEmpId(1);
		emp1.setSalary(3000);

		Employee emp2 = new Employee();
		emp2.setEmpName("emp2");
		emp2.setEmailId("developer@email.com");
		emp2.setEmpId(2);
		emp2.setSalary(3000);
		tempEmployees.add(emp1);
		tempEmployees.add(emp2);
		return tempEmployees;
	}
}
