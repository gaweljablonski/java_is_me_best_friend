package testowe.connectMySQL;

import java.sql.*;

public class MainActivity {
    public static void main(String[] args) {
//        String host = "jdbc:mysql://localhost:3306/employee101";
        String host = "jdbc:mysql://localhost:3306/employee101";
        String username = "root";
        String password = "";

        Connection connection = null;


        try {
            // load and register JDBC driver for MySQL
//            Class.forName("com.mysql.cj.jdbc.Driver");
            Class.forName("org.mariadb.jdbc.Driver");
            // Establishing a connection to the database
            connection = DriverManager.getConnection(host, username, password);
            System.out.println("Connected to the database!");

            // Creating a statement
            Statement statement = connection.createStatement();

            // SQL query to retrieve data
            String sqlQuery = "SELECT id, name, age FROM employee_data";

            // Executing the query
            ResultSet resultSet = statement.executeQuery(sqlQuery);

            // Processing the result set
            while (resultSet.next()) {
                int id = resultSet.getInt("id");
                String name = resultSet.getString("name");
                int salary = resultSet.getInt("age");

                // Print retrieved values
                System.out.println("ID: " + id + ", Name: " + name + ", Salary: " + salary);
            }

            // Closing resources
            resultSet.close();
            statement.close();
            connection.close();

        } catch (SQLException | ClassNotFoundException e) {
            System.err.println("Connection failed: " + e.getMessage());
        } finally {
            // Close the connection in the finally block to ensure it's closed properly
            try {
                if (connection != null && !connection.isClosed()) {
                    connection.close();
                    System.out.println("Connection closed.");
                }
            } catch (SQLException e) {
                System.err.println("Error closing the connection: " + e.getMessage());
            }
        }

        String db_class = null;
        try {
            db_class = DriverManager.getConnection(host, username, password).getClass().getName();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        System.out.println(db_class);
    }
}
