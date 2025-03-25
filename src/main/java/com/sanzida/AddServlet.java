package com.sanzida;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


@WebServlet("/add")
public class AddServlet extends HttpServlet {

	public void doGet(HttpServletRequest req, HttpServletResponse res) throws IOException, ServletException {
		int i=Integer.parseInt(req.getParameter("num1"));
		int j= Integer.parseInt(req.getParameter("num2"));	
		int k= i+j;
	    res.getWriter().println(k);
        //session management
//      req.setAttribute("k", k);      
//		RequestDispatcher dis= req.getRequestDispatcher("sq"); //call sq from web.xml
//		dis.forward(req, res);
	    
	    //send through url
		//res.sendRedirect("sq?k="+k); //url rewritting
		
	    
	    //through session
//		HttpSession session = req.getSession();		
//		session.setAttribute("k", k);
//		res.sendRedirect("sq");
		
	    
	    
	    //through cookie
	    Cookie cookie = new Cookie("k",k+"");
	    res.addCookie(cookie);
	    res.sendRedirect("sq");
		
		
//		
	}
}
