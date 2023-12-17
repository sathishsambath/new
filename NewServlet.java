package org.login;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class NewServlet
 */
@WebServlet("/NewServlet")
public class NewServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    
String uname = "java123";
	
	String pass = "Java@123";
       
    
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		
		String username = request.getParameter("uname");
		
		String password = request.getParameter("pass");
		
		Databean db = new Databean(username, password);
		
		System.out.println(username);
		
		if (uname.equalsIgnoreCase(username) && password.equals(pass)) {
			
			response.getWriter().append("<h1>Login sucessfull..</h1>");
			
		}
		
		
		else {
			
			response.getWriter().append("<h1>Login failed..</h1>");
			
		}
		
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
