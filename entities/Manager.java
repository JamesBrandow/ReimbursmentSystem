package dev.brandow.entities;

import java.util.ArrayList;
import java.util.List;

public class Manager {

	private int manID;
	private String username;
	private String password;
	
	private List<Reimbursment> reimburstment = new ArrayList<Reimbursment>();
	private List<Employee> employee = new ArrayList<Employee>();
	
	public Manager() {
		
	}
	
	public Manager(int manID, String username, String password) {
		super();
		this.manID = manID;
		this.username = username;
		this.password = password;
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

	public List<Reimbursment> getReimburstment() {
		return reimburstment;
	}

	public void setReimburstment(List<Reimbursment> reimburstment) {
		this.reimburstment = reimburstment;
	}

	public List<Employee> getEmployee() {
		return employee;
	}

	public void setEmployee(List<Employee> employee) {
		this.employee = employee;
	}

	@Override
	public String toString() {
		return "Manager [manID=" + manID + ", username=" + username + ", password=" + password + "]";
	}	
	
}
