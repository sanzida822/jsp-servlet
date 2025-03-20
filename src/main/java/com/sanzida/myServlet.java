package com.sanzida;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletConfig;
import javax.servlet.ServletContext;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

//servlet context and servlet config

public class myServlet extends HttpServlet {

	
	public void doGet(HttpServletRequest req, HttpServletResponse res) throws IOException {
		
		PrintWriter out=res.getWriter();
		out.print("Hi ");
		
		ServletContext ctx= getServletContext();
		String str= ctx.getInitParameter("name");
		out.println(str);
		
		//for specific servlet
		ServletConfig cf= getServletConfig();
		String str1= cf.getInitParameter("name");
		out.println(str1);
		
		
		
	}
}
