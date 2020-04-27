package dev.brandow.entities;

public class Reimbursment {

	private int remid;
	private double amount;
	private int empID;
	private String description;
	private String status;
	
	public Reimbursment() {
		super();
	}

	public Reimbursment(int remid, double amount, int empID, String description, String status) {
		super();
		this.remid = remid;
		this.amount = amount;
		this.empID = empID;
		this.description = description;
		this.status = status;
	}

	public int getRemid() {
		return remid;
	}

	public void setRemid(int remid) {
		this.remid = remid;
	}

	public int getEmpID() {
		return empID;
	}

	public void setEmpID(int empID) {
		this.empID = empID;
	}
	
	public double getAmount() {
		return amount;
	}

	public void setAmount(double amount) {
		this.amount = amount;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	@Override
	public String toString() {
		return "Reimbursment [remid=" + remid + ", empID=" + empID + ", description="
				+ description + ", amount=" + amount + ", status=" + status + "]" + "\n";
	}
	
}
