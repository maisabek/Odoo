//package service;
//import utils.DBConn;
//
//import java.sql.Connection;
//import java.sql.PreparedStatement;
//import java.sql.ResultSet;
//import java.sql.SQLException;
//import java.util.ArrayList;
//import java.util.List;
//import java.sql.*;
//public class DBServices {
//    public static int insertConference(Conference conference) {
//        try {
//            PreparedStatement statement = DBConn.getConnection().prepareStatement("insert  into  confrence value (null,?,?,?,?)");
//            statement.setInt(1, conference.getUid());
//            statement.setString(2, conference.getTitle());
//            statement.setString(3, conference.getDesc());
//            statement.setString(4, conference.getOptions());
//            if (statement.executeUpdate() > 0) {
//                return 1;
//            }
//        } catch (SQLException e) {
//            e.printStackTrace();
//        }
//
//
//        return 0;
//    }
//
//    public static List<Conference> getConferences() {
//        List<Conference> conferences = new ArrayList<Conference>();
//        try {
//            PreparedStatement statement = DBConn.getConnection().prepareStatement("select * from confrence");
//            ResultSet resultSet = statement.executeQuery();
//            while (resultSet.next()) {
//                Conference conference = new Conference(resultSet.getInt("cid"), resultSet.getInt("uid"), resultSet.getString("title"),
//                        resultSet.getString("desc"), resultSet.getString("options"));
//                conferences.add(conference);
//            }
//            return conferences;
//        } catch (SQLException e) {
//            e.printStackTrace();
//        }
//        return null;
//    }
//
//    public static ResultSet getSchedule() {
//        try {
//            Connection con = DBConn.getConnection();
//            PreparedStatement statement = con.prepareStatement("select  * from schedule_conf");
//            return statement.executeQuery();
//
//        } catch (SQLException e) {
//            e.printStackTrace();
//        }
//        return null;
//    }
//
//    public static ResultSet getActiveSubmissions() throws SQLException {
//        Connection connection = DBConn.getConnection();
//        PreparedStatement preparedStatement = connection.prepareStatement(
//                "SELECT * FROM `papers`"
//        );
//        ResultSet resultSet = preparedStatement.executeQuery();
//        if (resultSet.getFetchSize() > 0) {
//            return resultSet;
//        }
//
//        return null;
//    }
//
//    public static int insertScheduledConferences(ScheduledConference conference) {
//        try {
//
//            PreparedStatement statement = DBConn.getConnection().prepareStatement("insert  into  schedule_conf value (null,?,?,?,?,?,?)");
//            statement.setInt(1, conference.getCid());
//            statement.setString(2, conference.getTitle());
//            statement.setString(3, conference.getDesc());
//            statement.setString(4, conference.getStartDate());
//            statement.setString(5, conference.getEndDate());
//            statement.setBoolean(6, conference.isArchived());
//            if (statement.executeUpdate() > 0) {
//                return 1;
//            }
//        } catch (SQLException e) {
//            e.printStackTrace();
//        }
//        return 0;
//    }
//
//    public static ResultSet getenrollment(String sid) {
//        try {
//            Connection con = DBConn.getConnection();
//            PreparedStatement statement = con.prepareStatement("SELECT * FROM schedule_conf INNER JOIN conf_roles on schedule_conf.sid=conf_roles.sid INNER JOIN users on conf_roles.uid=users.uid where schedule_conf.sid =?");
//            statement.setString(1,sid);
//            return statement.executeQuery();
//
//        } catch (SQLException e) {
//            e.printStackTrace();
//        }
//        return null;
//    }
//
//    public static void updateTrack(String s1,String s2,String s3,String s4){
//        try {
//            java.sql.Connection con;
//            Connection connection = utils.DBConn.getConnection();
//            String query1 = "UPDATE `tracks` SET `sched_conf_id` = ?, `title` = ?, `desc` = ? WHERE `tracks`.`track_id` = "+Integer.parseInt(s1);
//            PreparedStatement statement = null;
//            statement = connection.prepareStatement(query1);
//            statement.setString(1,s2);
//            statement.setString(2, s3);
//            statement.setString(3, s4);
//            int count = statement.executeUpdate();
//        }
//        catch(SQLException e) {
//            e.getMessage();
//        }
//    }
//    public static void deleteTrack(String s1) {
//        try {
//            java.sql.Connection con;
//            Connection connection =utils.DBConn.getConnection();
//            Statement stm=(Statement) connection.createStatement();
//            stm.executeUpdate("DELETE FROM `tracks` WHERE track_id="+Integer.parseInt(s1));
//        }
//        catch(SQLException e) {
//            e.getMessage();
//        }
//    }
//
//    public static void insertTrack(String s1,String s2,String s3,String s4) {
//        try {
//            Connection connection = utils.DBConn.getConnection();
//            Statement stm=(Statement) connection.createStatement();
//            stm.executeUpdate("insert into tracks values(null,'"+s2+"','"+s3+"','"+s4+"');");
//        }
//        catch(SQLException e) {
//            e.getMessage();
//        }
//    }}
//



