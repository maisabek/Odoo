package utils;


import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class UtilityServices {
    public static void displayAlert(String current, HttpServletRequest req, HttpServletResponse resp, int type, String title, String message) {
        req.getSession().setAttribute("type", type);
        req.getSession().setAttribute("title", title);
        req.getSession().setAttribute("message", message);
        try {
            req.getRequestDispatcher(current).include(req, resp);
            req.getRequestDispatcher("alert.jsp").include(req, resp);
        } catch (ServletException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
//    public static void sendEmail(String receiver, String name) {
//        Properties prop = new Properties();
//        prop.put("mail.smtp.auth", true);
//        prop.put("mail.smtp.starttls.enable", "true");
//        prop.put("mail.smtp.host", "smtp.gmail.com");
//        prop.put("mail.smtp.port", "587");
//        prop.put("mail.smtp.ssl.trust", "smtp.gmail.com");
//        Session session = Session.getInstance(prop, new Authenticator() {
//            @Override
//            protected PasswordAuthentication getPasswordAuthentication() {
//                return new PasswordAuthentication("consys74@gmail.com", "Mm1023456789");
//            }
//        });
//        Message message = new MimeMessage(session);
//        try {
//            message.setFrom(new InternetAddress("consys74@gmail.com"));
//            message.setRecipients(
//                    Message.RecipientType.TO, InternetAddress.parse(receiver));
//            message.setSubject("CMS");
//
//            String msg = "Thanks For Using our system : " + name;
//
//            MimeBodyPart mimeBodyPart = new MimeBodyPart();
//            mimeBodyPart.setContent(msg, "text/html");
//
//            Multipart multipart = new MimeMultipart();
//            multipart.addBodyPart(mimeBodyPart);
//
//            message.setContent(multipart);
//
//            Transport.send(message);
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
//
//    }

    public static boolean isEmpty(String textField) {
        if (textField != null) {
            if (!textField.trim().isEmpty()) {
                return false;
            }
        }
        return true;
    }
}
