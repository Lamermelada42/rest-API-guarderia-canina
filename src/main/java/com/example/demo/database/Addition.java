package com.example.demo.database;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Addition {

    private Connection connect() {
        String url = "jdbc:sqlite:D://I.D.G/E.S/SQLite/DBGuarderia/Dogcare.db";
        Connection connection = null;
        try {
            connection = DriverManager.getConnection(url);
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        return connection;
    }


    public void insert(String name, String document, String address, String pet) {
        String sql = "INSERT INTO Clients(name, document, address, pet) VALUES(?,?,?,?)";

        try{
            Connection connection = this.connect();
            PreparedStatement pstmt = connection.prepareStatement(sql);
            pstmt.setString(1, name);
            pstmt.setString(2, document);
            pstmt.setString(3, address);
            pstmt.setString(4, pet);
            pstmt.executeUpdate();
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }
}