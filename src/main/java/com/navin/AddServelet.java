package com.navin;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class AddServelet extends HttpServlet
{
	public void doPost(HttpServletRequest req,HttpServletResponse res) throws IOException
	{
		int i = Integer.parseInt(req.getParameter("num1"));
		int j = Integer.parseInt(req.getParameter("num2")); 
		
		int k = i + j;
		PrintWriter out = res.getWriter();
		res.getWriter().println("result is " + k);
		
		
	}
	
//	public void service(HttpServletRequest req,HttpServletResponse res) throws IOException
//	{
//		int i = Integer.parseInt(req.getParameter("num1"));
//		int j = Integer.parseInt(req.getParameter("num2")); 
//		
//		int k = i + j;
//		PrintWriter out = res.getWriter();
//		res.getWriter().println("result is " + k);
//		
//		
//	}

}
