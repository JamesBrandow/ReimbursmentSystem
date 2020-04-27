package dev.brandow.servlets;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import dev.brandow.services.ManagerService;
import dev.brandow.services.ManagerServiceImpl;

public class ManagerServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	ManagerService mserv = new ManagerServiceImpl();

    public ManagerServlet() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String username = request.getParameter("username");
		String password = request.getParameter("password");
		
		if(username.equals(mserv.managerLogin(username).getUsername()) && password.equals(mserv.managerLogin(username).getPassword())) {
			
			HttpSession sess = request.getSession();
			sess.setAttribute("username", username);
			response.sendRedirect("http://localhost:8080/ExpenceRiembursment/managerpage.html");
			
		} else {
			
			response.sendRedirect("http://localhost:8080/ExpenceRiembursment/managerlogin.html");
		}
 	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		doGet(request, response);
	}

}
