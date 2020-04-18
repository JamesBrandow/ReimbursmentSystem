package dev.brandow.entities;

import java.util.ArrayList;
import java.util.List;

public class Employee {

	private int empID;
	private String username;
	private String password;
	private int manID;
	
	private List<Reimbursment> reimburstment = new ArrayList<Reimbursment>();
	
	public Employee() {
		super();
	}

	public Employee(int empID, String username, String password) {
		super();
		this.empID = empID;
		this.username = username;
		this.password = password;
	}

	public int getEmpID() {
		return empID;
	}

	public void setEmpID(int empID) {
		this.empID = empID;
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

	public int getManID() {
		return manID;
	}

	public void setManID(int manID) {
		this.manID = manID;
	}

	@Override
	public String toString() {
		return "Employee [empID=" + empID + ", username=" + username + ", password=" + password + ", manID=" + manID
				+ ", reimburstment=" + reimburstment + "]";
	}


}
