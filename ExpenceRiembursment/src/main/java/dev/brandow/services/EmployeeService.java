package dev.brandow.services;

import java.util.List;

import dev.brandow.entities.Employee;

public interface EmployeeService {
	
	Employee employeeLogin(String username);
	List<Employee> retrieveEmployeeById(int empID);
	Employee retrieveEmployeeByName(String empName);
	
	List<Employee> retrieveAllEmployee();
	

}
