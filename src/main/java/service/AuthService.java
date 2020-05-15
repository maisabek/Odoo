//package service;
import model.User;
import utils.DBConn;
import javax.servlet.http.HttpSession;
import java.sql.*;
//public class AuthService {
//    public static int registerUser(User user, HttpSession session) {
//        try {
//            PreparedStatement statement = DBConn.getConnection().prepareStatement("insert into users value (null,?,?,?,?,?,?,?,?)", Statement.RETURN_GENERATED_KEYS);
//            statement.setString(1, user.getEmail());
//            statement.setString(2, user.getUsername());
//            statement.setString(3, user.getName());
//            statement.setString(4, user.getPassword());
//            statement.setString(5, user.getGender());
//            statement.setString(6, user.getCountry());
//            statement.setString(7, user.getAccountType());
//            statement.setString(8, user.getOptions());
//            if (statement.executeUpdate() > 0) {
//                ResultSet rs = statement.getGeneratedKeys();
//                rs.next();
//                user.setUid(rs.getInt("uid"));
//                session.setAttribute("current", user);
//                return 1;
//            }
//        } catch (SQLException e) {
//            e.printStackTrace();
//        }
//        return 0;
//    }
//
//    public static User loginUser(User user) {
//        try {
//            PreparedStatement statement = DBConn.getConnection().prepareStatement("select * from users where email= ?");
//            statement.setString(1, user.getEmail());
//            ResultSet rs = statement.executeQuery();
//            if (!rs.next()) {
//                return null;
//            }
//            if (user.getPassword().equals(rs.getString("pass"))) {
//                User loggedUser = new User(rs.getInt("uid"), rs.getString("email"), rs.getString("username")
//                        , rs.getString("fullName"), rs.getString("pass"), rs.getString("gender"), rs.getString("country"),
//                        rs.getString("account_type"), rs.getString("options"));
//                return loggedUser;
//            }
//        } catch (SQLException e) {
//            e.printStackTrace();
//        }
//        return null;
//    }
//
//    public static void  update(User user,String old_email){
//        try {
//            System.out.println("Authservice1");
//            Connection conn=DBConn.getConnection();
//            PreparedStatement statement=conn.prepareStatement("update users set email=?,username=?,fullName=?,pass=?,gender=?,country=?,account_type=?,options=? where email=?");
//
//            statement.setString(1,user.getEmail());
//            statement.setString(2,user.getUsername());
//            statement.setString(3,user.getName());
//            statement.setString(4,user.getPassword());
//            statement.setString(5,user.getGender());
//            statement.setString(6,user.getCountry());
//            statement.setString(7,user.getAccountType());
//            statement.setString(8,"options");
//            statement.setString(9,old_email);
//            System.out.println("Authservice1");
//            statement.executeUpdate();
//            System.out.println("execute update");
//
//            statement.close();
//        } catch (SQLException e) {
//            e.printStackTrace();
//        }
//
//    }
//
//
//}
