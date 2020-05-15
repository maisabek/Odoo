//package controller;
//
//import model.Conference;
//import model.User;
//import service.DBServices;
//import utils.UtilityServices;
//
//import javax.servlet.ServletException;
//import javax.servlet.http.HttpServlet;
//import javax.servlet.http.HttpServletRequest;
//import javax.servlet.http.HttpServletResponse;
//import java.io.IOException;
//
//public class CreateConferenceServlet extends HttpServlet {
//    @Override
//    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
//        String title = req.getParameter("title");
//        String desc = req.getParameter("desc");
//        User currentUser = (User) req.getSession().getAttribute("current");
//        if (!UtilityServices.isEmpty(title) && !UtilityServices.isEmpty(desc)) {
//            Conference conference = new Conference(currentUser.getUid(), title, desc, "options");
//            if (DBServices.insertConference(conference) == 1) {
//                resp.sendRedirect("conference_page.jsp");
//            } else {
//
//            }
//        } else {
//
//        }
//    }
//}
