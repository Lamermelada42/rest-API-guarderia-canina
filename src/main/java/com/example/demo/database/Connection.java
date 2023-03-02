package com.example.demo.database;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Connection {

    public static void connect() {
        java.sql.Connection connection = null;
        try {
            String url = "jdbc:sqlite:D:/I.D.G/E.S/SQLite/DBGuarderia/Dogcare.db";
            connection = DriverManager.getConnection(url);
            System.out.println("Connected to our database!");

        } catch (SQLException e) {
            System.out.println(e.getMessage());
        } finally {
            try {
                if (connection != null) {
                    connection.close();
                }
            } catch (SQLException ex) {
                System.out.println(ex.getMessage());
            }
        }
    }
}