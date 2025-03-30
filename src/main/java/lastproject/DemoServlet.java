package lastproject;

import java.io.IOException;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/demo")
public class DemoServlet extends HttpServlet {
    
    protected void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
        Student s = new Student(2, "nitu");
        
        req.setAttribute("student", s); 
        
        RequestDispatcher dr = req.getRequestDispatcher("Display.jsp");
        dr.forward(req, res);
    }
}
