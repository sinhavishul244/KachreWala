<%@page import="springmvc.model.UserModel"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>


<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

	<%
	out.println("<h3>You are successfully registered<h3>");
	out.println("<h4><a href='/springmvc/login'>Click here to login</a>");
	%>
	

</body>
</html>