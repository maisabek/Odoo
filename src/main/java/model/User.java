package model;

public class User {
    private int id;
    private String userName;
    private String email;
    private String password;
    private String confirmPassword;
    private String gender;
    private String birthday;
    private String country;

    public User(String userName, String email, String password, String confirmPassword, String gender, String birthday,String country) {
        this.userName = userName;
        this.email = email;
        this.password = password;
        this.confirmPassword = confirmPassword;
        this.gender = gender;
        this.birthday = birthday;
        this.country = country;
    }

    public User(int id,String userName, String email, String password, String confirmPassword, String gender, String birthday,String country) {
        this.id = id;
        this.userName = userName;
        this.email = email;
        this.password = password;
        this.confirmPassword = confirmPassword;
        this.gender = gender;
        this.birthday = birthday;
        this.country = country;
    }

    public User() {
    }

    public int getid() {
        return id;
    }

    public void setid(int id) {
        this.id = id;
    }
    public String getuserName() {
        return userName;
    }

    public void setuserName(String userName) {
        this.userName = userName;
    }

    public String getemail() {
        return email;
    }

    public void setemail(String email) {
        this.email = email;
    }


    public String getpassword() {
        return password;
    }

    public void setpassword(String password) {
        this.password = password;
    }

    public String getconfirmPassword() {
        return confirmPassword;
    }

    public void setconfirmPassword(String confirmPassword) {
        this.confirmPassword = confirmPassword;
    }


    public String getgender() {
        return gender;
    }

    public void setgender(String gender) {
        this.gender = gender;
    }

    public String getbirthday() {
        return birthday;
    }

    public void setbirthday(String birthday) {
        this.birthday = birthday;
    }

    public String getcountry() {
        return country;
    }

    public void setcountry(String country) {
        this.country = country;
    }

}
