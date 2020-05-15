package main.java.controller;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

@WebServlet(name = "LoginServlet")
public class LoginServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String email = request.getParameter("email");
        String pass = request.getParameter("password");
        if (!utils.UtilityServices.isEmpty(email) && !utils.UtilityServices.isEmpty(pass)) {
            model.User user = new model.User();
            user.setemail(email);
            user.setpassword(pass);
            model.User currentUser = service.Services.loginUser(user);
            if (currentUser != null) {
                HttpSession session = request.getSession();
                session.setAttribute("current", currentUser);
                request.getRequestDispatcher("admin-page.jsp").forward(request, response);
                System.out.println("Logged IN");
            } else {
                utils.UtilityServices.displayAlert("login.html", request, response, 0, "Authentication Error", "Check your email and password");
            }
        }
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
