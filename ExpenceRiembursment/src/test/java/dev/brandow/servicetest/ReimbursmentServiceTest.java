package dev.brandow.servicetest;

import static org.junit.Assert.*;

import org.junit.Test;

import dev.brandow.entities.Reimbursment;
import dev.brandow.services.ReimbursmentService;
import dev.brandow.services.ReimbursmentServiceImpl;

public class ReimbursmentServiceTest {

	ReimbursmentService rserv = new ReimbursmentServiceImpl();
	
	
	public void createReimbursment() {
		
		Reimbursment r1 = new Reimbursment();
		r1.setEmpID(3);
		r1.setDescription("This is a test Reimbursment");
		r1.setAmount(250);
		
		rserv.createReimbusment(r1);
	}
	
	
	public void updateReimbursment() {
		Reimbursment r = rserv.getRiembursmentByID(4);
		System.out.println(r);
		rserv.markReimbusmentAsDenied(r);
	}
	
	
	public void retrieveReimbursment() {
		System.out.println(rserv.getRiembursmentByID(5));
		System.out.println("==============================================");
		System.out.println(rserv.retrieveReimbursmentByEmployee(1));
		System.out.println("==============================================");
		System.out.println(rserv.retrieveAllReimbursment());
		System.out.println("==============================================");
		System.out.println(rserv.retrieveCompletedReimbursment());
		System.out.println("==============================================");
		System.out.println(rserv.retrievePendingReimbursment());
		System.out.println("==============================================");
		System.out.println(rserv.retrieveApprovedReimbursment());
		System.out.println("==============================================");
		System.out.println(rserv.retrieveDeniedReimbursment());
	}

	@Test
	public void retrieveEmpReimbursment() {
		System.out.println(rserv.retrieveReimbursmentByEmployee(1));
		System.out.println("==============================================");
		System.out.println(rserv.retrieveCompletedEmpReimbursment(1));
		System.out.println("==============================================");
		System.out.println(rserv.retrievePendingEmpReimbursment(1));
		System.out.println("==============================================");
		System.out.println(rserv.retrieveApprovedEmpReimbursment(1));
		System.out.println("==============================================");
		System.out.println(rserv.retrieveDeniedEmpReimbursment(1));
	}
}
