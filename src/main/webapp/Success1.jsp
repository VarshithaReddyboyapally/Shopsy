<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" import="web.*" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Welcome - Shopsy</title>
<style>
  body {
    margin: 0;
    padding: 0;
    font-family: 'Segoe UI', Tahoma, Geneva, Verdana, sans-serif;
    background: linear-gradient(to right, #fbd3e9, #bb377d); /* Pink-purple gradient */
    display: flex;
    flex-direction: column;
    align-items: center;
    justify-content: center;
    height: 100vh;
    color: #fff;
  }

  h1 {
    margin-bottom: 30px;
  }

  button {
    background-color: #000;
    color: #fff;
    padding: 12px 25px;
    margin: 10px;
    border: none;
    border-radius: 6px;
    font-size: 16px;
    cursor: pointer;
    transition: background 0.3s;
  }

  button:hover {
    background-color: #333;
  }

  a {
    color: white;
    text-decoration: none;
  }
</style>
</head>
<body>

<%
  CustomerBean cb = (CustomerBean) session.getAttribute("cbean");
  if (cb != null) {
%>
  <h1>Welcome, <%= cb.getUname() %>!</h1>
  <button><a href="Custview">Customer Product</a></button>
  <button><a href="logout">Logout</a></button>
<%
  } else {
%>
  <h1>Session expired. Please <a href="Customer.html" style="color: yellow;">login again</a>.</h1>
<%
  }
%>

</body>
</html>
