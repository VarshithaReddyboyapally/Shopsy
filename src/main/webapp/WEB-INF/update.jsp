<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<%
String msg =(String)request.getAttribute("msg");
%>
<h2><%= msg %></h2>

<a href="Viewproduct">View All Products</a>
<a href="logout">Logout</a>
</body>
</html>