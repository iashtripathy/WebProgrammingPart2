import java.io.*;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
public class DataFromServlet extends HttpServlet{
    public void doGet(HttpServletRequest req,HttpServletResponse res) throws IOException,ServletException{
        
        int result=0;
        //this receives the cookies from req object
        Cookie cookies[] = req.getCookies();
        for(Cookie c:cookies){
            if(c.getName().equals("k")){
                result = Integer.parseInt(c.getValue());
            }
        }

        PrintWriter out = res.getWriter();
        
        out.println("Result is:"+result);
    }
}
