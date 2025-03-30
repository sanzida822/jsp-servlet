package loginpackage;

import java.io.IOException;
import java.io.PrintWriter;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

import javax.security.auth.message.callback.PrivateKeyCallback.Request;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import javax.websocket.Session;

@WebServlet("/LoginPage")
public class loginServlet extends HttpServlet{
    
    public void doPost(HttpServletRequest req, HttpServletResponse res) throws IOException {
    	String uname=req.getParameter("username");
    	String password=req.getParameter("password");
    	if(uname.equals("sanzida") && password.equals("12345")) {
    		HttpSession ses= req.getSession();
    		ses.setAttribute("uname",uname );
    		res.sendRedirect("Welcome.jsp");
    		
    		
    	}
    	else {
    		res.sendRedirect("login.jsp");
    		
    		
    	}
    	PrintWriter pr=res.getWriter();
    	pr.println("login page");
	
	
	
}
}
