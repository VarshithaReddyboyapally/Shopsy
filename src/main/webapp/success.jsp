<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
  <meta charset="UTF-8">
  <title>Welcome Page</title>
  <style>
    body {
      margin: 0;
      padding: 0;
      font-family: 'Segoe UI', Tahoma, Geneva, Verdana, sans-serif;
      background: linear-gradient(to right, #e0c3fc, #8ec5fc); /* soft purple-blue gradient */
      text-align: center;
      padding-top: 100px;
      color: #333;
    }

    h1 {
      font-size: 2.5rem;
      color: #222;
      margin-bottom: 40px;
    }

    button {
      background-color: #343a40;
      color: #f8f9fa;
      padding: 12px 30px;
      margin: 15px;
      border: none;
      border-radius: 8px;
      font-size: 16px;
      cursor: pointer;
      transition: background-color 0.3s;
    }

    button:hover {
      background-color: #495057;
    }

    a {
      color: inherit;
      text-decoration: none;
    }
  </style>
</head>
<body>

<%
  String name = (String) request.getAttribute("name");
%>

<h1>Welcome, <%= name %></h1>

<button><a href="product.html">Add Product</a></button>
<button><a href="Viewproduct">View Product</a></button>
<button><a href="logout">Logout</a></button>

</body>
</html>
