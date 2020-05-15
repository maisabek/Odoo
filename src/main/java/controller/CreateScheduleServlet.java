package controller;

//import service.DBServices;

//import javax.servlet.ServletException;
//import javax.servlet.http.HttpServlet;
//import javax.servlet.http.HttpServletRequest;
//import javax.servlet.http.HttpServletResponse;
//import java.io.IOException;
//
//import static utils.UtilityServices.displayAlert;
//import static utils.UtilityServices.isEmpty;
//
//public class CreateScheduleServlet extends HttpServlet {
//    @Override
//    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
//        String title = req.getParameter("title");
//        String desc = req.getParameter("desc");
//        String startDate = req.getParameter("sDate");
//        String endDate = req.getParameter("eDate");
//        int cid = Integer.parseInt(req.getParameter("cid"));
//        if (!isEmpty(title) && !isEmpty(desc) && !isEmpty(startDate)) {
//            ScheduledConference scheduledConference = new ScheduledConference(cid, title, desc, startDate, endDate, false);
//            if (DBServices.insertScheduledConferences(scheduledConference) == 1) {
//                resp.sendRedirect("schedule_management.jsp");
//            } else {
//
//                displayAlert("schedule_conference_form.jsp", req, resp, 0, "Error", "Can't insert this schedule in DB");
//            }
//        } else {
//            displayAlert("schedule_conference_form.jsp", req, resp, 0, "Error", "Can't insert this schedule in DB");
//        }
//    }
//}
