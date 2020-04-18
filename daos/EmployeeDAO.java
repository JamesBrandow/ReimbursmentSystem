package dev.brandow.daos;

import java.util.List;

import dev.brandow.entities.Employee;

public interface EmployeeDAO {
	
	Employee getEmployeeByUsername(String username);
	Employee getEmployeeByEmpID(int empID);
	
	List<Employee> getAllEmployee();

}
