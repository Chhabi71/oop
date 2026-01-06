package jdvc;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Employee {

    // Database connection constants
    static final String DB_URL = "jdbc:mysql://localhost/user";
    static final String USERNAME = "root";
    static final String PASSWORD = "";

    // Fetch query
    static final String FETCH_QUERY =
            "SELECT id, fullname, employee, salary FROM Employee";

    public static void main(String[] args) {

        try {
            // Establish connection to the database
            Connection connection = DriverManager.getConnection(DB_URL, USERNAME, PASSWORD);
            System.out.print("Connecting to database....");

            Statement stmt = connection.createStatement();
            System.out.println();

            if (connection != null) {
                System.out.println("Database connected successfully!");
            }

//          CREATE TABLE
//
//            String CREATE_TABLE = "CREATE TABLE IF NOT EXISTS Employee (" +
//                    "id INT PRIMARY KEY, " +
//                    "fullname VARCHAR(100), " +
//                    "employee VARCHAR(50), " +
//                    "position VARCHAR(50), " +
//                    "salary DOUBLE" +
//                    ")";
//            stmt.executeUpdate(CREATE_TABLE);
//            System.out.println("Table created successfully!");

//           INSERT DATA

//            String INSERT_QUERY =
//                    "INSERT INTO Employee VALUES (1, 'Ram Sharma', 'Employee', 'Manager', 50000)";
//            stmt.executeUpdate(INSERT_QUERY);
//            System.out.println("Employee inserted successfully!");
//            String INSERT_QUERY1 = "INSERT INTO Employee VALUES (2, 'Ram lal', 'Employee', 'HR', 60000)";
//          stmt.executeUpdate(INSERT_QUERY1);
//          System.out.println("Employee inserted successfully!");

//           FETCH DATA

//            ResultSet rs = stmt.executeQuery(FETCH_QUERY);
//            while (rs.next()) {
//                System.out.print("ID: " + rs.getInt("id"));
//                System.out.print(" | Name: " + rs.getString("fullname"));
//                System.out.print(" | Employee: " + rs.getString("employee"));
//                System.out.print(" | Salary: " + rs.getDouble("salary"));
//                System.out.println();
//            }

//            UPDATE DATA 

            String UPDATE_QUERY =
                    "UPDATE Employee SET fullname = 'Sita Sharma' WHERE id = 1";
            stmt.executeUpdate(UPDATE_QUERY);
            System.out.println("Employee updated successfully!");

//            DELETE DATA 

            String DELETE_QUERY =
                    "DELETE FROM Employee WHERE id = 2";
            stmt.executeUpdate(DELETE_QUERY);
            System.out.println("Employee deleted successfully!");

        } catch (SQLException exc) {
            System.out.println("Something went wrong while connecting to the database.");
            exc.printStackTrace();
        }
    }
}
