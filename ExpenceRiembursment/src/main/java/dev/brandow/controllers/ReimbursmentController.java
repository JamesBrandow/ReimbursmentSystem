package dev.brandow.controllers;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.google.gson.Gson;

import dev.brandow.entities.Reimbursment;
import dev.brandow.services.ReimbursmentService;
import dev.brandow.services.ReimbursmentServiceImpl;

public class ReimbursmentController {

	ReimbursmentService rserv = new ReimbursmentServiceImpl();
	
	public void addReimbursment(HttpServletRequest request, HttpServletResponse response) throws IOException {
		String body = request.getReader().lines().reduce("", (accumulator,actual) -> accumulator + actual);
		Gson gson = new Gson();
		
		Reimbursment reimbursment = gson.fromJson(body, Reimbursment.class);
		rserv.createReimbusment(reimbursment);
		response.getWriter().append("Submition Successful");
	}
	
	public void getAllReimbursment(HttpServletRequest request, HttpServletResponse response) throws IOException {
		
		Gson gson = new Gson();
		List<Reimbursment> reimbursment = rserv.retrieveAllReimbursment();
		PrintWriter pw = response.getWriter();
		String json = gson.toJson(reimbursment);
		pw.append(json);
	}
	
	public void getReimbursmentByEmployeeID(HttpServletRequest request, HttpServletResponse response) throws IOException {
		Gson gson = new Gson();
		int eid = (int) request.getSession().getAttribute("empID");
		List<Reimbursment> reimbursment = rserv.retrieveReimbursmentByEmployee(eid);
		PrintWriter pw = response.getWriter();
		String json = gson.toJson(reimbursment);
		pw.append(json);
	}
	
	public void pendingReimbursment(HttpServletRequest request, HttpServletResponse response) throws IOException {
		Gson gson = new Gson();
		String json = gson.toJson(rserv.retrievePendingReimbursment());
		response.getWriter().append(json);
	}
	
	public void completedReimbursment(HttpServletRequest request, HttpServletResponse response) throws IOException {
		Gson gson = new Gson();
		String json = gson.toJson(rserv.retrieveCompletedReimbursment());
		response.getWriter().append(json);
	}
	
	public void approvedReimbursment(HttpServletRequest request, HttpServletResponse response) throws IOException {
		Gson gson = new Gson();
		String json = gson.toJson(rserv.retrieveApprovedReimbursment());
		response.getWriter().append(json);
	}
	
	public void deniedReimbursment(HttpServletRequest request, HttpServletResponse response) throws IOException {
		Gson gson = new Gson();
		String json = gson.toJson(rserv.retrieveDeniedReimbursment());
		response.getWriter().append(json);
	}
	
	public void approveReimbursment(HttpServletRequest request, HttpServletResponse response) throws IOException {
		Gson gson = new Gson();
		String json = request.getReader().lines().reduce("", (accumulator,actual) -> accumulator + actual);
		Reimbursment reimbursment = gson.fromJson(json, Reimbursment.class);
		rserv.markReimbusmentAsApproved(reimbursment);
		System.out.println(reimbursment);
		response.getWriter().append("Reimbursment Approved");
	}
	
	public void denyReimbursment(HttpServletRequest request, HttpServletResponse response) throws IOException {
		Gson gson = new Gson();
		String json = request.getReader().lines().reduce("", (accumulator,actual) -> accumulator + actual);
		Reimbursment reimbursment = gson.fromJson(json, Reimbursment.class);
		rserv.markReimbusmentAsDenied(reimbursment);
		System.out.println(reimbursment);
		response.getWriter().append("Reimbursment Denied");
	}
	
	//============================================================================================================================
	
	public void getPendingReimbursmentByEmployeeID(HttpServletRequest request, HttpServletResponse response) throws IOException {
		Gson gson = new Gson();
		int eid = (int) request.getSession().getAttribute("empID");
		List<Reimbursment> reimbursment = rserv.retrievePendingEmpReimbursment(eid);
		PrintWriter pw = response.getWriter();
		String json = gson.toJson(reimbursment);
		pw.append(json);
	}
	
	public void completedempReimbursment(HttpServletRequest request, HttpServletResponse response) throws IOException {
		Gson gson = new Gson();
		int eid = (int) request.getSession().getAttribute("empID");
		List<Reimbursment> reimbursment = rserv.retrieveCompletedEmpReimbursment(eid);
		PrintWriter pw = response.getWriter();
		String json = gson.toJson(reimbursment);
		pw.append(json);
	}
	
	public void approvedEmpReimbursment(HttpServletRequest request, HttpServletResponse response) throws IOException {
		Gson gson = new Gson();
		int eid = (int) request.getSession().getAttribute("empID");
		List<Reimbursment> reimbursment = rserv.retrieveApprovedEmpReimbursment(eid);
		PrintWriter pw = response.getWriter();
		String json = gson.toJson(reimbursment);
		pw.append(json);
	}
	
	public void deniedEmpReimbursment(HttpServletRequest request, HttpServletResponse response) throws IOException {
		Gson gson = new Gson();
		int eid = (int) request.getSession().getAttribute("empID");
		List<Reimbursment> reimbursment = rserv.retrieveDeniedEmpReimbursment(eid);
		PrintWriter pw = response.getWriter();
		String json = gson.toJson(reimbursment);
		pw.append(json);
	}
	
	
}
