package main.java.controller;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import service.Services;
import model.User;

@WebServlet(name = "UpdateServlet")
public class UpdateServlet extends HttpServlet{
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
        HttpSession session = request.getSession();
        User current=(User)session.getAttribute("current");
        String old_email=current.getemail();
        User user= new User();
        user.setuserName(request.getParameter("userName"));
        user.setemail(request.getParameter("email"));
        user.setpassword(request.getParameter("password"));
        user.setconfirmPassword(request.getParameter("confirmPassword"));
        user.setgender(request.getParameter("gender"));
        user.setbirthday(request.getParameter("birthday"));
        user.setcountry(request.getParameter("country"));
        Services.update(user,old_email);
        response.sendRedirect("index.jsp");
    }
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {}
}
