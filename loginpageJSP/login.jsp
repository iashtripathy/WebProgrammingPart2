<%@page language="java" contentType="text/html"%>
<html>
<body>
<% String uname = request.getParameter("username"); %>
<% String pword = request.getParameter("pwd"); %>
<% if(uname.equals("admin") && pword.equals("password"))
    out.println("Login Successful");
    else
    out.println("Retry Again");
%>
</body>
</html>
