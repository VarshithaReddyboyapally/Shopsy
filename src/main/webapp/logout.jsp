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
String emsg = (String)request.getAttribute("logoutmsg");
out.println(emsg);

%>
<%@include file="Login.html"
%>
</body>
</html>