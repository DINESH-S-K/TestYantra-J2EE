package com.tyss.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

@SuppressWarnings("serial")
public class Home extends GenericServlet {

	@Override
	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
		String username = req.getParameter("username");
		String password = req.getParameter("password");

		PrintWriter out = res.getWriter();
		out.println("<html><h2>Home Page <h2> <br>" + "<p>Welcome " + username + "</p>" + "<p>password " + password + "</p></html>");
	}

}
