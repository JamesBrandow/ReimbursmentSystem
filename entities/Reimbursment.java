package dev.brandow.entities;

public class Reimbursment {

	private int remid;
	private double amount;
	private int empID;
	private int manID;
	private String requestor;
	private String status;
	
	public Reimbursment() {
		super();
	}

	public Reimbursment(int remid, double amount, int empID, int manID, String requestor, String status) {
		super();
		this.remid = remid;
		this.amount = amount;
		this.empID = empID;
		this.manID = manID;
		this.requestor = requestor;
		this.status = status;
	}

	public int getRemid() {
		return remid;
	}

	public void setRemid(int remid) {
		this.remid = remid;
	}

	public int getManID() {
		return manID;
	}

	public void setManID(int manID) {
		this.manID = manID;
	}

	public int getEmpID() {
		return empID;
	}

	public void setEmpID(int empID) {
		this.empID = empID;
	}

	public double getAmmount() {
		return amount;
	}

	public void setAmmount(double ammount) {
		this.amount = ammount;
	}

	public String getRequestor() {
		return requestor;
	}

	public void setRequestor(String requestor) {
		this.requestor = requestor;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	@Override
	public String toString() {
		return "Reimbursment [remid=" + remid + ", amount=" + amount + ", empID=" + empID + ", manID=" + manID
				+ ", requestor=" + requestor + ", status=" + status + "]";
	}

	
}
