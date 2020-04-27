package dev.brandow.services;

import java.util.List;

import dev.brandow.daos.ReimbursmentDAO;
import dev.brandow.daos.ReimbursmentDAOMaria;
import dev.brandow.entities.Reimbursment;

public class ReimbursmentServiceImpl implements ReimbursmentService{

	private ReimbursmentDAO rdao = new ReimbursmentDAOMaria();
	
	@Override
	public Reimbursment createReimbusment(Reimbursment reimbursment) {
		rdao.createReimbusment(reimbursment);
		return reimbursment;
	}

	@Override
	public Reimbursment markReimbusmentAsApproved(Reimbursment reimbursment) {
		reimbursment.setStatus("Approved");
		rdao.updateReimbursment(reimbursment);
		return reimbursment;
	}

	@Override
	public Reimbursment markReimbusmentAsDenied(Reimbursment reimbursment) {
		reimbursment.setStatus("Denied");
		rdao.updateReimbursment(reimbursment);
		return reimbursment;
	}

	@Override
	public Reimbursment getRiembursmentByID(int reimID) {
		return rdao.getRiembursmentByID(reimID);
	}

	@Override
	public List<Reimbursment> retrieveReimbursmentByEmployee(int empID) {
		return rdao.getReimbursmentByEmployee(empID);
	}

	@Override
	public List<Reimbursment> retrieveAllReimbursment() {
		return rdao.getAllReimbursment();
	}

	@Override
	public List<Reimbursment> retrieveCompletedReimbursment() {
		return rdao.getCompletedReimbursment();
	}

	@Override
	public List<Reimbursment> retrievePendingReimbursment() {
		return rdao.getPendingReimbursment();
	}

	@Override
	public List<Reimbursment> retrieveApprovedReimbursment() {
		return rdao.getApprovedReimbursment();
	}

	@Override
	public List<Reimbursment> retrieveDeniedReimbursment() {
		return rdao.getDeniedReimbursment();
	}

	@Override
	public List<Reimbursment> retrieveCompletedEmpReimbursment(int empID) {
		return rdao.getCompletedEmpReimbursment(empID);
	}

	@Override
	public List<Reimbursment> retrievePendingEmpReimbursment(int empID) {
		return rdao.getPendingEmpReimbursment(empID);
	}

	@Override
	public List<Reimbursment> retrieveApprovedEmpReimbursment(int empID) {
		return rdao.getApprovedEmpReimbursment(empID);
	}

	@Override
	public List<Reimbursment> retrieveDeniedEmpReimbursment(int empID) {
		return rdao.getDeniedEmpReimbursment(empID);
	}

}
