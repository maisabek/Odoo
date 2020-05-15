package main.java.controller;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import model.User;
import service.Services;

import static utils.UtilityServices.isEmpty;
@WebServlet(name = "registerServlet")
public class registerServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
            String userName=request.getParameter("userName");
            String email=request.getParameter("email");
            String password=request.getParameter("password");
            String confirmPassword=request.getParameter("confirmPassword");
            String gender=request.getParameter("gender");
            String birthday=request.getParameter("birthday");
            String country=request.getParameter("country");
            if(!isEmpty(userName) && !isEmpty(email) && !isEmpty(password) && !isEmpty(confirmPassword) && !isEmpty(gender) && !isEmpty(birthday) && !isEmpty(country)  ){
                User user=new User(userName,email,password,confirmPassword,gender,birthday,country);
                Services.register(user,request.getSession());
                response.sendRedirect("index.jsp");
            }
    }
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {}
}
