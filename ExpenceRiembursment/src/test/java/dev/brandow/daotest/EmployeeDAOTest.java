package dev.brandow.daotest;

import static org.junit.Assert.*;

import org.junit.Test;

import dev.brandow.daos.EmployeeDAO;
import dev.brandow.daos.EmployeeDAOMaria;

public class EmployeeDAOTest {

	private EmployeeDAO empdao = new EmployeeDAOMaria();
	
	
	public void getByUsername() {
		System.out.println(empdao.getEmployeeByUsername("whitewolf"));
	}
	
	@Test
	public void getByID() {
		System.out.println(empdao.getEmployeeByEmpID(1));
	}
	
	
	public void getByName() {
		System.out.println(empdao.getEmployeeByEmpName("Lambert"));
	}
	
	public void getAll() {
		System.out.println(empdao.getAllEmployee());
	}

}
