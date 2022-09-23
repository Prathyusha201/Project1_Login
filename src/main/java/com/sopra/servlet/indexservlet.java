package com.sopra.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/indexservlet")
public class indexservlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

    public indexservlet() 
    {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
	{
		PrintWriter out = response.getWriter();
		String id = request.getParameter("empid");
	
		 out.println("<html><body>");
	        
	        try
	        {
	            Class.forName("com.mysql.cj.jdbc.Driver");
	            Connection con  =  DriverManager.getConnection("jdbc:mysql://localhost:3306/soprasteria", "root", "$Prathi1");
	            java.sql.Statement stmt = con.createStatement();
	            ResultSet rs = stmt.executeQuery("select * from login where empid = "+id+"");
	            out.println("<center><table cellspacing='2' border='1px'>");  
	            out.println("<tr><th>Employee ID</th><th>Employee Name</th><th>Login Time</th></tr>");  
	            while(rs.next())
	            {
	                String n = rs.getString("empid");  
	                String nm = rs.getString("empname");  
	                String s = rs.getString("datetime");   
	                out.println("<tr><td>" + n + "</td><td>" + nm + "</td><td>" + s + "</td></tr>");
	            }
	            out.println("</table></center>");  
	            
	            out.println("</html></body>");  
	            con.close();
	            
	        }
	        
	        catch (ClassNotFoundException | SQLException e)
	        {
	            e.printStackTrace();
	        }
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		doGet(request, response);
	}

}
