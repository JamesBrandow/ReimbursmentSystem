package dev.brandow.servlets;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dev.brandow.daos.EmployeeDAO;
import dev.brandow.daos.EmployeeDAOMaria;
import dev.brandow.entities.Employee;
import dev.brandow.services.EmployeeService;
import dev.brandow.services.EmployeeServiceImpl;


public class EmployeeServ extends HttpServlet {
	private static final long serialVersionUID = 1L;
       

    public EmployeeServ() {
        super();
  
    }

    EmployeeDAO edao = new EmployeeDAOMaria();
    
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		int eid = (int) request.getSession().getAttribute("empID");
		List<Employee> log = edao.getEmployeeByEmpID(eid);
		response.getWriter().append("Welcome " + ((Employee) log).getEmployeeName() + "\n" + "ID: " + eid);
//		System.out.println(log);
//		System.out.println(eid);
	}


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		doGet(request, response);
	}

}
