package com.example.demo.database;

import java.sql.Connection;
import java.sql.DatabaseMetaData;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Creation {

    public static void createNewDatabase(String fileName) {

        String url = "jdbc:sqlite:D:/I.D.G/E.S/SQLite/DBGuarderia/" + fileName;

        try {
            Connection connection = DriverManager.getConnection(url);
            if (connection != null) {
                DatabaseMetaData meta = connection.getMetaData();
                System.out.println("The driver name is " + meta.getDriverName());
                System.out.println("A new database has been created.");
            }

        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }
    public static void createNewTable() {

        String url = "jdbc:sqlite:D://I.D.G/E.S/SQLite/DBGuarderia/Dogcare.db";

        String sql = "CREATE TABLE IF NOT EXISTS Clients (\n"
                + " name text NOT NULL,\n"
                + " document text PRIMARY KEY,\n"
                + " address text NOT NULL,\n"
                + " pet text NOT NULL\n"
                + ");";

        try{
            Connection connection = DriverManager.getConnection(url);
            Statement stmt = connection.createStatement();
            stmt.execute(sql);
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }
}

