package dev.brandow.servlets;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dev.brandow.controllers.EmployeeController;
import dev.brandow.controllers.ReimbursmentController;


public class DispatcherServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       

    public DispatcherServlet() {
        super();
    }
    
    ReimbursmentController rcontroller = new ReimbursmentController();
    EmployeeController econtroller = new EmployeeController();

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String uri = request.getRequestURI();
		System.out.println(uri);
		switch(uri) {
		
		case "/ExpenceRiembursment/api/reimbursments" : rcontroller.getAllReimbursment(request, response);
		break;
		case "/ExpenceRiembursment/api/addreimbursments" : rcontroller.addReimbursment(request, response);
		break;
		case "/ExpenceRiembursment/api/approvereimbursments" : rcontroller.approveReimbursment(request, response);
		break;
		case "/ExpenceRiembursment/api/denyreimbursments" : rcontroller.denyReimbursment(request, response);
		break;
		case "/ExpenceRiembursment/api/completedreimbursments" : rcontroller.completedReimbursment(request, response);
		break;
		case "/ExpenceRiembursment/api/deniedreimbursments" : rcontroller.deniedReimbursment(request, response);
		break;
		case "/ExpenceRiembursment/api/approvedreimbursments" : rcontroller.approvedReimbursment(request, response);
		break;
		case "/ExpenceRiembursment/api/pendingreimbursments" : rcontroller.pendingReimbursment(request, response);
		break;

		
		
		case "/ExpenceRiembursment/api/employeeByUsername" : econtroller.getEmployeeByUsername(request, response);
		break;
		
		
		
		case "/ExpenceRiembursment/api/employeereimbursments" : rcontroller.getReimbursmentByEmployeeID(request, response);
		break;
		case "/ExpenceRiembursment/api/pendingempreimbursments" : rcontroller.getPendingReimbursmentByEmployeeID(request, response);
		break;
		case "/ExpenceRiembursment/api/completedempreimbursments" : rcontroller.completedempReimbursment(request, response);
		break;
		case "/ExpenceRiembursment/api/approvedempreimbursments" : rcontroller.approvedEmpReimbursment(request, response);
		break;
		case "/ExpenceRiembursment/api/deniedempreimbursments" : rcontroller.deniedEmpReimbursment(request, response);
		break;
		
		default : response.getWriter().append("Uri request did not match anything");
		
		
		}
	}


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
