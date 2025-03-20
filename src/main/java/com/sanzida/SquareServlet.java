package com.sanzida;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class SquareServlet extends HttpServlet {

	
    @Override
    public void doGet(HttpServletRequest req, HttpServletResponse res) throws IOException {
//    int k= (int)req.getAttribute("k");
//        k=k*k;
//        // Output the result
//        PrintWriter print = res.getWriter();
       // print.println("Result: "+k);
    	
    	//through url
//    	int k =Integer.parseInt(req.getParameter("k"));
//    	k=k*k;   	
//    	PrintWriter pr= res.getWriter();
//    	pr.println(k);
    	
    	
 //     thrugh session 	
//    	HttpSession session = req.getSession();
//    	int k= (int)session.getAttribute("k");
//    	k=k*k;
//    	PrintWriter pr= res.getWriter();
//    	pr.println(k);
//    	
    	
    	
    	//through cookie
    	int k= 0;
    	Cookie cookies[]= req.getCookies();
    	for(Cookie c: cookies) {
    		if(c.getName().equals("k")) {
    			System.out.println(c.getValue());
        		k=Integer.parseInt(c.getValue());

    		}
    	
    	}
    	
    	k=k*k;
    	PrintWriter pr=res.getWriter();
    	pr.println(k);
    			
    	
    	
    }
    
}
