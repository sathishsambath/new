package org.login;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Servletmethods
 */
@WebServlet("/Servletmethods")
public class Servletmethods extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	public void init() {
		
		try {
			Connection con = DriverManager.getConnection(null);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			System.out.println("not connected");
			e.printStackTrace();
		}
		
	}
	
	
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Servletmethods() {
        super();
        
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//response.getWriter().append("Served at: ").append(request.getContextPath());
		
		
		
		response.setContentType("text/html");

        // Get a PrintWriter object to send HTML to the client
        PrintWriter out = response.getWriter();

        // Generate HTML content
        out.println("<html>");
        out.println("<head><title>Simple Servlet Example</title></head>");
        out.println("<body>");
        out.println("<h1>Hello, this is a simple servlet!</h1>");
        out.println("<p>This servlet responds to a GET request.</p>");
        out.println("</body>");
        out.println("</html>");
        doPost(request, response);
	}
	
	

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		
		response.setContentType("text/html");

        // Get a PrintWriter object to send HTML to the client
        PrintWriter out = response.getWriter();

        // Get form data from the request
        String username = request.getParameter("username");
        String password = request.getParameter("password");
        System.out.println(username);

        // Generate HTML content with form data
        out.println("<html>");
        out.println("<head><title>Simple POST Servlet Example</title></head>");
        out.println("<body>");
        out.println("<h1>Hello, this is a simple POST servlet!</h1>");
        out.println("<p>Username: " + username + "</p>");
        out.println("<p>Password: " + password + "</p>");
        out.println("</body>");
        out.println("</html>");
		
		
	}

}
