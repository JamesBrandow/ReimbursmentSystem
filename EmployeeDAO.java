package dev.brandow.daos;

import java.util.List;

import dev.brandow.entities.Employee;

public interface EmployeeDAO {
	
	Employee getEmployeeByUsername(String username);
	List<Employee> getEmployeeByEmpID(int empID);
	Employee getEmployeeByEmpName(String empName);
	Employee employeLogin(String username, String password);
	
	List<Employee> getAllEmployee();

}
