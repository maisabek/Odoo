
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ page import="main.java.model.Product" %>
<%@ page import="java.util.List" %>

<%@ page import="service.Services" %>
<html>
<head>
    <title>update user data</title>
</head>
<body>
<%
    Product current=(Product) session.getAttribute("prod");
    String old_email=current.getproductName();

    Product product= new Product();
    product.setproductName(request.getParameter("productName"));
    product.setproductType(request.getParameter("productType"));
    product.setproductInfo(request.getParameter("productInfo"));
    product.setproductCountry(request.getParameter("productCountry"));
    List<Product> products = service.Services.getAllProduct();
    if (products != null){
        for (Product c : products) {
    Services.updateProduct(product, c.getproductName());
    System.out.println(old_email);
    }}
    response.sendRedirect("admin-page.jsp");

%>

</body>
</html>
