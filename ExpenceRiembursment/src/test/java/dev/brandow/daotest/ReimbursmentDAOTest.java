package dev.brandow.daotest;

import static org.junit.Assert.*;

import java.util.List;

import org.junit.Test;

import dev.brandow.daos.ReimbursmentDAO;
import dev.brandow.daos.ReimbursmentDAOMaria;
import dev.brandow.entities.Reimbursment;

public class ReimbursmentDAOTest {

	public static ReimbursmentDAO remdao = new ReimbursmentDAOMaria();
	
	
	public void createReimbursmentTest() {
		Reimbursment r1 = new Reimbursment();
		r1.setEmpID(1);
		r1.setDescription("This is the description");
		r1.setAmount(100);
		r1.setStatus("Pending");
		
		remdao.createReimbusment(r1);
		System.out.println(r1);
		
		Reimbursment r2 = new Reimbursment();
		r2.setEmpID(1);
		r2.setDescription("This is the description");
		r2.setAmount(200);
		r2.setStatus("Denied");
		
		remdao.createReimbusment(r2);
		System.out.println(r2);
		
		Reimbursment r3 = new Reimbursment();
		r3.setEmpID(1);
		r3.setDescription("This is the description");
		r3.setAmount(50);
		r3.setStatus("Approved");
		
		remdao.createReimbusment(r3);
		System.out.println(r3);
		
	}
	
	
	public void getReimbursmentByIDTest() {
		Reimbursment reim1 = remdao.getRiembursmentByID(1);
		System.out.println(reim1);
		
	}
	

	public void getReimbursmentByEmpIDTest() {
		List<Reimbursment> reim1 = remdao.getReimbursmentByEmployee(1);
		System.out.println(reim1);
		
	}
	
	
	public void getAllReimbursments() {
		List<Reimbursment> reim = remdao.getAllReimbursment();
		System.out.println(reim);
	}
	
	
	public void getCompletedReimbursments() {
		List<Reimbursment> reim = remdao.getCompletedReimbursment();
		System.out.println(reim);
	}
	
	
	public void getPendingReimbursments() {
		List<Reimbursment> reim = remdao.getPendingReimbursment();
		System.out.println(reim);
	}
	
	
	public void getApprovedReimbursments() {
		List<Reimbursment> reim = remdao.getApprovedReimbursment();
		System.out.println(reim);
	}
	
	
	public void getDeniedReimbursments() {
		List<Reimbursment> reim = remdao.getDeniedReimbursment();
		System.out.println(reim);
	}

	
	public void getUpdateReimbursments() {
		Reimbursment reim = remdao.getRiembursmentByID(2);
		reim.setStatus("Approved");
		remdao.updateReimbursment(reim);
		System.out.println(reim);
	
	}
	
	
	public void getCompletedEmpReimbursments() {
		List<Reimbursment> reim = remdao.getCompletedEmpReimbursment(2);
		System.out.println(reim);
	}
	
	
	public void getPendingEmpReimbursments() {
		List<Reimbursment> reim = remdao.getPendingEmpReimbursment(1);
		System.out.println(reim);
	}
	@Test
	public void getApprovedEmpReimbursments() {
		List<Reimbursment> reim = remdao.getApprovedEmpReimbursment(2);
		System.out.println(reim);
	}
	@Test
	public void getDeniedEmpReimbursments() {
		List<Reimbursment> reim = remdao.getDeniedEmpReimbursment(2);
		System.out.println(reim);
	}
	
}
