import java.io.*;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.*;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class AddDataFromServlet extends HttpServlet{
    public void doGet(HttpServletRequest req,HttpServletResponse res) throws IOException,ServletException{
        int i = Integer.parseInt(req.getParameter("num1"));
        int j = Integer.parseInt(req.getParameter("num2"));
        int k = i+j;

        PrintWriter out = res.getWriter();
        
        req.setAttribute("k",k);
        
        RequestDispatcher rd = req.getRequestDispatcher("sendAdd");
        rd.forward(req,res);
        //out.println("i+j:"+ k);
    }
}
