<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ page import="java.util.ArrayList, web.ProductBean" %>
<!DOCTYPE html>
<html>
<head>
  <meta charset="UTF-8">
  <title>Product List</title>
  <style>
    body {
      font-family: 'Segoe UI', Tahoma, Geneva, Verdana, sans-serif;
      background: linear-gradient(to right, #fdfbfb, #ebedee);
      padding: 40px;
    }

    h1 {
      text-align: center;
      color: #333;
      margin-bottom: 30px;
    }

    table {
      margin: auto;
      border-collapse: collapse;
      width: 90%;
      background-color: #fff;
      box-shadow: 0 4px 12px rgba(0, 0, 0, 0.1);
    }

    th, td {
      padding: 12px 15px;
      border-bottom: 1px solid #ddd;
      text-align: center;
    }

    th {
      background-color: #007BFF;
      color: white;
    }

    tr:hover {
      background-color: #f1f1f1;
    }

    a {
      text-decoration: none;
      padding: 8px 14px;
      background-color: #28a745;
      color: white;
      border-radius: 5px;
      transition: 0.3s ease;
    }

    a:hover {
      background-color: #218838;
    }

    .btn-group {
      text-align: center;
      margin-top: 30px;
    }

    .btn-group a {
      background-color: #dc3545;
      padding: 10px 20px;
    }

    .btn-group a:hover {
      background-color: #c82333;
    }
  </style>
</head>
<body>

<h1>All Product Details</h1>

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
    if (al != null && !al.isEmpty()) {
      for (ProductBean p : al) {
  %>
  <tr>
    <td><%= p.getProcode() %></td>
    <td><%= p.getProname() %></td>
    <td><%= p.getProprice() %></td>
    <td><%= p.getProstock() %></td>
    <td>
      <a href="Buy1?pcode=<%= p.getProcode() %>">Buy</a>
    </td>
  </tr>
  <%
      }
    } else {
  %>
  <tr>
    <td colspan="5">No products found.</td>
  </tr>
  <% } %>
</table>

<div class="btn-group">
  <a href="logout">Logout</a>
</div>

</body>
</html>
