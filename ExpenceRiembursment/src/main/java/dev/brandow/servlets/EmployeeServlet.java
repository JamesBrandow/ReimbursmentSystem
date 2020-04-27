package dev.brandow.servlets;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import dev.brandow.entities.Employee;
import dev.brandow.services.EmployeeService;
import dev.brandow.services.EmployeeServiceImpl;

public class EmployeeServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	EmployeeService eserv = new EmployeeServiceImpl();
	
    public EmployeeServlet() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String username = request.getParameter("username");
		String password = request.getParameter("password");
		HttpSession sess = request.getSession();
		
//		Employee employee = eserv.employeeLogin(username);
		
		if (username.equals(eserv.employeeLogin(username).getUsername()) && password.equals(eserv.employeeLogin(username).getPassword())) {
			System.out.println(username);
			System.out.println(password);
			System.out.println(eserv.employeeLogin(username));
			int empID = eserv.employeeLogin(username).getEmpID();
				sess.setAttribute("username", username);
				sess.setAttribute("empID", empID);
				
				response.sendRedirect("http://localhost:8080/ExpenceRiembursment/employeepage.html");
		} else {
			
			response.sendRedirect("http://localhost:8080/ExpenceRiembursment/employeelogin.html");
		}
		
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		doGet(request, response);
	}

}
