package dev.brandow.servlets;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import dev.brandow.services.EmployeeService;
import dev.brandow.services.EmployeeServiceImpl;
import dev.brandow.services.ManagerService;
import dev.brandow.services.ManagerServiceImpl;


public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	EmployeeService eserv = new EmployeeServiceImpl();
	ManagerService mserv = new ManagerServiceImpl();
       
    public LoginServlet() {
        super();
       
    }
    
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    	String username = request.getParameter("username");
		String password = request.getParameter("password");
		HttpSession sess = request.getSession();
		
		if(username.equals(mserv.managerLogin(username).getUsername()) && password.equals(mserv.managerLogin(username).getPassword())) {
			
			sess.setAttribute("username", username);
			response.sendRedirect("http://localhost:8080/ExpenceRiembursment/managerpage.html");
			
		} else if (username.equals(eserv.employeeLogin(username).getUsername()) && password.equals(eserv.employeeLogin(username).getPassword())) {
			
			sess.setAttribute("username", username);
			response.sendRedirect("http://localhost:8080/ExpenceRiembursment/employeepage.html");
			
		}
		doGet(request, response);
    }

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		
	}

}
