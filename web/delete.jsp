
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