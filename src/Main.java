import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Main {
    public static void main(String[] args) {

        // PostgreSQL connection details
        String url = "jdbc:postgresql://localhost:5432/internship_day1";
        String user = "postgres";
        String password = "Mahek@2005";

        Connection conn = null;
        Statement stmt = null;
        ResultSet rs = null;

        try {
            // Load PostgreSQL JDBC Driver
            Class.forName("org.postgresql.Driver");

            // Connect to PostgreSQL
            conn = DriverManager.getConnection(url, user, password);
            System.out.println("Connected successfully!");

            // Create a simple query
            stmt = conn.createStatement();
            rs = stmt.executeQuery("SELECT version();");

            // Print the result
            if (rs.next()) {
                System.out.println("PostgreSQL Version: " + rs.getString(1));
            }

        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());

        } finally {
            // Close ResultSet
            try {
                if (rs != null) rs.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }

            // Close Statement
            try {
                if (stmt != null) stmt.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }

            // Close Connection
            try {
                if (conn != null) conn.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }
}