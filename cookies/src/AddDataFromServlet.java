import java.io.*;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class AddDataFromServlet extends HttpServlet{
    public void doGet(HttpServletRequest req,HttpServletResponse res) throws IOException,ServletException{
        int i = Integer.parseInt(req.getParameter("num1"));
        int j = Integer.parseInt(req.getParameter("num2"));
        int k = i+j;

        Cookie ck = new Cookie("k",k + ""); //putting the k value in a cookie
        res.addCookie(ck); //adding the cookie to response object
        
        //from this servlet the request for sendAdd goes to client and from there it requests for sendAdd and DataFromServlet responds
        res.sendRedirect("sendAdd"); 
        
    }
}
