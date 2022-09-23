package com.sopra.servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.sopra.beans.RegisterForm;
import com.sopra.dao.RegisterDao;

@WebServlet("/Registerservlet")
public class Registerservlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		String reempid = request.getParameter("empid");
		String rename = request.getParameter("empname");
		String recontact = request.getParameter("empcontact");
		String reemail = request.getParameter("empemail");
		
		RegisterForm reg = new RegisterForm();
		reg.setEmpid(reempid);
		reg.setEmpname(rename);
		reg.setEmpcontact(recontact);
		reg.setEmpemail(reemail);
		
		RegisterDao user = new RegisterDao();
		user.insert(reg);
		response.sendRedirect("login.jsp");
		
	}
}
