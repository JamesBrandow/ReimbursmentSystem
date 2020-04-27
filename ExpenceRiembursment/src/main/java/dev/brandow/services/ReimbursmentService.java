package dev.brandow.services;

import java.util.List;

import dev.brandow.entities.Reimbursment;

public interface ReimbursmentService {

	Reimbursment createReimbusment(Reimbursment reimbursment);
	Reimbursment markReimbusmentAsApproved(Reimbursment reimbursment);
	Reimbursment markReimbusmentAsDenied(Reimbursment reimbursment);
	
	Reimbursment getRiembursmentByID(int reimID);
	List<Reimbursment> retrieveReimbursmentByEmployee(int empID);
	List<Reimbursment> retrieveAllReimbursment();
	List<Reimbursment> retrieveCompletedReimbursment();
	List<Reimbursment> retrievePendingReimbursment();
	List<Reimbursment> retrieveApprovedReimbursment();
	List<Reimbursment> retrieveDeniedReimbursment();
	
	List<Reimbursment> retrieveCompletedEmpReimbursment(int empID);
	List<Reimbursment> retrievePendingEmpReimbursment(int empID);
	List<Reimbursment> retrieveApprovedEmpReimbursment(int empID);
	List<Reimbursment> retrieveDeniedEmpReimbursment(int empID);
}
