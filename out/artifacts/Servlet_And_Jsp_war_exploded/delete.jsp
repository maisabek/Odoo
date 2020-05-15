<%--
  Created by IntelliJ IDEA.
  User: Mimo
  Date: 03/05/2020
  Time: 5:16 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ page import="java.sql.*"%>
<%@ page import="main.java.model.Product" %>
<%@ page import="service.Services" %>
<html>
<head>
    <title>Edit page</title>
</head>
<body>
<%
    Product product= new Product();
    Services.deleteProduct(product.getproductName());
    response.sendRedirect("admin-page.jsp");

%>
</body>
</html>