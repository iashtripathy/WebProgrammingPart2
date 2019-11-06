<%@page language="java" contentType="text/html"%>
<html>
<body>
<%    
    /*Cookie cookies[] = request.getCookies();
        for(Cookie c:cookies){
            if(!c.getName().equals("username")){
                response.sendRedirect("login.jsp");
            }
        }*/
        //session.removeAttribute("username");
        //add above statement to remove session details
        //session.invalidate();
        if(session.getAttribute("username")==null){
            response.sendRedirect("login.jsp");
        }
    
%>
<p>Welcome Page !!!</p>
</body>
</html>
