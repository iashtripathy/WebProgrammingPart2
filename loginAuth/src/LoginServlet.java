import java.io.*;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.*;
import javax.servlet.http.Cookie;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class LoginServlet extends HttpServlet{
    public void doGet(HttpServletRequest req,HttpServletResponse res) throws IOException,ServletException{
        String username = req.getParameter("uname");
        String password = req.getParameter("pwd");
        if(username.equals("iash") && password.equals("123")){
            Cookie ckuname = new Cookie("username",username + "");
            //Cookie ckpwd = new Cookie("password",password);
            res.addCookie(ckuname);
            //res.addCookie(ckpwd);

            HttpSession session =  req.getSession();
            session.setAttribute("username",username);
            res.sendRedirect("welcome.jsp");
        }
        else{
            res.sendRedirect("login.jsp");
        }

        PrintWriter out = res.getWriter();
        out.println(username+" "+password);
        //res.sendRedirect("sendAdd?k="+k);
        
    }
}
