package service;
import utils.DBConn;
import model.User;
import main.java.model.Product;
import java.util.ArrayList;
import java.util.List;
import javax.servlet.http.HttpSession;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.*;

public class Services {
    public static int register(User user, HttpSession session) {
        try {
            PreparedStatement statment = DBConn.getConnection().prepareStatement("insert into users value (null,?,?,?,?,?,?,?)",Statement.RETURN_GENERATED_KEYS);
            statment.setString(1,user.getuserName());
            statment.setString(2,user.getemail());
            statment.setString(3,user.getpassword());
            statment.setString(4,user.getconfirmPassword());
            statment.setString(5,user.getgender());
            statment.setString(6,user.getbirthday());
            statment.setString(7,user.getcountry());
            if(statment.executeUpdate() > 0){
                ResultSet result=statment.getGeneratedKeys();
                result.next();
               // user.setid(result.getInt("id"));
                session.setAttribute("current",user);
                return 1;
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return 0;
    }
    public static int creatProduct(Product product, HttpSession session) {
        try {
            PreparedStatement statment = DBConn.getConnection().prepareStatement("insert into product value (null,?,?,?,?)",Statement.RETURN_GENERATED_KEYS);
            statment.setString(1,product.getproductName());
            statment.setString(2,product.getproductType());
            statment.setString(3,product.getproductInfo());
            statment.setString(4,product.getproductCountry());
            if(statment.executeUpdate() > 0){
                ResultSet result=statment.getGeneratedKeys();
                result.next();
                // user.setid(result.getInt("id"));
                session.setAttribute("prod",product);
                return 1;
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return 0;
    }
        public static User loginUser(User user) {
        try {
            PreparedStatement statement = DBConn.getConnection().prepareStatement("select * from users where email= ?");
            statement.setString(1, user.getemail());
            ResultSet rs = statement.executeQuery();
            if (!rs.next()) {
                return null;
            }
            if (user.getpassword().equals(rs.getString("password"))) {
                User loggedUser = new User(rs.getInt("id"), rs.getString("userName") , rs.getString("email"), rs.getString("password"), rs.getString("confirmPassword"), rs.getString("gender"),rs.getString("birthday"), rs.getString("country"));
                return loggedUser;
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }

        public static void  update(User user,String old_email){
        try {
            System.out.println("Authservice1");
            Connection conn=DBConn.getConnection();
            PreparedStatement statement=conn.prepareStatement("update users set userName=?,email=?,password=?,confirmPassword=?,gender=?,birthday=?,country=? where email=?");
            statement.setString(1,user.getuserName());
            statement.setString(2,user.getemail());
            statement.setString(3,user.getpassword());
            statement.setString(4,user.getconfirmPassword());
            statement.setString(5,user.getgender());
            statement.setString(6,user.getbirthday());
            statement.setString(7,user.getcountry());
            statement.setString(8,old_email);

            System.out.println("Authservice1");
            statement.executeUpdate();
            System.out.println("execute update");

            statement.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }

    }

    public static void  updateProduct(Product product,String old_email){
        try {
            System.out.println("Authservice1");
            Connection conn=DBConn.getConnection();
            PreparedStatement statement=conn.prepareStatement("update product set productName=?,productType=?,productInfo=?,productCountry=? where productName=?");
            statement.setString(1,product.getproductName());
            statement.setString(2,product.getproductType());
            statement.setString(3,product.getproductInfo());
            statement.setString(4,product.getproductCountry());
            statement.setString(5,old_email);
            System.out.println("Authservice1");
            statement.executeUpdate();
            System.out.println("execute update");

            statement.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }

    }
        public static List<Product> getAllProduct() {
        List<Product> products = new ArrayList<Product>();
        try {
            PreparedStatement statement = DBConn.getConnection().prepareStatement("select * from product");
            ResultSet resultSet = statement.executeQuery();
            while (resultSet.next()) {
                Product product = new Product(resultSet.getInt("productId"),resultSet.getString("productName"),resultSet.getString("productType"),
                        resultSet.getString("productInfo"), resultSet.getString("productCountry"));
                products.add(product);
            }
            return products;
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }
    public static void deleteProduct(String productName) {
        try {
            PreparedStatement statement = DBConn.getConnection().prepareStatement("delete  from product where productName=?");
            statement.setString(1,productName);
            statement.executeUpdate();
        }
        catch(SQLException e) {
            e.getMessage();
        }
    }

}
