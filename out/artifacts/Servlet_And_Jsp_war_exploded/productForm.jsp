<%--
  Created by IntelliJ IDEA.
  User: Mimo
  Date: 03/05/2020
  Time: 5:40 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
    <link rel="icon" href="images/themforestlogo1.png" type="image/gif" sizes="16x16">
    <link rel="stylesheet" href="css/font-awesome.min.css">
    <link href="https://fonts.googleapis.com/css?family=Open+Sans:400,700|Sacramento" rel="stylesheet">
    <link rel="stylesheet" href="css/bootstrap.css">
    <link rel="stylesheet" href="css/admin-page.css">
    <link rel="stylesheet" href="css/media.css">
</head>
<body>

<div class="Personal-Information">
    <h5>Update Product Data</h5>
    <div class="line"></div>
    <div class="container">
        <div class="row">
    <form action="update.jsp">
        <div class="form-group group1 col-md-12">
            <label>Product Name:</label><br>
            <input class="form-control" type="text" placeholder="product Name" name="productName"  class="form-contol">
        </div>

        <div class="form-group group2 col-md-12">
            <label>Product Type:</label><br>
            <input type="text" placeholder="product Type"  name="productType" class="form-contol">

        </div>
        <div class="form-group group3 col-md-12">
            <label>product Info:</label><br>
            <input type="text" placeholder="product Info" name="productInfo" class="form-contol">
        </div>
        <div class="form-group group4 col-md-12">
            <label>product Country:</label><br>
            <input type="text" placeholder="product Country" name="productCountry" class="form-contol">
        </div>
        <a><button type="submit" class="btn-btn-info">Update</button></a>
        <!--      <a><button  type="submit" class="btn-btn-info btn-info2">Cancel</button></a>-->
    </form>

        </div></div>
</div>
<script src="js/jquery-1.11.1.min.js"></script>
<script src="js/bootstrap.min.js"></script>
<script src="js/custom.js"></script>
</body>
</html>
