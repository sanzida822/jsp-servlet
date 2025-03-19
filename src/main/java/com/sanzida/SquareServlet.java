package com.sanzida;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class SquareServlet extends HttpServlet {

	
    @Override
    public void doGet(HttpServletRequest req, HttpServletResponse res) throws IOException {
    int k= (int)req.getAttribute("k");
        k=k*k;
        // Output the result
        PrintWriter print = res.getWriter();
        print.println("Result: "+k);
    }
}
