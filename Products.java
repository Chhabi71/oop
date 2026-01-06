package jdvc;

import java.sql.*;  

public class Products {

    // Database connection constants
    static final String DB_URL = "jdbc:mysql://localhost/user";
    static final String USERNAME = "root";
    static final String PASSWORD = "";

    public static void main(String[] args) {

        try {
            //Connect to database
            Connection connection = DriverManager.getConnection(DB_URL, USERNAME, PASSWORD);
            System.out.println("Database connected successfully!");

            Statement stmt = connection.createStatement();

//          DROP TABLE
            stmt.executeUpdate("DROP TABLE IF EXISTS Products");

//          CREATE TABLE
            String CREATE_TABLE =
                    "CREATE TABLE Products (" +
                    "id INT AUTO_INCREMENT PRIMARY KEY, " +
                    "product_name VARCHAR(100), " +
                    "price DOUBLE)";
            stmt.executeUpdate(CREATE_TABLE);
            System.out.println("Products table created successfully.");

//          INSERT DATA
            PreparedStatement pstmt = connection.prepareStatement(
                    "INSERT INTO Products (product_name, price) VALUES (?, ?)"
            );

//          Insert 5 products
            String[] products = {"Laptop", "Mobile", "Headphones", "Keyboard", "Mouse"};
            double[] prices = {80000, 30000, 5000, 2500, 1500};

            for (int i = 0; i < products.length; i++) {
                pstmt.setString(1, products[i]);
                pstmt.setDouble(2, prices[i]);
                pstmt.executeUpdate();
            }
            System.out.println("5 products inserted successfully.");

//          FETCH DATA
            ResultSet rs = stmt.executeQuery("SELECT id, product_name, price FROM Products");
            System.out.println("\nProduct Records:");
            while (rs.next()) {
                System.out.print("ID: " + rs.getInt("id"));
                System.out.print(" | Product: " + rs.getString("product_name"));
                System.out.print(" | Price: " + rs.getDouble("price"));
                System.out.println();
            }

//          UPDATE DATA
            stmt.executeUpdate("UPDATE Products SET price = 9999 WHERE id = 3");
            System.out.println("\nProduct price updated successfully.");

//          DELETE DATA
            stmt.executeUpdate("DELETE FROM Products WHERE id = 4");
            System.out.println("Product deleted successfully.");

        } catch (SQLException e) {
            System.out.println("Something went wrong with the database.");
            e.printStackTrace();
        }
    }
}
