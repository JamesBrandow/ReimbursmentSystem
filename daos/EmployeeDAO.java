package dev.brandow.daos;

import dev.brandow.entities.Employee;

public interface EmployeeDAO {
	
	Employee getEmployeeByUsername(Employee employee);

}
