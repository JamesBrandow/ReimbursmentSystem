package dev.brandow.servicetest;

import static org.junit.Assert.*;

import org.junit.Test;

import dev.brandow.services.EmployeeService;
import dev.brandow.services.EmployeeServiceImpl;

public class EmployeeServiceTest {

	EmployeeService eserv = new EmployeeServiceImpl();
	
	@Test
	public void test() {
		System.out.println(eserv.employeeLogin("grumpy"));
		System.out.println("===================================================");
		System.out.println(eserv.retrieveEmployeeById(2));
		System.out.println("===================================================");
		System.out.println(eserv.retrieveEmployeeByName("Geralt"));
		System.out.println("===================================================");
		System.out.println(eserv.retrieveAllEmployee());
	}

}
