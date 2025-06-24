<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<%String msg=(String)request.getAttribute("msg"); %>
<h1><%= msg %></h1>
<a href="product.html">Addproduct</a>
<a href="Viewproduct">View All Products</a>
<a href="logout">Logout</a>
</body>
</html>