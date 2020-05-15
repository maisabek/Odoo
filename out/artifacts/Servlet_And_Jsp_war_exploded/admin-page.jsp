<%--
  Created by IntelliJ IDEA.
  User: Mimo
  Date: 03/05/2020
  Time: 2:28 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ page import="main.java.model.Product" %>
<%@ page import="java.util.List" %>
<!DOCTYPE html>
<html>
<head>
    <title>Odoo</title>
    <link rel="icon" href="images/themforestlogo1.png" type="image/gif" sizes="16x16">
    <link rel="stylesheet" href="css/font-awesome.min.css">
    <link href="https://fonts.googleapis.com/css?family=Open+Sans:400,700|Sacramento" rel="stylesheet">
    <link rel="stylesheet" href="css/bootstrap.css">
    <link rel="stylesheet" href="css/admin-page.css">
    <link rel="stylesheet" href="css/media.css">
</head>
<body>
<div class="links">
    <ul>
        <li data-class="Personal-Information" class="selected"><a>Update Personal Information</a></li>
        <li data-class="change-pass"><a>Change Password</a></li>
        <li data-class="Email-and-SMS"><a>Create Product</a></li>
        <li data-class="Manage-Contact"><a>View Product Data</a></li>
        <li>
            <div class="">
                <form action="logout" method="post">
                    <button type="submit" class="bg-muted text-dark border-0 p-2 rounded">Logout</button>
                </form>
            </div>
        </li>
        <div class="clear-fix"></div>
    </ul>
</div>
<div class="Personal-Information">
    <h5>Update Personal Information</h5>
    <div class="line"></div>
    <div class="container">
        <div class="row">
            <div class="Personal-Information-img-all col-md-4">
                <div class="Personal-Information-img"><img src="images/11.png"></div>
                <div class="p-image">
                    <i class="fa fa-pencil" aria-hidden="true"></i>
                    <input class="file-upload" type="file" accept="image/*">
                </div></div>
            <div class="mail-message-search col-md-5">
                <input type="search" placeholder="Search" name="search">
                <a class="search-link" href="#"><i class="fa fa-search" aria-hidden="true"></i></a>
            </div>
        </div>
    </div>
    <form action="update" method="post">
        <div class="form-group group1 col-md-6">
            <label>User Name:</label><br>
            <input class="form-control" type="text" placeholder="User Name" name="userName"  class="form-contol">
        </div>

        <div class="form-group group2 col-md-6">
            <label>Email:</label><br>
            <input type="text" placeholder="Email"  name="email" class="form-contol">

        </div>
        <div class="clear-fix"></div>
        <div class="form-group group3 col-md-6">
            <label>password:</label><br>
            <input type="password" placeholder="password" name="password" class="form-contol">
        </div>
        <div class="form-group group4 col-md-6">
            <label>Confirm Password:</label><br>
            <input type="password" placeholder="Confirm Password" name="confirmPassword" class="form-contol">
        </div>
        <div class="clear-fix"></div>

        <div class="form-group group6 col-md-12">
            <label>gender:</label><br>
            <select class="form-control" name="gender">
                <option selected>male</option>
                <option>female</option>
            </select>
        </div>
        <div class="form-group group8 col-md-6">
            <label>birthday:</label><br>

            <select class="form-control" name="birthday">
                <option selected>2000</option>
                <option>2001</option>
            </select>
        </div>
        <div class="form-group group7 col-md-6">
            <label>country:</label><br>
            <select class="form-control" name="country">
                <option selected>egypt</option>
                <option>america</option>
            </select>
        </div>
        <div class="clear-fix"></div>
        <a><button type="submit" class="btn-btn-info">Submit</button></a>
        <!--      <a><button  type="submit" class="btn-btn-info btn-info2">Cancel</button></a>-->
    </form>

</div>

<div class="change-pass">
    <h5>Change Password</h5>
    <div class="line"></div>
    <form>
        <div class="form-group col-md-12">
            <label>
                Current Password</label><br>
            <input type="password"  formControlName='userEmail' class="form-contol">
        </div>

        <div class="form-group col-md-12">
            <label>New Password</label>
            <input type="password" formControlName='password' class="form-contol">

        </div>
        <div class="form-group col-md-12">
            <label>Verify Password</label>
            <input type="password" formControlName='password' class="form-contol">

        </div>
        <a><button type="submit" class="btn-btn-info">Submit</button></a>
        <a><button type="submit" class="btn-btn-info btn-info2">Cancel</button></a>

    </form>
</div>
<div class="Email-and-SMS">
    <h5>Update Product Data</h5>
    <div class="line"></div>
    <div class="container">
        <div class="row">
            <form action="create" method="post">
                <div class="row">
                <div class="form-group  col-md-12">
                    <label>Product Name:</label><br>
                    <input  type="text" placeholder="product Name" name="productName"  class="col-md-12">
                </div>
                </div>
                <div class="row">
                <div class="form-group  col-md-12">
                    <label>Product Type:</label><br>
                    <input type="text" placeholder="product Type"  name="productType" class="form-contol col-md-12">

                </div></div>
                <div class="row">
                <div class="form-group  col-md-12">
                    <label>product Info:</label><br>
                    <input type="text" placeholder="product Info" name="productInfo" class="form-contol col-md-12">
                </div></div>
                <div class="row">
                <div class="form-group  col-md-12">
                    <label>product Country:</label><br>
                    <input type="text" placeholder="product Country" name="productCountry" class="form-contol col-md-12">
                </div>
                </div>
                <a><button type="submit" class="btn-btn-info">Create</button></a>
            </form>

        </div></div>
</div>
<div class="Manage-Contact">
    <input id="myInput" type="text" onkeyup="searchCurrent()" placeholder="Search..."
           style="margin-top: 15px">

    <table class="table table-striped mt-5" id="myTable">
        <thead>
        <tr>
            <th scope="col">id</th>
            <th scope="col">Product Name</th>
            <th scope="col">Product Type</th>
            <th scope="col">Product Info</th>
            <th scope="col">Product Country</th>
            <th scope="col">Action</th>
        </tr>
        </thead>
        <tbody>
        <%
            List<Product> products = service.Services.getAllProduct();
            if (products != null) {
                for (Product c : products) {
        %>
        <tr>
            <td><a href="#"><%=c.getproductId()%></a></td>
            <td id="tdId"><%= c.getproductName()%></td>
            <td><%=c.getproductType()%></td>
            <td><%=c.getproductInfo()%></td>
            <td><%=c.getproductCountry()%></td>
            <td>
               <a href="productForm.jsp"><button id="button-edit" type="submit" class="button__primary bg-secondary text-light p-2 border-0"><i class="fa fa-pencil" aria-hidden="true"></i>
                    Edit</button></a>
               <a> <button type="button" id="button-delete" class="button__delete waves-effect materialize-red text-light p-2 border-0 bg-danger" onclick="getId()"><i
                        class="far fa-trash-alt"></i> Delete</button></a>
            </td>

        </tr>
        <%
                }
            }
        %>

        </tbody>
    </table>

</div>

<script src="js/jquery-1.11.1.min.js"></script>
<script src="js/bootstrap.min.js"></script>
<script src="js/custom.js"></script>
</body>
</html>
