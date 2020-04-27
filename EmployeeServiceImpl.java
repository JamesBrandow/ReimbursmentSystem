package dev.brandow.services;

import java.util.List;

import dev.brandow.daos.EmployeeDAO;
import dev.brandow.daos.EmployeeDAOMaria;
import dev.brandow.entities.Employee;

public class EmployeeServiceImpl implements EmployeeService{

	private EmployeeDAO edao = new EmployeeDAOMaria();
	
	@Override
	public Employee employeeLogin(String username) {
		return edao.getEmployeeByUsername(username);
		
	}

	@Override
	public List<Employee> retrieveEmployeeById(int empID) {
		return edao.getEmployeeByEmpID(empID);
	}

	@Override
	public Employee retrieveEmployeeByName(String empName) {
		return edao.getEmployeeByEmpName(empName);
	}

	@Override
	public List<Employee> retrieveAllEmployee() {
		return edao.getAllEmployee();
	}

}
