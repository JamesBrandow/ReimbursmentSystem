package dev.brandow.services;

import java.util.List;

import dev.brandow.entities.Reimbursment;

public interface ReimbursmentService {

	Reimbursment createReimbusment(Reimbursment reimburstment);
	Reimbursment markReimbusmentAsApproved(Reimbursment reimburstment);
	Reimbursment markReimbusmentAsDenied(Reimbursment reimburstment);
	
	Reimbursment getRiembursmentByID(int riemID);
	List<Reimbursment> retrieveReimbursmentByEmployee(int empID);
	List<Reimbursment> retrieveReimbursmentByManager(int manID);
	List<Reimbursment> retrieveAllReimbursment();
	List<Reimbursment> retrieveCompletedReimbursment();
	List<Reimbursment> retrievePendingReimbursment();
	List<Reimbursment> retrieveApprovedReimbursment();
	List<Reimbursment> retrieveDeniedReimbursment();
	
	Reimbursment updateReimbursment(Reimbursment reimburstment);
	
	boolean deleteReimbursment(Reimbursment reimburstment);
}
