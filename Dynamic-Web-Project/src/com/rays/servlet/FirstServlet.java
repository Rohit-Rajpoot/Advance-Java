package com.rays.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/FirstServlet")

public class FirstServlet extends HttpServlet{
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		System.out.println("In Get Method");
		
		resp.sendRedirect("FirstView.jsp");
		
		
	}
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		System.out.println("In Post Method");
		
		PrintWriter out = resp.getWriter();
		out.write("In Post Method \n");
		
		String firstName = req.getParameter("First Name");
		String lastName = req.getParameter("Last Name");
		String dob = req.getParameter("DOB");
		String loginId = req.getParameter("Login Id");
		String password = req.getParameter("Password");
		String address = req.getParameter("Address");
		
//		System.out.println(firstName);
//		System.out.println(lastName);
//		System.out.println(dob);
//		System.out.println(loginId);
//		System.out.println(password);
//		System.out.println(address);
	
		out.write(firstName + "\n");
		out.write(lastName + "\n");
		out.write(dob + "\n");
		out.write(loginId + "\n");
		out.write(password + "\n");
		out.write(address + "\n");
	}

}
