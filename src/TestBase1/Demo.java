/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TestBase1;

import java.sql.*;

/**
 *
 * @author user
 */
public class Demo {
    public static void main(String[] args) {
        String url = "jdbc:mysql://localhost:3306/mysql?useUnicode=true&useJDBCCompliantTimezoneShift="
    + "true&useLegacyDatetimeCode=false&serverTimezone=UTC";
    String username = "root";
    String password = "";
    
    try {
    Class.forName("com.mysql.cj.jdbc.Driver");
    Connection connection = DriverManager.getConnection(url,username,password);
    Statement statement = connection.createStatement();
    ResultSet resulSet = statement.executeQuery("SELECT Host, User FROM user");
    
    while (resulSet.next()) {
        System.out.println(resulSet.getString(1)+ " "+resulSet.getString(2));
    }
    resulSet.close();
    statement.close();
   } catch (SQLException e) {
   e.printStackTrace();
   } catch (ClassNotFoundException e) {
   e.printStackTrace();
   }
    }
}
