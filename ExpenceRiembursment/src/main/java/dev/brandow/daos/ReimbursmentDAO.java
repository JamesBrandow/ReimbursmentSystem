package dev.brandow.daos;

import java.util.List;

import dev.brandow.entities.Reimbursment;

public interface ReimbursmentDAO {
	
	Reimbursment createReimbusment(Reimbursment reimbursment);
	
	Reimbursment getRiembursmentByID(int remID);
	List<Reimbursment> getReimbursmentByEmployee(int empID);
	List<Reimbursment> getAllReimbursment();
	List<Reimbursment> getCompletedReimbursment();
	List<Reimbursment> getPendingReimbursment();
	List<Reimbursment> getApprovedReimbursment();
	List<Reimbursment> getDeniedReimbursment();
	
	List<Reimbursment> getCompletedEmpReimbursment(int empID);
	List<Reimbursment> getPendingEmpReimbursment(int empID);
	List<Reimbursment> getApprovedEmpReimbursment(int empID);
	List<Reimbursment> getDeniedEmpReimbursment(int empID);
	
	Reimbursment updateReimbursment(Reimbursment reimbursment);
	
	boolean deleteReimbursment(Reimbursment reimbursment);
	
	
	

}
