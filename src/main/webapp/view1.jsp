<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="java.util.ArrayList, web.ProductBean" %>

<!DOCTYPE html>
<html>
<head>
  <meta charset="UTF-8">
  <title>Product Details</title>
  <style>
    body {
      margin: 0;
      padding: 0;
      font-family: 'Segoe UI', Tahoma, Geneva, Verdana, sans-serif;
      background: linear-gradient(to right, #fceabb, #f8b500); /* Soft golden gradient */
      color: #333;
      padding: 50px;
      text-align: center;
    }

    h1 {
      color: #2c3e50;
      margin-bottom: 30px;
    }

    table {
      width: 80%;
      margin: auto;
      border-collapse: collapse;
      background-color: #fff;
      box-shadow: 0 0 10px rgba(0,0,0,0.1);
    }

    th, td {
      padding: 12px 15px;
      border: 1px solid #ddd;
    }

    th {
      background-color: #343a40;
      color: white;
    }

    tr:nth-child(even) {
      background-color: #f2f2f2;
    }

    tr:hover {
      background-color: #e8f0fe;
    }

    .btn-group {
      margin-top: 30px;
    }

    .btn-group a {
      display: inline-block;
      background-color: #343a40;
      color: white;
      text-decoration: none;
      padding: 10px 20px;
      margin: 10px;
      border-radius: 5px;
      transition: background-color 0.3s;
    }

    .btn-group a:hover {
      background-color: #495057;
    }

    a {
      color: #007bff;
      text-decoration: none;
    }

    a:hover {
      text-decoration: underline;
    }
  </style>
</head>
<body>

<h1>All Product Details:</h1>

<table>
  <tr>
    <th>Product Code</th>
    <th>Product Name</th>
    <th>Price</th>
    <th>Stock</th>
    <th>Actions</th>
  </tr>
  <%
    @SuppressWarnings("unchecked")
    ArrayList<ProductBean> al = (ArrayList<ProductBean>) session.getAttribute("alist");
    if (al != null) {
        for (ProductBean p : al) {
  %>
  <tr>
    <td><%= p.getProcode() %></td>
    <td><%= p.getProname() %></td>
    <td><%= p.getProprice() %></td>
    <td><%= p.getProstock() %></td>
    <td>
      <a href="Edit?pcode=<%= p.getProcode() %>">Edit</a> |
      <a href="Delete?pcode=<%= p.getProcode() %>">Delete</a>
    </td>
  </tr>
  <%
        }
    } else {
  %>
  <tr><td colspan="5">No products found.</td></tr>
  <% } %>
</table>

<div class="btn-group">
  <a href="product.html">Add Product</a>
  <a href="logout">Logout</a>
</div>

</body>
</html>
