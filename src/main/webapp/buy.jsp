<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" import="web.*"%>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<%
CustomerBean cb=(CustomerBean)session.getAttribute("cbean");
ProductBean pb = (ProductBean)session.getAttribute("pb");
out.println(cb.getUname());
out.println(pb.getProcode());
out.println(pb.getProname());
out.println(pb.getProprice());
out.println(pb.getProstock());
%>
</body>
</html>