<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@page import="web.ProductBean"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<%
ProductBean pb =(ProductBean)request.getAttribute("productedit");
%>
<form action="UpdateProduct"  method="post">
<h2>Update Product</h2>
<input type ="hidden" name="pcode" value="<%=pb.getProcode() %>">
<input type="hidden" name="pname" value ="<%=pb.getProname() %>">
<label>price</label>
<input type= "number" name="pprice" value="<%=pb.getProprice() %>">
<label>Quantity</label>
<input type="number" name="pstock" value="<%=pb.getProstock()%>">
<input type="submit" value="update">
</form>
</body>
</html>