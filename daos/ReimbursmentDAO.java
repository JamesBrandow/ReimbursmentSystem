package dev.brandow.daos;

import java.util.List;

import dev.brandow.entities.Reimbursment;

public interface ReimbursmentDAO {
	
	Reimbursment createReimbusment(Reimbursment reimburstment);
	
	Reimbursment getRiembursmentByID(int riemID);
	Reimbursment getReimbursmentByEmployee(int empID);
	Reimbursment getReimbursmentByManager(int manID);
	List<Reimbursment> getAllReimbursment();
	List<Reimbursment> getCompletedReimbursment();
	List<Reimbursment> getPendingReimbursment();
	List<Reimbursment> getApprovedReimbursment();
	List<Reimbursment> getDeniedReimbursment();
	
	Reimbursment updateReimbursment(Reimbursment reimburstment);
	
	boolean deleteReimbursment(Reimbursment reimburstment);
	
	
	

}
