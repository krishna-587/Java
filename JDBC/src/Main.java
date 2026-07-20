// 1. import java sql packages
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.Statement;
import java.util.*;
public class Main {
    public static void main(String[] args) {

        try {
            // 2. Load the MySQL JDBC driver
            Class.forName("com.mysql.cj.jdbc.Driver");

            // 3. Create a connection to the database
            String url = "jdbc:mysql://localhost:3306/mydatabase?createDatabaseIfNotExist=true";
            String username = "root";
            String password = "password";
            Connection con = DriverManager.getConnection(url, username, password);

            // 4. Create a statement object : using Statement
//            Statement stmt = con.createStatement();
            String sql = "CREATE TABLE IF NOT EXISTS users (id INT PRIMARY KEY AUTO_INCREMENT, name VARCHAR(50), email VARCHAR(50))";
            String insertSql = "INSERT INTO users (name, email) VALUES ('John Doe', 'john@gmail.com'), ('Krishna', 'krishna58@gmail.com')";

            // Using preparedStatement
            PreparedStatement pstmt = con.prepareStatement("INSERT INTO users (name, email) VALUES (?, ?)");
            pstmt.setString(1, "Jane Smith");
            pstmt.setString(2, " smith@gmail.com");
            pstmt.executeUpdate();

            // 5. Execute the SQL statement
//            stmt.executeUpdate(insertSql);

            // 6. Close the statement and connection
//            stmt.close();
            con.close();
            System.out.println("Query executed successfully.");
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}