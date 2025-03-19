package com.sanzida;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class AddServlet extends HttpServlet {

	public void doGet(HttpServletRequest req, HttpServletResponse res) throws IOException, ServletException {
		int i=Integer.parseInt(req.getParameter("num1"));
		int j= Integer.parseInt(req.getParameter("num2"));
		
		
		int k= i+j;
	    res.getWriter().println(k);
     
        
        
        //session management
        req.setAttribute("k", k);
        
		RequestDispatcher dis= req.getRequestDispatcher("sq"); //call sq from web.xml
		dis.forward(req, res);
//		
	}
}
