package dev.brandow.entities;

import java.util.ArrayList;
import java.util.List;

public class Manager {

	private int manID;
	private String username;
	private String password;
	private String managerName;
	
	private List<Employee> employee = new ArrayList<Employee>();
	
	public Manager() {
		
	}
		
	public Manager(int manID, String username, String password, String managerName, List<Employee> employee) {
		super();
		this.manID = manID;
		this.username = username;
		this.password = password;
		this.managerName = managerName;
		this.employee = employee;
	}

	public int getManID() {
		return manID;
	}
	
	public void setManID(int manID) {
		this.manID = manID;
	}
	
	public String getUsername() {
		return username;
	}
	
	public void setUsername(String username) {
		this.username = username;
	}
	
	public String getPassword() {
		return password;
	}
	
	public void setPassword(String password) {
		this.password = password;
	}

	public String getName() {
		return managerName;
	}

	public void setName(String managerName) {
		this.managerName = managerName;
	}

	public List<Employee> getEmployee() {
		return employee;
	}

	public void setEmployee(List<Employee> employee) {
		this.employee = employee;
	}

	@Override
	public String toString() {
		return "Manager [manID=" + manID + ", username=" + username + ", password=" + password + ", name=" + managerName
				+ ", employee=" + employee + "]";
	}

}
