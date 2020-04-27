package dev.brandow.controllers;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.google.gson.Gson;

import dev.brandow.entities.Employee;
import dev.brandow.entities.Reimbursment;
import dev.brandow.services.EmployeeService;
import dev.brandow.services.EmployeeServiceImpl;

public class EmployeeController {
	
	EmployeeService eserv = new EmployeeServiceImpl();
	
	public void getEmployeeByUsername(HttpServletRequest request, HttpServletResponse response) throws IOException {
		Gson gson = new Gson();
		int eid = (int) request.getSession().getAttribute("empID");
		List<Employee> employee = eserv.retrieveEmployeeById(eid);
		PrintWriter pw = response.getWriter();
		String json = gson.toJson(employee);
		pw.append(json);
	}

}
