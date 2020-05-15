package main.java.controller;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import main.java.model.Product;

import static utils.UtilityServices.isEmpty;

@WebServlet(name = "CreateProductServlet")
public class CreateProductServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String productName=request.getParameter("productName");
        String productType=request.getParameter("productType");
        String productInfo=request.getParameter("productInfo");
        String productCountry=request.getParameter("productCountry");
        if(!isEmpty(productName) && !isEmpty(productType) && !isEmpty(productInfo) && !isEmpty(productCountry)){
            Product product=new Product(productName,productType,productInfo,productCountry);
            service.Services.creatProduct(product,request.getSession());
            response.sendRedirect("index.jsp");
        }
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
