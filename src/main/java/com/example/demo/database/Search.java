package com.example.demo.database;
import java.sql.DriverManager;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Search {

    private Connection connect() {
        String url = "jdbc:sqlite:D://I.D.G//E.S//SQLite//DBGuarderia//Dogcare.db";
        Connection connection = null;
        try {
            connection = DriverManager.getConnection(url);
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        return connection;
    }


    public void selectAll(){
        String sql = "SELECT * FROM Clients";

        try {
            Connection connection = this.connect();
            Statement stmt  = connection.createStatement();
            ResultSet rs    = stmt.executeQuery(sql);

            while (rs.next()) {
                System.out.println(rs.getString("name") +  "\t" +
                        rs.getString("document") + "\t" +
                        rs.getString("address") + "\t" +
                        rs.getString("pet"));
            }
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }
}  