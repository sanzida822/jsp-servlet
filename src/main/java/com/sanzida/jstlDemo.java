package com.sanzida;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/jstlDemo")
public class jstlDemo extends HttpServlet {
	protected void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		String name="nitu";

	
		Studentjstl s= new Studentjstl(1, "nitu");
		
		
		System.out.println("Student Name Set: " + s.getName());
//		RequestDispatcher rd= req.getRequestDispatcher("display.jsp");
//		req.setAttribute("student", s);
//		rd.forward(req, res);
		
	}

}
