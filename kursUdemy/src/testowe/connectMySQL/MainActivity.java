package testowe.connectMySQL;

import java.sql.*;

public class MainActivity {
    public static void main(String[] args) {
        String host = "jdbc:mysql://127.0.0.1:3306/employee101";
        String username = "root@127.0.0.1";
        String password = "";
        try {
            System.out.println("czyjednak");
            Connection conn = DriverManager.getConnection(host, username, password);
            System.out.println("Connected to MySQL database");
        } catch (SQLException e) {
            System.out.println("Failed to connect to MySQL database");
            e.printStackTrace();
        }
    }
}
