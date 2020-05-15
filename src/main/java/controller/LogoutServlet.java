package main.java.controller;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "LogoutServlet")
public class LogoutServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        System.out.println("Loged out");
        request.getSession().invalidate();
        response.sendRedirect("index.jsp");
    }
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {}
}